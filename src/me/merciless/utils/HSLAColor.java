package me.merciless.utils;

import com.jme3.math.ColorRGBA;

/**
 * @author kwando
 */
final class HSLAColor {

  private float h;
  private float s;
  private float l;
  private float a;
  public static float EPSILON = 0.00001f;

  HSLAColor(float hue, float saturation, float lightness, float alpha) {
    this.h = hue;
    this.s = saturation;
    this.l = lightness;
    this.a = alpha;
  }

  HSLAColor darken(float amount) {
    l = clamp(l - amount, 0, 1);
    return this;
  }

  HSLAColor lighten(float amount) {
    l = clamp(l + amount, 0, 1);
    return this;
  }

  HSLAColor saturate(float amount) {
    s = clamp(s + amount, 0, 1);
    return this;
  }

  HSLAColor desaturate(float amount) {
    s = clamp(s - amount, 0, 1);
    return this;
  }

  ColorRGBA toRGBA(ColorRGBA rgba) {
    float m2 = l <= 0.5f ? l * (s + 1) : l + s - l * s;
    float m1 = l * 2 - m2;

    rgba.r = hueToRGB(m1, m2, h + 1f / 3);
    rgba.g = hueToRGB(m1, m2, h);
    rgba.b = hueToRGB(m1, m2, h - 1f / 3);
    rgba.a = a;

    return rgba;
  }

  ColorRGBA toRGBA() {
    return toRGBA(new ColorRGBA());
  }
  
  public HSLAColor adjustHue(float f) {
    h = (h + f) % 1;
    return this;
  }

  static HSLAColor fromRGBA(ColorRGBA rgba) {
    float M = Math.max(rgba.r, Math.max(rgba.g, rgba.b));
    float m = Math.min(rgba.r, Math.min(rgba.g, rgba.b));

    float C = M - m;

    // Calculate Hue
    float H;
    if (C < EPSILON) {
      H = 0;
    } else if (M == rgba.r) {
      H = ((rgba.g - rgba.b) / C) % 6;
    } else if (M == rgba.g) {
      H = ((rgba.b - rgba.r) / C) + 2;
    } else {
      H = ((rgba.r - rgba.g) / C) + 4;
    }

    H *= 60;

    // Calculate Lightness
    float L = (M + m) / 2f;

    // Calculate Saturation
    float S;
    if (C < EPSILON) {
      S = 0;
    } else {
      if (L < .5f) {
        S = C / (2 * L);
      } else {
        S = C / (2 - 2 * L);
      }
    }

    return new HSLAColor(H / 360f, S, L, rgba.a);
  }

  @Override
  public String toString() {
    return String.format("HSLA[%.2f %.2f %.2f %.2f]", h, s, l, a);
  }

  private static float hueToRGB(float m1, float m2, float h) {
    if (h < 0) {
      h += 1;
    } else if (h > 1) {
      h -= 1;
    }

    float result;
    if (6 * h < 1) {
      result = m1 + (m2 - m1) * h * 6;
    } else if (h * 2 < 1) {
      result = m2;
    } else if (h * 3 < 2) {
      result = m1 + (m2 - m1) * (2f / 3 - h) * 6;
    } else {
      result = m1;
    }

    return result < EPSILON ? 0 : result;
  }

  private static float clamp(float val, float min, float max) {
    return val > max ? max : (val < min ? min : val);
  }
}

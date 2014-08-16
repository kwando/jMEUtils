/*

 */
package me.merciless.utils.color;

import com.jme3.math.ColorRGBA;

/**
 *
 * @author kwando
 */
public class GradientInterpolator {

  private Color[] samples;
  private double dSample;

  private GradientInterpolator(Color[] colors) {
    if (colors == null) {
      throw new IllegalArgumentException("color array cannot be null");
    }
    if (colors.length < 2) {
      throw new IllegalArgumentException("interpolator needs at least 2 colors..");
    }
    this.samples = colors;
    this.dSample = 1.0 / (colors.length - 1);
  }

  public ColorRGBA colorAt(float alpha, ColorRGBA rgba) {
    Color tmp = colorAt(alpha, new Color());
    return rgba.set((float) tmp.x, (float) tmp.y, (float) tmp.z, rgba.a);
  }

  public Color colorAt(float alpha, Color color) {
    if (alpha <= 0.0) {
      return color.set(samples[0]);
    }
    if (alpha >= 1.0) {
      return color.set(samples[samples.length - 1]);
    }

    int index = (int) (alpha / dSample);
    float subsample = (float) (alpha % dSample);

    return samples[index].lerp(samples[index + 1], subsample, color);
  }

  public static GradientInterpolator fromArray(Color[] colors) {
    return new GradientInterpolator(colors);
  }
}

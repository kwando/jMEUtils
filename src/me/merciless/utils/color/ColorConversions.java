/*

 */
package me.merciless.utils.color;

import static me.merciless.utils.HSLAColor.EPSILON;

/**
 *
 * @author kwando
 */
public class ColorConversions {

  public static Color XYZtoLAB(Color xyz, Color out) {
    assert xyz != null;
    assert out != null;
    assert xyz.colorSpace == Color.XYZ;
    double x = xyz.x / 95.047;
    double y = xyz.y / 100;
    double z = xyz.z / 108.883;
    if (x > 0.008856) {
      x = Math.pow(x, 1.0 / 3.0);
    } else {
      x = (7.787 * x) + (16.0 / 116.0);
    }
    if (y > 0.008856) {
      y = Math.pow(y, 1.0 / 3.0);
    } else {
      y = (7.787 * y) + (16.0 / 116.0);
    }
    if (z > 0.008856) {
      z = Math.pow(z, 1.0 / 3.0);
    } else {
      z = (7.787 * z) + (16.0 / 116.0);
    }
    if (y > 0.008856) {
      out.x = (116 * y) - 16;
    } else {
      out.x = 903.3 * y;
    }
    out.y = 500 * (x - y);
    out.z = 200 * (y - z);
    out.colorSpace = Color.LAB;
    return out;
  }

  public static Color LABtoLCH(Color lab, Color out) {
    assert lab != null;
    assert out != null;
    assert lab.colorSpace == Color.LAB;
    double h = Math.atan2(lab.z, lab.y);
    if (h > 0) {
      h = (h / Math.PI) * 180.0;
    } else {
      h = 360 - (Math.abs(h) / Math.PI) * 180.0;
    }
    out.x = lab.x;
    out.y = Math.sqrt(Math.pow(lab.y, 2) + Math.pow(lab.z, 2));
    out.z = h < 360 ? h : (h - 360.0);
    out.colorSpace = Color.LCH;
    return out;
  }

  public static Color XYZtoRGB(Color xyz, Color out) {
    assert xyz != null;
    assert out != null;
    assert xyz.colorSpace == Color.XYZ;
    double x = xyz.x / 100;
    double y = xyz.y / 100;
    double z = xyz.z / 100;
    double r = x * 3.2406 + y * -1.5372 + z * -0.4986;
    double g = x * -0.9689 + y * 1.8758 + z * 0.0415;
    double b = x * 0.0557 + y * -0.204 + z * 1.057;
    if (r > 0.0031308) {
      r = 1.055 * Math.pow(r, 1 / 2.4) - 0.055;
    } else {
      r = 12.92 * r;
    }
    if (g > 0.0031308) {
      g = 1.055 * Math.pow(g, 1 / 2.4) - 0.055;
    } else {
      g = 12.92 * g;
    }
    if (b > 0.0031308) {
      b = 1.055 * Math.pow(b, 1 / 2.4) - 0.055;
    } else {
      b = 12.92 * b;
    }
    out.x = r;
    out.y = g;
    out.z = b;
    out.colorSpace = Color.RGB;
    return out;
  }

  public static Color RGBtoXYZ(Color rgb, Color out) {
    double tmpR = rgb.x;
    double tmpG = rgb.y;
    double tmpB = rgb.z;
    if (tmpR > 0.04045) {
      tmpR = Math.pow((tmpR + 0.055) / 1.055, 2.4);
    } else {
      tmpR = tmpR / 12.92;
    }
    if (tmpG > 0.04045) {
      tmpG = Math.pow((tmpG + 0.055) / 1.055, 2.4);
    } else {
      tmpG = tmpG / 12.92;
    }
    if (tmpB > 0.04045) {
      tmpB = (float) Math.pow((tmpB + 0.055) / 1.055, 2.4);
    } else {
      tmpB = tmpB / 12.92;
    }
    tmpR = tmpR * 100;
    tmpG = tmpG * 100;
    tmpB = tmpB * 100;
    out.x = tmpR * 0.4124 + tmpG * 0.3576 + tmpB * 0.1805;
    out.y = tmpR * 0.2126 + tmpG * 0.7152 + tmpB * 0.0722;
    out.z = tmpR * 0.0193 + tmpG * 0.1192 + tmpB * 0.9505;
    out.colorSpace = Color.XYZ;
    return out;
  }

  public static Color LABtoXYZ(Color lab, Color out) {
    assert lab != null;
    assert out != null;
    assert lab.colorSpace == Color.LAB;
    double refX = 95.047;
    double refY = 100;
    double refZ = 108.883;
    double varY = (lab.x + 16) / 116;
    double varX = lab.y / 500 + varY;
    double varZ = varY - lab.z / 200;
    if (Math.pow(varY, 3) > 0.008856) {
      varY = Math.pow(varY, 3);
    } else {
      varY = (varY - 16 / 116) / 7.787;
    }
    if (Math.pow(varX, 3) > 0.008856) {
      varX = Math.pow(varX, 3);
    } else {
      varX = (varX - 16 / 116) / 7.787;
    }
    if (Math.pow(varZ, 3) > 0.008856) {
      varZ = Math.pow(varZ, 3);
    } else {
      varZ = (varZ - 16 / 116) / 7.787;
    }
    out.x = refX * varX;
    out.y = refY * varY;
    out.z = refZ * varZ;
    out.colorSpace = Color.XYZ;
    return out;
  }

  public static Color LCHtoLAB(Color lch, Color out) {
    assert lch != null;
    assert out != null;
    assert lch.colorSpace == Color.LCH;
    double l = lch.x;
    double hradi = lch.z * (Math.PI / 180);
    double a = Math.cos(hradi) * lch.y;
    double b = Math.sin(hradi) * lch.y;
    out.x = l;
    out.y = a;
    out.z = b;
    out.colorSpace = Color.LAB;
    return out;
  }

  public static Color RGBtoHSL(Color rgb, Color out) {
    assert rgb != null;
    assert out != null;
    assert rgb.colorSpace == Color.RGB;
    double M = Math.max(rgb.x, Math.max(rgb.y, rgb.z));
    double m = Math.min(rgb.x, Math.min(rgb.y, rgb.z));
    double C = M - m;
    double H;
    if (C < EPSILON) {
      H = 0;
    } else if (M == rgb.x) {
      H = ((rgb.y - rgb.z) / C) % 6;
    } else if (M == rgb.z) {
      H = ((rgb.z - rgb.x) / C) + 2;
    } else {
      H = ((rgb.x - rgb.y) / C) + 4;
    }
    H *= 60;
    double L = (M + m) / 2.0;
    double S;
    if (C < EPSILON) {
      S = 0;
    } else {
      if (L < .5) {
        S = C / (2 * L);
      } else {
        S = C / (2 - 2 * L);
      }
    }
    out.x = H / 360;
    out.y = S;
    out.z = L;
    out.colorSpace = Color.HSL;
    return out;
  }

  public static Color HSLtoRGB(Color hsl, Color out) {
    double h = hsl.x;
    double s = hsl.y;
    double l = hsl.z;
    double m2 = l <= 0.5f ? l * (s + 1) : l + s - l * s;
    double m1 = l * 2 - m2;
    out.x = hueToRGB(m1, m2, h + 1f / 3);
    out.y = hueToRGB(m1, m2, h);
    out.z = hueToRGB(m1, m2, h - 1f / 3);
    out.colorSpace = Color.RGB;
    return out;
  }

  private static double hueToRGB(double m1, double m2, double h) {
    if (h < 0) {
      h += 1;
    } else if (h > 1) {
      h -= 1;
    }
    double result;
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

  public static Color RGBtoLCH(Color rgb, Color out) {
    assert rgb.colorSpace == Color.RGB;
    return LABtoLCH(XYZtoLAB(RGBtoXYZ(rgb.clamp(0.0, 1.0), out), out), out);
  }
  
  public static Color LCHtoRGB(Color lch, Color out) {
    assert lch.colorSpace == Color.LCH;
    return XYZtoRGB(LABtoXYZ(LCHtoLAB(lch, out), out), out).clamp(0.0, 1.0);
  }
}

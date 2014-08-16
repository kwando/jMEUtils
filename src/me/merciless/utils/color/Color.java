/*

 */
package me.merciless.utils.color;

/**
 *
 * @author kwando
 */
public class Color {

  public static final int RGB = -1;
  public static final int XYZ = 1;
  public static final int LAB = 2;
  public static final int LCH = 3;
  public static final int HSL = 4;
  int colorSpace;
  double x;
  double y;
  double z;

  public Color(double x, double y, double z, int space) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.colorSpace = space;
  }

  public Color() {
    this(0, 0, 0, RGB);
  }

  public Color clamp(double min, double max) {
    x = Math.min(Math.max(x, min), max);
    y = Math.min(Math.max(y, min), max);
    z = Math.min(Math.max(z, min), max);
    return this;
  }

  public Color scale(double scale) {
    x = scale * x;
    y = scale * y;
    z = scale * z;
    return this;
  }

  public Color clone() {
    return new Color(x, y, z, colorSpace);
  }

  public Color set(Color color) {
    x = color.x;
    y = color.y;
    z = color.z;
    return this;
  }

  public Color set(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
    return this;
  }

  public Color set(double x, double y, double z, int colorSpace) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.colorSpace = colorSpace;
    return this;
  }

  public Color lerp(Color other, double alpha, Color out) {
    if (colorSpace != other.colorSpace) {
      throw new IllegalArgumentException("cannot lerp through different colorspaces...");
    }
    out.x = lerp(x, other.x, alpha);
    out.y = lerp(y, other.y, alpha);
    out.z = lerp(z, other.z, alpha);
    out.colorSpace = colorSpace;
    return out;
  }

  private double lerp(double a, double b, double alpha) {
    return b * alpha + (1.0 - alpha) * a;
  }

  public String toString() {
    String name = null;
    switch (this.colorSpace) {
      case RGB:
        name = "RGB";
        break;
      case XYZ:
        name = "XYZ";
        break;
      case LAB:
        name = "LAB";
        break;
      case LCH:
        name = "LCH";
        break;
      case HSL:
        name = "HSL";
        break;
      default:
        name = "UNKNOWN";
    }
    return String.format("%s(%.2f %.2f %.2f)", name, x, y, z);
  }

  public int getColorSpace() {
    return colorSpace;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getZ() {
    return z;
  }

  public static Color RGB(double r, double g, double b) {
    return new Color(r, g, b, RGB).clamp(0.0, 1.0);
  }

  public static Color RGB255(double r, double g, double b) {
    return new Color(r, g, b, RGB).scale(1.0 / 255).clamp(0.0, 1.0);
  }

  public static Color HEX(int hex) {
    return RGB255((hex & 0xff0000) % 0xffff, (hex & 0xFF00) % 0xFF, hex & 0xFF);
  }
}

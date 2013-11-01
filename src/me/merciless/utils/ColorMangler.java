package me.merciless.utils;

import com.jme3.math.ColorRGBA;

/**
 *
 * @author kwando
 */
public class ColorMangler {

  /**
   * Darkens the input color by darken amount
   *
   * @param color
   * @param amount
   * @return darkened color
   */
  public static ColorRGBA darken(ColorRGBA color, float amount) {
    return HSLAColor.fromRGBA(color).adjustLightness(-amount).toRGBA(color);
  }

  /**
   * Lightens the color
   *
   * @param color
   * @param amount
   * @return lightened color
   */
  public static ColorRGBA lighten(ColorRGBA color, float amount) {
    return HSLAColor.fromRGBA(color).adjustLightness(amount).toRGBA(color);
  }

  /**
   * Saturates color
   *
   * @param color
   * @param amount
   * @return saturated color
   */
  public static ColorRGBA saturate(ColorRGBA color, float amount) {
    return HSLAColor.fromRGBA(color).adjustSaturation(amount).toRGBA(color);
  }

  /**
   * Desaturates the color by amount
   *
   * @param color
   * @param amount
   * @return desaturated color
   */
  public static ColorRGBA desaturate(ColorRGBA color, float amount) {
    return HSLAColor.fromRGBA(color).adjustSaturation(-amount).toRGBA(color);
  }

  /**
   * Converts color into grayscale
   *
   * @param color
   * @return grayscale color
   */
  public static ColorRGBA grayscale(ColorRGBA color) {
    return HSLAColor.fromRGBA(color).adjustSaturation(-1).toRGBA(color);
  }

  /**
   * Invert the color
   *
   * @param color
   * @return inverted color
   */
  public static ColorRGBA invert(ColorRGBA color) {
    color.r = 1 - color.r;
    color.g = 1 - color.g;
    color.b = 1 - color.b;
    return color;
  }

  /**
   * Sets the color to its complement color
   *
   * @param color
   * @return the complement color
   */
  public static ColorRGBA complement(ColorRGBA color) {
    return HSLAColor.fromRGBA(color).adjustHue(.5f).toRGBA(color);
  }

  /**
   * Tints the given color (adding white).
   *
   * @param color
   * @return the tinted color
   */
  public static ColorRGBA tint(ColorRGBA color, float tint) {
    color.interpolate(color, ColorRGBA.White, tint);
    return color;
  }

  /**
   * Tints the given color (adding black).
   *
   * @param color
   * @param shade the amount to shade
   * @return the tinted color
   */
  public static ColorRGBA shade(ColorRGBA color, float shade) {
    color.interpolate(color, ColorRGBA.Black, shade);
    return color;
  }
}

/*

 */
package me.merciless.utils;

import com.jme3.math.ColorRGBA;
import me.merciless.utils.color.Color;

/**
 *
 * @author kwando
 */
public class ColorHelper {

  private ColorHelper() {
  }

  public static Color Color(ColorRGBA rgba) {
    return new Color(rgba.r, rgba.g, rgba.b, Color.RGB);
  }

  public static Color Color(ColorRGBA rgba, Color color) {
    return color.set(rgba.r, rgba.g, rgba.b, Color.RGB);
  }

  public static ColorRGBA JMEColor(Color color) {
    return JMEColor(color, new ColorRGBA());
  }

  public static ColorRGBA JMEColor(Color color, ColorRGBA rgba) {
    return rgba.set((float) color.getX(), (float) color.getY(), (float) color.getZ(), 1);
  }

  public static ColorRGBA[] colorArray(Color[] colors) {
    ColorRGBA[] result = new ColorRGBA[colors.length];
    for (int i = 0; i < colors.length; i++) {
      result[i] = JMEColor(colors[i]);
    }
    return result;
  }
}

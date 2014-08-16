/*

 */
package me.merciless.utils.tests;

import com.jme3.math.ColorRGBA;
import java.util.Locale;
import me.merciless.utils.color.CSSColor;
import me.merciless.utils.color.Color;
import static me.merciless.utils.color.ColorConversions.*;
import me.merciless.utils.color.GradientInterpolator;
import me.merciless.utils.color.GradientFactory;

/**
 *
 * @author kwando
 */
public class GradientTest {

  public static void main(String[] arg) {
    calculateColors(CSSColor.RoyalBlue);

    int samples = 5;
    Color startColor = toColor(CSSColor.Coral);
    Color endColor = toColor(CSSColor.Turquoise);

    System.out.println(startColor.clone().scale(255));
    System.out.println(endColor.clone().scale(255));
    
    GradientInterpolator gradient = GradientInterpolator.fromArray(GradientFactory.LCH(startColor, endColor, 3));

    ColorRGBA color = new ColorRGBA();
    int N = 8;
    System.out.print("background: -webkit-linear-gradient(left");
    for (int i = 0; i < N; i++) {
      float alpha = (float) (1.0 / (N - 1) * i);
      gradient.colorAt(alpha, color);
      //System.out.printf("alpha: %.2f %s\n", alpha, color);
      color.multLocal(255);

      System.out.printf(Locale.US, ",rgba(%.0f, %.0f, %.0f, 1.0) %.0f%%", color.r, color.g, color.b, alpha * 100);
    }
    System.out.println(");");
  }

  public static Color toColor(ColorRGBA rgba) {
    return new Color(rgba.r, rgba.g, rgba.b, Color.RGB);
  }

  public static String c(double c) {
    return String.format(Locale.US, "%.4f", c);
  }

  public static void calculateColors(ColorRGBA rgba) {
    Color color = new Color(rgba.r, rgba.g, rgba.b, Color.RGB);
    System.out.println(color.clone().scale(255));

    RGBtoXYZ(color, color);
    System.out.println(color);

    XYZtoLAB(color, color);
    System.out.println(color);

    LABtoLCH(color, color);
    System.out.println(color);

    System.out.println("----");
  }

  public static Color[] hcl(Color c1, Color c2, int numberOfColors) {

    Color[] colors = new Color[numberOfColors];
    colors[0] = RGBtoLCH(c1, c1.clone());
    colors[colors.length - 1] = RGBtoLCH(c2, c2.clone());
    for (int i = 0; i < numberOfColors - 2; i++) {
    }
    return colors;
  }
}

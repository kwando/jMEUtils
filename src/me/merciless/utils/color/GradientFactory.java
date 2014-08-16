/*

 */
package me.merciless.utils.color;

import static me.merciless.utils.color.ColorConversions.*;

/**
 *
 * @author kwando
 */
public class GradientFactory {

  public static Color[] LCH(Color c1, Color c2, int samples) {
    if (samples == 1) {
      return new Color[]{
        RGBtoLCH(c1, new Color())
        .lerp(RGBtoLCH(c2, new Color()), .5, new Color())
      };
    }

    Color[] gradient = new Color[samples];

    Color A = gradient[0] = RGBtoLCH(c1, new Color());
    Color B = gradient[gradient.length - 1] = RGBtoLCH(c2, new Color());
    Color tmp = new Color();

    double dSample = 1.0 / (samples - 1);
    double alpha = dSample;

    for (int i = 0; i < samples - 2; i++) {
      Color color = gradient[i + 1] = new Color();
      A.lerp(B, alpha, color);
      alpha += dSample;
    }

    // Convert colors back to RGB space
    for (int i = 0; i < gradient.length; i++) {
      Color c = gradient[i];
      LCHtoRGB(c, c);
    }

    return gradient;
  }
}

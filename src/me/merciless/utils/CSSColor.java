/*
 * This file is strictly bounded by Corvus Corax Entertainment and its prohibited
 * for commercial use, or any use what so ever.
 * This application can be ran only by an Corvus - Corax Employee
 * Copyright © Corvus Corax 2013
 */
package me.merciless.utils;

import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;

import java.lang.reflect.Field;

/**
 * @author scorn
 */
public class CSSColor {

  public static final ColorRGBA AliceBlue = new ColorRGBA(0.9411765f, 0.972549f, 1.0f, 1f);
  public static final ColorRGBA AntiqueWhite = new ColorRGBA(0.98039216f, 0.92156863f, 0.84313726f, 1f);
  public static final ColorRGBA Aqua = new ColorRGBA(0.0f, 1.0f, 1.0f, 1f);
  public static final ColorRGBA Aquamarine = new ColorRGBA(0.49803922f, 1.0f, 0.83137256f, 1f);
  public static final ColorRGBA Azure = new ColorRGBA(0.9411765f, 1.0f, 1.0f, 1f);
  public static final ColorRGBA Beige = new ColorRGBA(0.9607843f, 0.9607843f, 0.8627451f, 1f);
  public static final ColorRGBA Bisque = new ColorRGBA(1.0f, 0.89411765f, 0.76862746f, 1f);
  public static final ColorRGBA Black = new ColorRGBA(0.0f, 0.0f, 0.0f, 1f);
  public static final ColorRGBA BlanchedAlmond = new ColorRGBA(1.0f, 0.92156863f, 0.8039216f, 1f);
  public static final ColorRGBA Blue = new ColorRGBA(0.0f, 0.0f, 1.0f, 1f);
  public static final ColorRGBA BlueViolet = new ColorRGBA(0.5411765f, 0.16862746f, 0.8862745f, 1f);
  public static final ColorRGBA Brown = new ColorRGBA(0.64705884f, 0.16470589f, 0.16470589f, 1f);
  public static final ColorRGBA BurlyWood = new ColorRGBA(0.87058824f, 0.72156864f, 0.5294118f, 1f);
  public static final ColorRGBA CadetBlue = new ColorRGBA(0.37254903f, 0.61960787f, 0.627451f, 1f);
  public static final ColorRGBA Chartreuse = new ColorRGBA(0.49803922f, 1.0f, 0.0f, 1f);
  public static final ColorRGBA Chocolate = new ColorRGBA(0.8235294f, 0.4117647f, 0.11764706f, 1f);
  public static final ColorRGBA Coral = new ColorRGBA(1.0f, 0.49803922f, 0.3137255f, 1f);
  public static final ColorRGBA CornflowerBlue = new ColorRGBA(0.39215687f, 0.58431375f, 0.92941177f, 1f);
  public static final ColorRGBA Cornsilk = new ColorRGBA(1.0f, 0.972549f, 0.8627451f, 1f);
  public static final ColorRGBA Crimson = new ColorRGBA(0.8627451f, 0.078431375f, 0.23529412f, 1f);
  public static final ColorRGBA Cyan = new ColorRGBA(0.0f, 1.0f, 1.0f, 1f);
  public static final ColorRGBA DarkBlue = new ColorRGBA(0.0f, 0.0f, 0.54509807f, 1f);
  public static final ColorRGBA DarkCyan = new ColorRGBA(0.0f, 0.54509807f, 0.54509807f, 1f);
  public static final ColorRGBA DarkGoldenRod = new ColorRGBA(0.72156864f, 0.5254902f, 0.043137256f, 1f);
  public static final ColorRGBA DarkGray = new ColorRGBA(0.6627451f, 0.6627451f, 0.6627451f, 1f);
  public static final ColorRGBA DarkGreen = new ColorRGBA(0.0f, 0.39215687f, 0.0f, 1f);
  public static final ColorRGBA DarkKhaki = new ColorRGBA(0.7411765f, 0.7176471f, 0.41960785f, 1f);
  public static final ColorRGBA DarkMagenta = new ColorRGBA(0.54509807f, 0.0f, 0.54509807f, 1f);
  public static final ColorRGBA DarkOliveGreen = new ColorRGBA(0.33333334f, 0.41960785f, 0.18431373f, 1f);
  public static final ColorRGBA DarkOrange = new ColorRGBA(1.0f, 0.54901963f, 0.0f, 1f);
  public static final ColorRGBA DarkOrchid = new ColorRGBA(0.6f, 0.19607843f, 0.8f, 1f);
  public static final ColorRGBA DarkRed = new ColorRGBA(0.54509807f, 0.0f, 0.0f, 1f);
  public static final ColorRGBA DarkSalmon = new ColorRGBA(0.9137255f, 0.5882353f, 0.47843137f, 1f);
  public static final ColorRGBA DarkSeaGreen = new ColorRGBA(0.56078434f, 0.7372549f, 0.56078434f, 1f);
  public static final ColorRGBA DarkSlateBlue = new ColorRGBA(0.28235295f, 0.23921569f, 0.54509807f, 1f);
  public static final ColorRGBA DarkSlateGray = new ColorRGBA(0.18431373f, 0.30980393f, 0.30980393f, 1f);
  public static final ColorRGBA DarkTurquoise = new ColorRGBA(0.0f, 0.80784315f, 0.81960785f, 1f);
  public static final ColorRGBA DarkViolet = new ColorRGBA(0.5803922f, 0.0f, 0.827451f, 1f);
  public static final ColorRGBA DeepPink = new ColorRGBA(1.0f, 0.078431375f, 0.5764706f, 1f);
  public static final ColorRGBA DeepSkyBlue = new ColorRGBA(0.0f, 0.7490196f, 1.0f, 1f);
  public static final ColorRGBA DimGray = new ColorRGBA(0.4117647f, 0.4117647f, 0.4117647f, 1f);
  public static final ColorRGBA DodgerBlue = new ColorRGBA(0.11764706f, 0.5647059f, 1.0f, 1f);
  public static final ColorRGBA FireBrick = new ColorRGBA(0.69803923f, 0.13333334f, 0.13333334f, 1f);
  public static final ColorRGBA FloralWhite = new ColorRGBA(1.0f, 0.98039216f, 0.9411765f, 1f);
  public static final ColorRGBA ForestGreen = new ColorRGBA(0.13333334f, 0.54509807f, 0.13333334f, 1f);
  public static final ColorRGBA Fuchsia = new ColorRGBA(1.0f, 0.0f, 1.0f, 1f);
  public static final ColorRGBA Gainsboro = new ColorRGBA(0.8627451f, 0.8627451f, 0.8627451f, 1f);
  public static final ColorRGBA GhostWhite = new ColorRGBA(0.972549f, 0.972549f, 1.0f, 1f);
  public static final ColorRGBA Gold = new ColorRGBA(1.0f, 0.84313726f, 0.0f, 1f);
  public static final ColorRGBA GoldenRod = new ColorRGBA(0.85490197f, 0.64705884f, 0.1254902f, 1f);
  public static final ColorRGBA Gray = new ColorRGBA(0.5019608f, 0.5019608f, 0.5019608f, 1f);
  public static final ColorRGBA Green = new ColorRGBA(0.0f, 0.5019608f, 0.0f, 1f);
  public static final ColorRGBA GreenYellow = new ColorRGBA(0.6784314f, 1.0f, 0.18431373f, 1f);
  public static final ColorRGBA HoneyDew = new ColorRGBA(0.9411765f, 1.0f, 0.9411765f, 1f);
  public static final ColorRGBA HotPink = new ColorRGBA(1.0f, 0.4117647f, 0.7058824f, 1f);
  public static final ColorRGBA IndianRed = new ColorRGBA(0.8039216f, 0.36078432f, 0.36078432f, 1f);
  public static final ColorRGBA Indigo = new ColorRGBA(0.29411766f, 0.0f, 0.50980395f, 1f);
  public static final ColorRGBA Ivory = new ColorRGBA(1.0f, 1.0f, 0.9411765f, 1f);
  public static final ColorRGBA Khaki = new ColorRGBA(0.9411765f, 0.9019608f, 0.54901963f, 1f);
  public static final ColorRGBA Lavender = new ColorRGBA(0.9019608f, 0.9019608f, 0.98039216f, 1f);
  public static final ColorRGBA LavenderBlush = new ColorRGBA(1.0f, 0.9411765f, 0.9607843f, 1f);
  public static final ColorRGBA LawnGreen = new ColorRGBA(0.4862745f, 0.9882353f, 0.0f, 1f);
  public static final ColorRGBA LemonChiffon = new ColorRGBA(1.0f, 0.98039216f, 0.8039216f, 1f);
  public static final ColorRGBA LightBlue = new ColorRGBA(0.6784314f, 0.84705883f, 0.9019608f, 1f);
  public static final ColorRGBA LightCoral = new ColorRGBA(0.9411765f, 0.5019608f, 0.5019608f, 1f);
  public static final ColorRGBA LightCyan = new ColorRGBA(0.8784314f, 1.0f, 1.0f, 1f);
  public static final ColorRGBA LightGoldenRodYellow = new ColorRGBA(0.98039216f, 0.98039216f, 0.8235294f, 1f);
  public static final ColorRGBA LightGray = new ColorRGBA(0.827451f, 0.827451f, 0.827451f, 1f);
  public static final ColorRGBA LightGreen = new ColorRGBA(0.5647059f, 0.93333334f, 0.5647059f, 1f);
  public static final ColorRGBA LightPink = new ColorRGBA(1.0f, 0.7137255f, 0.75686276f, 1f);
  public static final ColorRGBA LightSalmon = new ColorRGBA(1.0f, 0.627451f, 0.47843137f, 1f);
  public static final ColorRGBA LightSeaGreen = new ColorRGBA(0.1254902f, 0.69803923f, 0.6666667f, 1f);
  public static final ColorRGBA LightSkyBlue = new ColorRGBA(0.5294118f, 0.80784315f, 0.98039216f, 1f);
  public static final ColorRGBA LightSlateGray = new ColorRGBA(0.46666667f, 0.53333336f, 0.6f, 1f);
  public static final ColorRGBA LightSteelBlue = new ColorRGBA(0.6901961f, 0.76862746f, 0.87058824f, 1f);
  public static final ColorRGBA LightYellow = new ColorRGBA(1.0f, 1.0f, 0.8784314f, 1f);
  public static final ColorRGBA Lime = new ColorRGBA(0.0f, 1.0f, 0.0f, 1f);
  public static final ColorRGBA LimeGreen = new ColorRGBA(0.19607843f, 0.8039216f, 0.19607843f, 1f);
  public static final ColorRGBA Linen = new ColorRGBA(0.98039216f, 0.9411765f, 0.9019608f, 1f);
  public static final ColorRGBA Magenta = new ColorRGBA(1.0f, 0.0f, 1.0f, 1f);
  public static final ColorRGBA Maroon = new ColorRGBA(0.5019608f, 0.0f, 0.0f, 1f);
  public static final ColorRGBA MediumAquaMarine = new ColorRGBA(0.4f, 0.8039216f, 0.6666667f, 1f);
  public static final ColorRGBA MediumBlue = new ColorRGBA(0.0f, 0.0f, 0.8039216f, 1f);
  public static final ColorRGBA MediumOrchid = new ColorRGBA(0.7294118f, 0.33333334f, 0.827451f, 1f);
  public static final ColorRGBA MediumPurple = new ColorRGBA(0.5764706f, 0.4392157f, 0.85882354f, 1f);
  public static final ColorRGBA MediumSeaGreen = new ColorRGBA(0.23529412f, 0.7019608f, 0.44313726f, 1f);
  public static final ColorRGBA MediumSlateBlue = new ColorRGBA(0.48235294f, 0.40784314f, 0.93333334f, 1f);
  public static final ColorRGBA MediumSpringGreen = new ColorRGBA(0.0f, 0.98039216f, 0.6039216f, 1f);
  public static final ColorRGBA MediumTurquoise = new ColorRGBA(0.28235295f, 0.81960785f, 0.8f, 1f);
  public static final ColorRGBA MediumVioletRed = new ColorRGBA(0.78039217f, 0.08235294f, 0.52156866f, 1f);
  public static final ColorRGBA MidnightBlue = new ColorRGBA(0.09803922f, 0.09803922f, 0.4392157f, 1f);
  public static final ColorRGBA MintCream = new ColorRGBA(0.9607843f, 1.0f, 0.98039216f, 1f);
  public static final ColorRGBA MistyRose = new ColorRGBA(1.0f, 0.89411765f, 0.88235295f, 1f);
  public static final ColorRGBA Moccasin = new ColorRGBA(1.0f, 0.89411765f, 0.70980394f, 1f);
  public static final ColorRGBA NavajoWhite = new ColorRGBA(1.0f, 0.87058824f, 0.6784314f, 1f);
  public static final ColorRGBA Navy = new ColorRGBA(0.0f, 0.0f, 0.5019608f, 1f);
  public static final ColorRGBA OldLace = new ColorRGBA(0.99215686f, 0.9607843f, 0.9019608f, 1f);
  public static final ColorRGBA Olive = new ColorRGBA(0.5019608f, 0.5019608f, 0.0f, 1f);
  public static final ColorRGBA OliveDrab = new ColorRGBA(0.41960785f, 0.5568628f, 0.13725491f, 1f);
  public static final ColorRGBA Orange = new ColorRGBA(1.0f, 0.64705884f, 0.0f, 1f);
  public static final ColorRGBA OrangeRed = new ColorRGBA(1.0f, 0.27058825f, 0.0f, 1f);
  public static final ColorRGBA Orchid = new ColorRGBA(0.85490197f, 0.4392157f, 0.8392157f, 1f);
  public static final ColorRGBA PaleGoldenRod = new ColorRGBA(0.93333334f, 0.9098039f, 0.6666667f, 1f);
  public static final ColorRGBA PaleGreen = new ColorRGBA(0.59607846f, 0.9843137f, 0.59607846f, 1f);
  public static final ColorRGBA PaleTurquoise = new ColorRGBA(0.6862745f, 0.93333334f, 0.93333334f, 1f);
  public static final ColorRGBA PaleVioletRed = new ColorRGBA(0.85882354f, 0.4392157f, 0.5764706f, 1f);
  public static final ColorRGBA PapayaWhip = new ColorRGBA(1.0f, 0.9372549f, 0.8352941f, 1f);
  public static final ColorRGBA PeachPuff = new ColorRGBA(1.0f, 0.85490197f, 0.7254902f, 1f);
  public static final ColorRGBA Peru = new ColorRGBA(0.8039216f, 0.52156866f, 0.24705882f, 1f);
  public static final ColorRGBA Pink = new ColorRGBA(1.0f, 0.7529412f, 0.79607844f, 1f);
  public static final ColorRGBA Plum = new ColorRGBA(0.8666667f, 0.627451f, 0.8666667f, 1f);
  public static final ColorRGBA PowderBlue = new ColorRGBA(0.6901961f, 0.8784314f, 0.9019608f, 1f);
  public static final ColorRGBA Purple = new ColorRGBA(0.5019608f, 0.0f, 0.5019608f, 1f);
  public static final ColorRGBA Red = new ColorRGBA(1.0f, 0.0f, 0.0f, 1f);
  public static final ColorRGBA RosyBrown = new ColorRGBA(0.7372549f, 0.56078434f, 0.56078434f, 1f);
  public static final ColorRGBA RoyalBlue = new ColorRGBA(0.25490198f, 0.4117647f, 0.88235295f, 1f);
  public static final ColorRGBA SaddleBrown = new ColorRGBA(0.54509807f, 0.27058825f, 0.07450981f, 1f);
  public static final ColorRGBA Salmon = new ColorRGBA(0.98039216f, 0.5019608f, 0.44705883f, 1f);
  public static final ColorRGBA SandyBrown = new ColorRGBA(0.95686275f, 0.6431373f, 0.3764706f, 1f);
  public static final ColorRGBA SeaGreen = new ColorRGBA(0.18039216f, 0.54509807f, 0.34117648f, 1f);
  public static final ColorRGBA SeaShell = new ColorRGBA(1.0f, 0.9607843f, 0.93333334f, 1f);
  public static final ColorRGBA Sienna = new ColorRGBA(0.627451f, 0.32156864f, 0.1764706f, 1f);
  public static final ColorRGBA Silver = new ColorRGBA(0.7529412f, 0.7529412f, 0.7529412f, 1f);
  public static final ColorRGBA SkyBlue = new ColorRGBA(0.5294118f, 0.80784315f, 0.92156863f, 1f);
  public static final ColorRGBA SlateBlue = new ColorRGBA(0.41568628f, 0.3529412f, 0.8039216f, 1f);
  public static final ColorRGBA SlateGray = new ColorRGBA(0.4392157f, 0.5019608f, 0.5647059f, 1f);
  public static final ColorRGBA Snow = new ColorRGBA(1.0f, 0.98039216f, 0.98039216f, 1f);
  public static final ColorRGBA SpringGreen = new ColorRGBA(0.0f, 1.0f, 0.49803922f, 1f);
  public static final ColorRGBA SteelBlue = new ColorRGBA(0.27450982f, 0.50980395f, 0.7058824f, 1f);
  public static final ColorRGBA Tan = new ColorRGBA(0.8235294f, 0.7058824f, 0.54901963f, 1f);
  public static final ColorRGBA Teal = new ColorRGBA(0.0f, 0.5019608f, 0.5019608f, 1f);
  public static final ColorRGBA Thistle = new ColorRGBA(0.84705883f, 0.7490196f, 0.84705883f, 1f);
  public static final ColorRGBA Tomato = new ColorRGBA(1.0f, 0.3882353f, 0.2784314f, 1f);
  public static final ColorRGBA Turquoise = new ColorRGBA(0.2509804f, 0.8784314f, 0.8156863f, 1f);
  public static final ColorRGBA Violet = new ColorRGBA(0.93333334f, 0.50980395f, 0.93333334f, 1f);
  public static final ColorRGBA Wheat = new ColorRGBA(0.9607843f, 0.87058824f, 0.7019608f, 1f);
  public static final ColorRGBA White = new ColorRGBA(1.0f, 1.0f, 1.0f, 1f);
  public static final ColorRGBA WhiteSmoke = new ColorRGBA(0.9607843f, 0.9607843f, 0.9607843f, 1f);
  public static final ColorRGBA Yellow = new ColorRGBA(1.0f, 1.0f, 0.0f, 1f);
  public static final ColorRGBA YellowGreen = new ColorRGBA(0.6039216f, 0.8039216f, 0.19607843f, 1f);

  public static ColorRGBA randomColor() {
    Field[] fields = CSSColor.class.getDeclaredFields();

    int rnd = FastMath.nextRandomInt(0, fields.length - 1);
    try {
      return new ColorRGBA((ColorRGBA) fields[rnd].get(null));
    } catch (IllegalAccessException e) { /* Silent */ }

    throw new RuntimeException("Cannot access any color constants.");
  }

  public static ColorRGBA colorByName(String name) {
    Field[] fields = CSSColor.class.getDeclaredFields();

    try {
      for (Field field : fields) {
        if (field.getType() == ColorRGBA.class && field.getName().equalsIgnoreCase(name)) {
          return new ColorRGBA((ColorRGBA) field.get(null));
        }
      }
    } catch (IllegalAccessException e) { /* Silent */ }

    throw new RuntimeException("Color[" + name + "] not found.");
  }

  public static void randomColors(ColorRGBA[] colors) {
    randomColors(0, colors);
  }

  public static void randomColors(int start, ColorRGBA[] colors) {
    Field[] fields = CSSColor.class.getDeclaredFields();

    try {
      for (int i = start; i < colors.length; i++) {
        int rnd = FastMath.nextRandomInt(0, fields.length - 1);
        colors[i] = new ColorRGBA((ColorRGBA) fields[rnd].get(null));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

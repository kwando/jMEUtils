
import com.jme3.math.ColorRGBA;
import me.merciless.utils.ColorMangler;
import me.merciless.utils.HSLAColor;

/**
 *
 * @author kwando
 */
public class TestColorMangler {

  public static void main(String[] arg) {
    System.out.println(HSLAColor.fromRGBA(ColorRGBA.Red));
    System.out.println(HSLAColor.fromRGBA(ColorRGBA.Blue));
    
    testConvert("Red", ColorMangler.darken(ColorRGBA.Blue.clone(), .2f));
    testConvert("Green", ColorRGBA.Green);
    testConvert("Blue", ColorRGBA.Blue);
    testConvert("Gray", ColorRGBA.Gray);
    testConvert("Pink", ColorRGBA.Pink);
    testConvert("Pink", ColorRGBA.Cyan);
  }
  
  public static void testConvert(String name, ColorRGBA color){
    String s1; 
    String s2;
    System.out.println("Testing Color: " + name);
    System.out.println(s1 = color.toString());
    
    System.out.println(HSLAColor.fromRGBA(color).toString());
    System.out.println(s2 = HSLAColor.fromRGBA(color).toRGBA().toString());
    System.out.println("TEST OK: " + s1.equals(s2) + "\n");
  }
}

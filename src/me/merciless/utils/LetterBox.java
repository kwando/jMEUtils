/*

 */
package me.merciless.utils;

import com.jme3.app.Application;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.Camera;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Quad;

/**
 *
 * @author kwando
 */
public class LetterBox {

  private Node node;
  private Application app;
  public static final float CINEMATIC = 2.39f;
  public static final float WIDESCREEN = 16f / 9;
  public static final float FULLSCREEN = 1f;

  public LetterBox(Node node, Application app) {
    this.node = node;
    this.app = app;
  }

  public void apply() {
    Camera cam = app.getCamera();
    int space = 40;
    int zIndex = -10;

    float goalRatio = CINEMATIC;

    float targetHeight = (cam.getWidth() / goalRatio);
    space = (int) ((cam.getHeight() - targetHeight) / 2);

    Quad quad = new Quad(cam.getWidth(), space);
    Material material = new Material(app.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
    material.setColor("Color", ColorRGBA.BlackNoAlpha);

    Geometry top = new Geometry("LetterboxTop", quad);
    top.setMaterial(material);


    Geometry bottom = new Geometry("LetterboxTop", quad);
    bottom.setMaterial(material);

    node.attachChild(top);
    node.attachChild(bottom);

    top.setLocalTranslation(0, cam.getHeight() - space, zIndex);
    bottom.setLocalTranslation(0, 0, zIndex);
  }

  public static void applyToCamera(Camera cam, float ratio) {
    float offset = (1 - (cam.getWidth() / ratio) / cam.getHeight()) / 2;
    
    cam.setViewPort(0f, 1.0f, offset, 1 - offset);
    cam.setFrustumPerspective(35, ratio, 1, 1000);
  }
}

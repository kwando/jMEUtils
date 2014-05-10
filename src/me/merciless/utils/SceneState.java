/*

 */
package me.merciless.utils;

import com.jme3.app.Application;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Node;

/**
 *
 * @author kwando
 */
public class SceneState extends AbstractAppState {

  private Node node;

  public SceneState() {
    node = new Node();
  }

  @Override
  public void initialize(AppStateManager stateManager, Application app) {
    super.initialize(stateManager, app);
    app.getViewPort().attachScene(node);
  }

  @Override
  public void update(float tpf) {
    super.update(tpf);
    node.updateLogicalState(tpf);
  }

  @Override
  public void render(RenderManager rm) {
    super.render(rm);
    node.updateGeometricState();
  }

  public Node rootNode() {
    return node;
  }

  @Override
  public void cleanup() {
    node.removeFromParent();
    node = null;
    super.cleanup();
  }
}

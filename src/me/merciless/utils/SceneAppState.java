package me.merciless.utils;

import com.jme3.app.Application;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import com.jme3.asset.AssetManager;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Node;

/**
 *
 * @author kwando
 */
public abstract class SceneAppState extends AbstractAppState {

  private Application app;
  protected AssetManager assets;
  protected Node root;

  @Override
  public void initialize(AppStateManager stateManager, Application app) {
    super.initialize(stateManager, app);
    this.app = app;
    this.assets = app.getAssetManager();
    this.root = new Node("AppState rootNode");
    app.getViewPort().attachScene(root);
    initialize();
  }
  
  public abstract void initialize();

  @Override
  public void update(float tpf) {
    root.updateLogicalState(tpf);
  }

  @Override
  public void render(RenderManager rm) {
    root.updateGeometricState();
  }

  @Override
  public void cleanup() {
    app.getViewPort().detachScene(root);
    super.cleanup();
  }
}

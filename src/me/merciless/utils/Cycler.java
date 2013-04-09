package me.merciless.utils;

/**
 *
 * @author kwando
 */
public class Cycler {

  private float period;
  private float acc;

  public Cycler(float period) {
    this.period = period;
    if (period <= 0) {
      throw new IllegalArgumentException("period must be > 0");
    }
  }

  public float doUpdate(float tpf) {
    acc += tpf;
    if (acc > period) {
      acc -= period;
    }
    return acc / period;
  }

  public void reset() {
    acc = 0;
  }
}

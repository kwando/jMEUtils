/*

 */
package me.merciless.utils;

/**
 *
 * @author kwando
 */
public class Timer {

  private float interval;
  private float acc;

  public Timer(float interval) {
    this.interval = interval;
  }

  public float getAccumulated() {
    return acc;
  }

  public float getRatio() {
    return acc / interval;
  }

  public float getInterval() {
    return interval;
  }

  public void reset() {
    acc = 0;
  }

  public void reset(float newInterval) {
    acc = 0;
    interval = newInterval;
  }

  public boolean update(float tpf) {
    acc += tpf;
    return consume();
  }

  public void add(float time) {
    acc += time;
  }

  public boolean consume() {
    if (acc > interval) {
      acc -= interval;
      return true;
    }
    return false;
  }
}

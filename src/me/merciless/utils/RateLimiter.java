package me.merciless.utils;

/**
 *
 * @author kwando
 */
public class RateLimiter {

  private float interval;
  private float elapsed;

  public RateLimiter(float interval) {
    setInterval(interval);
    this.elapsed = 0;
  }

  public boolean doUpdate(float tpf) {
    elapsed += tpf;
    if (elapsed > interval) {
      elapsed -= interval;
      return true;
    }
    return false;
  }

  public void reset() {
    this.elapsed = 0;
  }

  public float getInterval() {
    return interval;
  }

  public void setInterval(float interval) {
    if (interval <= 0) {
      throw new IllegalArgumentException("interval must be > 0");
    }
    this.interval = interval;
  }

  public float getFrequency() {
    return 1f / interval;
  }

  public void setFrequency(float frequency) {
    if (frequency <= 0) {
      throw new IllegalArgumentException("frequency must be > 0");
    }
    this.interval = 1f / frequency;
  }
}

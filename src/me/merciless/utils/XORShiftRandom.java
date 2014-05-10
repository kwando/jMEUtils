/*

 */
package me.merciless.utils;

/**
 *
 * @author kwando
 */
public class XORShiftRandom {

  private long seed = 0;

  private XORShiftRandom(long seed) {
    this.seed = seed;
  }

  public long next() {
    seed ^= (seed << 21);
    seed ^= (seed >>> 35);
    seed ^= (seed << 4);
    return seed;
  }

  public float nextFloat() {
    return (float)(((double) next()) / Long.MAX_VALUE);
  }

  public void reseed(long seed) {
    this.seed = seed;
  }

  public static XORShiftRandom fromSeed(long seed) {
    return new XORShiftRandom(seed);
  }

  public static XORShiftRandom withRandomSeed() {
    return new XORShiftRandom(System.nanoTime());
  }
}

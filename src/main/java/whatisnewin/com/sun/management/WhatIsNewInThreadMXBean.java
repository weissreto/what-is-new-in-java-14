package whatisnewin.com.sun.management;

import com.sun.management.ThreadMXBean;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ThreadMXBean}
 * that were newly introduced in Java version 14.<br>
 *
 * {@link ThreadMXBean} is an old class but has new fields, constructors or methods.
 * @since UNDEFINED
 * @see ThreadMXBean
 */
public final class WhatIsNewInThreadMXBean
{
  /**
   * Example call to new method {@link ThreadMXBean#getCurrentThreadAllocatedBytes()}.
   * @since 14
   * @see ThreadMXBean#getCurrentThreadAllocatedBytes()
   */
  public long getCurrentThreadAllocatedBytes()
  {
    ThreadMXBean testee = $$$();

    long result = testee.getCurrentThreadAllocatedBytes();
    return result;
  }

  private ThreadMXBean $$$()
  {
    return null;
  }
}

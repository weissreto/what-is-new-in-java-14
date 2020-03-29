package whatisnewin.java.text;

import java.text.CompactNumberFormat;
import java.text.DecimalFormatSymbols;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link CompactNumberFormat}
 * that were newly introduced in Java version 14.<br>
 *
 * {@link CompactNumberFormat} is an old class but has new fields, constructors or methods.
 * @since 12
 * @see CompactNumberFormat
 */
public final class WhatIsNewInCompactNumberFormat
{
  /**
   * Example call to new constructor {@link CompactNumberFormat#CompactNumberFormat(String, DecimalFormatSymbols, String[], String)}.
   * @since 14
   * @see CompactNumberFormat#CompactNumberFormat(String, DecimalFormatSymbols, String[], String)
   */
  public WhatIsNewInCompactNumberFormat(String decimalPattern, DecimalFormatSymbols symbols, String[] compactPatterns, String pluralRules)
  {
    CompactNumberFormat testee = new CompactNumberFormat(decimalPattern, symbols, compactPatterns, pluralRules);
  }

}
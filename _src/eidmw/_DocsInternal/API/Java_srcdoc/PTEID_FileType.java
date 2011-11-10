/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.portugal.eid;

/******************************************************************************//**
  * Class that holds the different file type definitions
  *********************************************************************************/
public final class PTEID_FileType {
	/**
	 * unknown file type
	 */
  public final static PTEID_FileType PTEID_FILETYPE_UNKNOWN = new PTEID_FileType("PTEID_FILETYPE_UNKNOWN", pteidlibJava_WrapperJNI.PTEID_FILETYPE_UNKNOWN_get());
	/**
	 * TLV filetype
	 */
  public final static PTEID_FileType PTEID_FILETYPE_TLV = new PTEID_FileType("PTEID_FILETYPE_TLV");
	/**
	 * XML file type
	 */
  public final static PTEID_FileType PTEID_FILETYPE_XML = new PTEID_FileType("PTEID_FILETYPE_XML");
	/**
	 * CSV file type
	 */
  public final static PTEID_FileType PTEID_FILETYPE_CSV = new PTEID_FileType("PTEID_FILETYPE_CSV");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PTEID_FileType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PTEID_FileType.class + " with value " + swigValue);
  }

  private PTEID_FileType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PTEID_FileType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PTEID_FileType(String swigName, PTEID_FileType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PTEID_FileType[] swigValues = { PTEID_FILETYPE_UNKNOWN, PTEID_FILETYPE_TLV, PTEID_FILETYPE_XML, PTEID_FILETYPE_CSV };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


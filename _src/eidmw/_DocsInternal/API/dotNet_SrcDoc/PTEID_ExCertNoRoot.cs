/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace be.portugal.eid {

using System;
using System.Runtime.InteropServices;

/// <summary>
/// Exception class Certificate No OCSP responder (error code = EIDMW_ERR_CERT_NOROOT).
/// Throw when ask for the Root.
/// Used in : 
/// - PTEID_Certificate::getRoot()
/// </summary>
public class PTEID_ExCertNoRoot : PTEID_Exception {
  private HandleRef swigCPtr;

  internal PTEID_ExCertNoRoot(IntPtr cPtr, bool cMemoryOwn) : base(pteidlib_dotNetPINVOKE.PTEID_ExCertNoRootUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(PTEID_ExCertNoRoot obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~PTEID_ExCertNoRoot() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if(swigCPtr.Handle != IntPtr.Zero && swigCMemOwn) {
        swigCMemOwn = false;
        pteidlib_dotNetPINVOKE.delete_PTEID_ExCertNoRoot(swigCPtr);
      }
      swigCPtr = new HandleRef(null, IntPtr.Zero);
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public PTEID_ExCertNoRoot() : this(pteidlib_dotNetPINVOKE.new_PTEID_ExCertNoRoot(), true) {
  }

}

}

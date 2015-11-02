/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkDsa {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkDsa(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkDsa obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkDsa(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkDsa() {
    this(chilkatJNI.new_CkDsa(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkDsa_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkDsa_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkDsa_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkDsa_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkDsa_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkDsa_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkDsa_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkDsa_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkDsa_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkDsa_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkDsa_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkDsa_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkDsa_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkDsa_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkDsa_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkDsa_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkDsa_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkDsa_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkDsa_SaveLastError(swigCPtr, this, path);
  }

  public int get_GroupSize() {
    return chilkatJNI.CkDsa_get_GroupSize(swigCPtr, this);
  }

  public void put_GroupSize(int newVal) {
    chilkatJNI.CkDsa_put_GroupSize(swigCPtr, this, newVal);
  }

  public void get_Hash(CkByteData outBytes) {
    chilkatJNI.CkDsa_get_Hash(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void put_Hash(CkByteData inBytes) {
    chilkatJNI.CkDsa_put_Hash(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes);
  }

  public void get_HexG(CkString str) {
    chilkatJNI.CkDsa_get_HexG(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hexG() {
    return chilkatJNI.CkDsa_hexG(swigCPtr, this);
  }

  public void get_HexP(CkString str) {
    chilkatJNI.CkDsa_get_HexP(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hexP() {
    return chilkatJNI.CkDsa_hexP(swigCPtr, this);
  }

  public void get_HexQ(CkString str) {
    chilkatJNI.CkDsa_get_HexQ(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hexQ() {
    return chilkatJNI.CkDsa_hexQ(swigCPtr, this);
  }

  public void get_HexX(CkString str) {
    chilkatJNI.CkDsa_get_HexX(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hexX() {
    return chilkatJNI.CkDsa_hexX(swigCPtr, this);
  }

  public void get_HexY(CkString str) {
    chilkatJNI.CkDsa_get_HexY(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hexY() {
    return chilkatJNI.CkDsa_hexY(swigCPtr, this);
  }

  public void get_Signature(CkByteData outBytes) {
    chilkatJNI.CkDsa_get_Signature(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void put_Signature(CkByteData inBytes) {
    chilkatJNI.CkDsa_put_Signature(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes);
  }

  public boolean FromDer(CkByteData derData) {
    return chilkatJNI.CkDsa_FromDer(swigCPtr, this, CkByteData.getCPtr(derData), derData);
  }

  public boolean FromDerFile(String path) {
    return chilkatJNI.CkDsa_FromDerFile(swigCPtr, this, path);
  }

  public boolean FromEncryptedPem(String password, String pemData) {
    return chilkatJNI.CkDsa_FromEncryptedPem(swigCPtr, this, password, pemData);
  }

  public boolean FromPem(String pemData) {
    return chilkatJNI.CkDsa_FromPem(swigCPtr, this, pemData);
  }

  public boolean FromPublicDer(CkByteData derData) {
    return chilkatJNI.CkDsa_FromPublicDer(swigCPtr, this, CkByteData.getCPtr(derData), derData);
  }

  public boolean FromPublicDerFile(String path) {
    return chilkatJNI.CkDsa_FromPublicDerFile(swigCPtr, this, path);
  }

  public boolean FromPublicPem(String pemData) {
    return chilkatJNI.CkDsa_FromPublicPem(swigCPtr, this, pemData);
  }

  public boolean FromXml(String xmlKey) {
    return chilkatJNI.CkDsa_FromXml(swigCPtr, this, xmlKey);
  }

  public boolean GenKey(int numBits) {
    return chilkatJNI.CkDsa_GenKey(swigCPtr, this, numBits);
  }

  public boolean GenKeyFromParamsDer(CkByteData derBytes) {
    return chilkatJNI.CkDsa_GenKeyFromParamsDer(swigCPtr, this, CkByteData.getCPtr(derBytes), derBytes);
  }

  public boolean GenKeyFromParamsDerFile(String path) {
    return chilkatJNI.CkDsa_GenKeyFromParamsDerFile(swigCPtr, this, path);
  }

  public boolean GenKeyFromParamsPem(String pem) {
    return chilkatJNI.CkDsa_GenKeyFromParamsPem(swigCPtr, this, pem);
  }

  public boolean GenKeyFromParamsPemFile(String path) {
    return chilkatJNI.CkDsa_GenKeyFromParamsPemFile(swigCPtr, this, path);
  }

  public boolean GetEncodedHash(String encoding, CkString outStr) {
    return chilkatJNI.CkDsa_GetEncodedHash(swigCPtr, this, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getEncodedHash(String encoding) {
    return chilkatJNI.CkDsa_getEncodedHash(swigCPtr, this, encoding);
  }

  public String encodedHash(String encoding) {
    return chilkatJNI.CkDsa_encodedHash(swigCPtr, this, encoding);
  }

  public boolean GetEncodedSignature(String encoding, CkString outStr) {
    return chilkatJNI.CkDsa_GetEncodedSignature(swigCPtr, this, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getEncodedSignature(String encoding) {
    return chilkatJNI.CkDsa_getEncodedSignature(swigCPtr, this, encoding);
  }

  public String encodedSignature(String encoding) {
    return chilkatJNI.CkDsa_encodedSignature(swigCPtr, this, encoding);
  }

  public boolean LoadText(String path, CkString outStr) {
    return chilkatJNI.CkDsa_LoadText(swigCPtr, this, path, CkString.getCPtr(outStr), outStr);
  }

  public String loadText(String path) {
    return chilkatJNI.CkDsa_loadText(swigCPtr, this, path);
  }

  public boolean SaveText(String strToSave, String path) {
    return chilkatJNI.CkDsa_SaveText(swigCPtr, this, strToSave, path);
  }

  public boolean SetEncodedHash(String encoding, String encodedHash) {
    return chilkatJNI.CkDsa_SetEncodedHash(swigCPtr, this, encoding, encodedHash);
  }

  public boolean SetEncodedSignature(String encoding, String encodedSig) {
    return chilkatJNI.CkDsa_SetEncodedSignature(swigCPtr, this, encoding, encodedSig);
  }

  public boolean SetEncodedSignatureRS(String encoding, String encodedR, String encodedS) {
    return chilkatJNI.CkDsa_SetEncodedSignatureRS(swigCPtr, this, encoding, encodedR, encodedS);
  }

  public boolean SetKeyExplicit(int groupSizeInBytes, String pHex, String qHex, String gHex, String xHex) {
    return chilkatJNI.CkDsa_SetKeyExplicit(swigCPtr, this, groupSizeInBytes, pHex, qHex, gHex, xHex);
  }

  public boolean SetPubKeyExplicit(int groupSizeInBytes, String pHex, String qHex, String gHex, String yHex) {
    return chilkatJNI.CkDsa_SetPubKeyExplicit(swigCPtr, this, groupSizeInBytes, pHex, qHex, gHex, yHex);
  }

  public boolean SignHash() {
    return chilkatJNI.CkDsa_SignHash(swigCPtr, this);
  }

  public boolean ToDer(CkByteData outBytes) {
    return chilkatJNI.CkDsa_ToDer(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ToDerFile(String path) {
    return chilkatJNI.CkDsa_ToDerFile(swigCPtr, this, path);
  }

  public boolean ToEncryptedPem(String password, CkString outStr) {
    return chilkatJNI.CkDsa_ToEncryptedPem(swigCPtr, this, password, CkString.getCPtr(outStr), outStr);
  }

  public String toEncryptedPem(String password) {
    return chilkatJNI.CkDsa_toEncryptedPem(swigCPtr, this, password);
  }

  public boolean ToPem(CkString outStr) {
    return chilkatJNI.CkDsa_ToPem(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toPem() {
    return chilkatJNI.CkDsa_toPem(swigCPtr, this);
  }

  public boolean ToPublicDer(CkByteData outBytes) {
    return chilkatJNI.CkDsa_ToPublicDer(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ToPublicDerFile(String path) {
    return chilkatJNI.CkDsa_ToPublicDerFile(swigCPtr, this, path);
  }

  public boolean ToPublicPem(CkString outStr) {
    return chilkatJNI.CkDsa_ToPublicPem(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toPublicPem() {
    return chilkatJNI.CkDsa_toPublicPem(swigCPtr, this);
  }

  public boolean ToXml(boolean bPublicOnly, CkString outStr) {
    return chilkatJNI.CkDsa_ToXml(swigCPtr, this, bPublicOnly, CkString.getCPtr(outStr), outStr);
  }

  public String toXml(boolean bPublicOnly) {
    return chilkatJNI.CkDsa_toXml(swigCPtr, this, bPublicOnly);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkDsa_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean Verify() {
    return chilkatJNI.CkDsa_Verify(swigCPtr, this);
  }

  public boolean VerifyKey() {
    return chilkatJNI.CkDsa_VerifyKey(swigCPtr, this);
  }

}

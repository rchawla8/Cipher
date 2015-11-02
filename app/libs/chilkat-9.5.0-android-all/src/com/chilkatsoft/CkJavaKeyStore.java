/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkJavaKeyStore {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkJavaKeyStore(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkJavaKeyStore obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkJavaKeyStore(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkJavaKeyStore() {
    this(chilkatJNI.new_CkJavaKeyStore(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkJavaKeyStore_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkJavaKeyStore_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkJavaKeyStore_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkJavaKeyStore_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkJavaKeyStore_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkJavaKeyStore_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkJavaKeyStore_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkJavaKeyStore_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkJavaKeyStore_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkJavaKeyStore_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkJavaKeyStore_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkJavaKeyStore_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkJavaKeyStore_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkJavaKeyStore_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkJavaKeyStore_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkJavaKeyStore_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkJavaKeyStore_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkJavaKeyStore_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkJavaKeyStore_SaveLastError(swigCPtr, this, path);
  }

  public int get_NumPrivateKeys() {
    return chilkatJNI.CkJavaKeyStore_get_NumPrivateKeys(swigCPtr, this);
  }

  public int get_NumTrustedCerts() {
    return chilkatJNI.CkJavaKeyStore_get_NumTrustedCerts(swigCPtr, this);
  }

  public boolean get_RequireCompleteChain() {
    return chilkatJNI.CkJavaKeyStore_get_RequireCompleteChain(swigCPtr, this);
  }

  public void put_RequireCompleteChain(boolean newVal) {
    chilkatJNI.CkJavaKeyStore_put_RequireCompleteChain(swigCPtr, this, newVal);
  }

  public boolean get_VerifyKeyedDigest() {
    return chilkatJNI.CkJavaKeyStore_get_VerifyKeyedDigest(swigCPtr, this);
  }

  public void put_VerifyKeyedDigest(boolean newVal) {
    chilkatJNI.CkJavaKeyStore_put_VerifyKeyedDigest(swigCPtr, this, newVal);
  }

  public boolean AddPfx(CkPfx pfx, String alias, String password) {
    return chilkatJNI.CkJavaKeyStore_AddPfx(swigCPtr, this, CkPfx.getCPtr(pfx), pfx, alias, password);
  }

  public boolean AddPrivateKey(CkCert cert, String alias, String password) {
    return chilkatJNI.CkJavaKeyStore_AddPrivateKey(swigCPtr, this, CkCert.getCPtr(cert), cert, alias, password);
  }

  public boolean AddTrustedCert(CkCert cert, String alias) {
    return chilkatJNI.CkJavaKeyStore_AddTrustedCert(swigCPtr, this, CkCert.getCPtr(cert), cert, alias);
  }

  public boolean ChangePassword(int index, String oldPassword, String newPassword) {
    return chilkatJNI.CkJavaKeyStore_ChangePassword(swigCPtr, this, index, oldPassword, newPassword);
  }

  public CkCertChain FindCertChain(String alias, boolean caseSensitive) {
    long cPtr = chilkatJNI.CkJavaKeyStore_FindCertChain(swigCPtr, this, alias, caseSensitive);
    return (cPtr == 0) ? null : new CkCertChain(cPtr, true);
  }

  public CkPrivateKey FindPrivateKey(String password, String alias, boolean caseSensitive) {
    long cPtr = chilkatJNI.CkJavaKeyStore_FindPrivateKey(swigCPtr, this, password, alias, caseSensitive);
    return (cPtr == 0) ? null : new CkPrivateKey(cPtr, true);
  }

  public CkCert FindTrustedCert(String alias, boolean caseSensitive) {
    long cPtr = chilkatJNI.CkJavaKeyStore_FindTrustedCert(swigCPtr, this, alias, caseSensitive);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public CkCertChain GetCertChain(int index) {
    long cPtr = chilkatJNI.CkJavaKeyStore_GetCertChain(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCertChain(cPtr, true);
  }

  public CkPrivateKey GetPrivateKey(String password, int index) {
    long cPtr = chilkatJNI.CkJavaKeyStore_GetPrivateKey(swigCPtr, this, password, index);
    return (cPtr == 0) ? null : new CkPrivateKey(cPtr, true);
  }

  public boolean GetPrivateKeyAlias(int index, CkString outStr) {
    return chilkatJNI.CkJavaKeyStore_GetPrivateKeyAlias(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getPrivateKeyAlias(int index) {
    return chilkatJNI.CkJavaKeyStore_getPrivateKeyAlias(swigCPtr, this, index);
  }

  public String privateKeyAlias(int index) {
    return chilkatJNI.CkJavaKeyStore_privateKeyAlias(swigCPtr, this, index);
  }

  public CkCert GetTrustedCert(int index) {
    long cPtr = chilkatJNI.CkJavaKeyStore_GetTrustedCert(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public boolean GetTrustedCertAlias(int index, CkString outStr) {
    return chilkatJNI.CkJavaKeyStore_GetTrustedCertAlias(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getTrustedCertAlias(int index) {
    return chilkatJNI.CkJavaKeyStore_getTrustedCertAlias(swigCPtr, this, index);
  }

  public String trustedCertAlias(int index) {
    return chilkatJNI.CkJavaKeyStore_trustedCertAlias(swigCPtr, this, index);
  }

  public boolean LoadBinary(String password, CkByteData jksData) {
    return chilkatJNI.CkJavaKeyStore_LoadBinary(swigCPtr, this, password, CkByteData.getCPtr(jksData), jksData);
  }

  public boolean LoadEncoded(String password, String jksEncData, String encoding) {
    return chilkatJNI.CkJavaKeyStore_LoadEncoded(swigCPtr, this, password, jksEncData, encoding);
  }

  public boolean LoadFile(String password, String path) {
    return chilkatJNI.CkJavaKeyStore_LoadFile(swigCPtr, this, password, path);
  }

  public boolean RemoveEntry(int entryType, int index) {
    return chilkatJNI.CkJavaKeyStore_RemoveEntry(swigCPtr, this, entryType, index);
  }

  public boolean SetAlias(int entryType, int index, String alias) {
    return chilkatJNI.CkJavaKeyStore_SetAlias(swigCPtr, this, entryType, index, alias);
  }

  public boolean ToBinary(String password, CkByteData outBytes) {
    return chilkatJNI.CkJavaKeyStore_ToBinary(swigCPtr, this, password, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ToEncodedString(String password, String encoding, CkString outStr) {
    return chilkatJNI.CkJavaKeyStore_ToEncodedString(swigCPtr, this, password, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String toEncodedString(String password, String encoding) {
    return chilkatJNI.CkJavaKeyStore_toEncodedString(swigCPtr, this, password, encoding);
  }

  public boolean ToFile(String password, String path) {
    return chilkatJNI.CkJavaKeyStore_ToFile(swigCPtr, this, password, path);
  }

  public CkPem ToPem(String password) {
    long cPtr = chilkatJNI.CkJavaKeyStore_ToPem(swigCPtr, this, password);
    return (cPtr == 0) ? null : new CkPem(cPtr, true);
  }

  public CkPfx ToPfx(String password) {
    long cPtr = chilkatJNI.CkJavaKeyStore_ToPfx(swigCPtr, this, password);
    return (cPtr == 0) ? null : new CkPfx(cPtr, true);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkJavaKeyStore_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean UseCertVault(CkXmlCertVault vault) {
    return chilkatJNI.CkJavaKeyStore_UseCertVault(swigCPtr, this, CkXmlCertVault.getCPtr(vault), vault);
  }

}

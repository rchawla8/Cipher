/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkNtlm {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkNtlm(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkNtlm obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkNtlm(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkNtlm() {
    this(chilkatJNI.new_CkNtlm(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkNtlm_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkNtlm_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkNtlm_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkNtlm_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkNtlm_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkNtlm_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkNtlm_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkNtlm_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkNtlm_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkNtlm_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkNtlm_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkNtlm_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkNtlm_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkNtlm_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkNtlm_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkNtlm_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkNtlm_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkNtlm_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkNtlm_SaveLastError(swigCPtr, this, path);
  }

  public void get_ClientChallenge(CkString str) {
    chilkatJNI.CkNtlm_get_ClientChallenge(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientChallenge() {
    return chilkatJNI.CkNtlm_clientChallenge(swigCPtr, this);
  }

  public void put_ClientChallenge(String newVal) {
    chilkatJNI.CkNtlm_put_ClientChallenge(swigCPtr, this, newVal);
  }

  public void get_DnsComputerName(CkString str) {
    chilkatJNI.CkNtlm_get_DnsComputerName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dnsComputerName() {
    return chilkatJNI.CkNtlm_dnsComputerName(swigCPtr, this);
  }

  public void put_DnsComputerName(String newVal) {
    chilkatJNI.CkNtlm_put_DnsComputerName(swigCPtr, this, newVal);
  }

  public void get_DnsDomainName(CkString str) {
    chilkatJNI.CkNtlm_get_DnsDomainName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dnsDomainName() {
    return chilkatJNI.CkNtlm_dnsDomainName(swigCPtr, this);
  }

  public void put_DnsDomainName(String newVal) {
    chilkatJNI.CkNtlm_put_DnsDomainName(swigCPtr, this, newVal);
  }

  public void get_Domain(CkString str) {
    chilkatJNI.CkNtlm_get_Domain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String domain() {
    return chilkatJNI.CkNtlm_domain(swigCPtr, this);
  }

  public void put_Domain(String newVal) {
    chilkatJNI.CkNtlm_put_Domain(swigCPtr, this, newVal);
  }

  public void get_EncodingMode(CkString str) {
    chilkatJNI.CkNtlm_get_EncodingMode(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String encodingMode() {
    return chilkatJNI.CkNtlm_encodingMode(swigCPtr, this);
  }

  public void put_EncodingMode(String newVal) {
    chilkatJNI.CkNtlm_put_EncodingMode(swigCPtr, this, newVal);
  }

  public void get_Flags(CkString str) {
    chilkatJNI.CkNtlm_get_Flags(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String flags() {
    return chilkatJNI.CkNtlm_flags(swigCPtr, this);
  }

  public void put_Flags(String newVal) {
    chilkatJNI.CkNtlm_put_Flags(swigCPtr, this, newVal);
  }

  public void get_NetBiosComputerName(CkString str) {
    chilkatJNI.CkNtlm_get_NetBiosComputerName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String netBiosComputerName() {
    return chilkatJNI.CkNtlm_netBiosComputerName(swigCPtr, this);
  }

  public void put_NetBiosComputerName(String newVal) {
    chilkatJNI.CkNtlm_put_NetBiosComputerName(swigCPtr, this, newVal);
  }

  public void get_NetBiosDomainName(CkString str) {
    chilkatJNI.CkNtlm_get_NetBiosDomainName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String netBiosDomainName() {
    return chilkatJNI.CkNtlm_netBiosDomainName(swigCPtr, this);
  }

  public void put_NetBiosDomainName(String newVal) {
    chilkatJNI.CkNtlm_put_NetBiosDomainName(swigCPtr, this, newVal);
  }

  public int get_NtlmVersion() {
    return chilkatJNI.CkNtlm_get_NtlmVersion(swigCPtr, this);
  }

  public void put_NtlmVersion(int newVal) {
    chilkatJNI.CkNtlm_put_NtlmVersion(swigCPtr, this, newVal);
  }

  public int get_OemCodePage() {
    return chilkatJNI.CkNtlm_get_OemCodePage(swigCPtr, this);
  }

  public void put_OemCodePage(int newVal) {
    chilkatJNI.CkNtlm_put_OemCodePage(swigCPtr, this, newVal);
  }

  public void get_Password(CkString str) {
    chilkatJNI.CkNtlm_get_Password(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String password() {
    return chilkatJNI.CkNtlm_password(swigCPtr, this);
  }

  public void put_Password(String newVal) {
    chilkatJNI.CkNtlm_put_Password(swigCPtr, this, newVal);
  }

  public void get_ServerChallenge(CkString str) {
    chilkatJNI.CkNtlm_get_ServerChallenge(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String serverChallenge() {
    return chilkatJNI.CkNtlm_serverChallenge(swigCPtr, this);
  }

  public void put_ServerChallenge(String newVal) {
    chilkatJNI.CkNtlm_put_ServerChallenge(swigCPtr, this, newVal);
  }

  public void get_TargetName(CkString str) {
    chilkatJNI.CkNtlm_get_TargetName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String targetName() {
    return chilkatJNI.CkNtlm_targetName(swigCPtr, this);
  }

  public void put_TargetName(String newVal) {
    chilkatJNI.CkNtlm_put_TargetName(swigCPtr, this, newVal);
  }

  public void get_UserName(CkString str) {
    chilkatJNI.CkNtlm_get_UserName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String userName() {
    return chilkatJNI.CkNtlm_userName(swigCPtr, this);
  }

  public void put_UserName(String newVal) {
    chilkatJNI.CkNtlm_put_UserName(swigCPtr, this, newVal);
  }

  public void get_Workstation(CkString str) {
    chilkatJNI.CkNtlm_get_Workstation(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String workstation() {
    return chilkatJNI.CkNtlm_workstation(swigCPtr, this);
  }

  public void put_Workstation(String newVal) {
    chilkatJNI.CkNtlm_put_Workstation(swigCPtr, this, newVal);
  }

  public boolean CompareType3(String msg1, String msg2) {
    return chilkatJNI.CkNtlm_CompareType3(swigCPtr, this, msg1, msg2);
  }

  public boolean GenType1(CkString outStr) {
    return chilkatJNI.CkNtlm_GenType1(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String genType1() {
    return chilkatJNI.CkNtlm_genType1(swigCPtr, this);
  }

  public boolean GenType2(String type1Msg, CkString outStr) {
    return chilkatJNI.CkNtlm_GenType2(swigCPtr, this, type1Msg, CkString.getCPtr(outStr), outStr);
  }

  public String genType2(String type1Msg) {
    return chilkatJNI.CkNtlm_genType2(swigCPtr, this, type1Msg);
  }

  public boolean GenType3(String type2Msg, CkString outStr) {
    return chilkatJNI.CkNtlm_GenType3(swigCPtr, this, type2Msg, CkString.getCPtr(outStr), outStr);
  }

  public String genType3(String type2Msg) {
    return chilkatJNI.CkNtlm_genType3(swigCPtr, this, type2Msg);
  }

  public boolean LoadType3(String type3Msg) {
    return chilkatJNI.CkNtlm_LoadType3(swigCPtr, this, type3Msg);
  }

  public boolean ParseType1(String type1Msg, CkString outStr) {
    return chilkatJNI.CkNtlm_ParseType1(swigCPtr, this, type1Msg, CkString.getCPtr(outStr), outStr);
  }

  public String parseType1(String type1Msg) {
    return chilkatJNI.CkNtlm_parseType1(swigCPtr, this, type1Msg);
  }

  public boolean ParseType2(String type2Msg, CkString outStr) {
    return chilkatJNI.CkNtlm_ParseType2(swigCPtr, this, type2Msg, CkString.getCPtr(outStr), outStr);
  }

  public String parseType2(String type2Msg) {
    return chilkatJNI.CkNtlm_parseType2(swigCPtr, this, type2Msg);
  }

  public boolean ParseType3(String type3Msg, CkString outStr) {
    return chilkatJNI.CkNtlm_ParseType3(swigCPtr, this, type3Msg, CkString.getCPtr(outStr), outStr);
  }

  public String parseType3(String type3Msg) {
    return chilkatJNI.CkNtlm_parseType3(swigCPtr, this, type3Msg);
  }

  public boolean SetFlag(String flagLetter, boolean onOrOff) {
    return chilkatJNI.CkNtlm_SetFlag(swigCPtr, this, flagLetter, onOrOff);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkNtlm_UnlockComponent(swigCPtr, this, unlockCode);
  }

}

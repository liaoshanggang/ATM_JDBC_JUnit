package com.forward.po.trade;

//ATM–≈œ¢£∫ATM±‡∫≈£¨ATM”‡∂Ó£¨
public class AtmInfo {
	String ATM_No;// ATM±‡∫≈
	String ATM_Balance;// ATM”‡∂Ó

	public AtmInfo() {
		super();
	}

	public AtmInfo(String aTM_No, String aTM_Balance) {
		super();
		ATM_No = aTM_No;
		ATM_Balance = aTM_Balance;
	}

	public String getATM_No() {
		return ATM_No;
	}

	public void setATM_No(String aTM_No) {
		ATM_No = aTM_No;
	}

	public String getATM_Balance() {
		return ATM_Balance;
	}

	public void setATM_Balance(String aTM_Balance) {
		ATM_Balance = aTM_Balance;
	}

	@Override
	public String toString() {
		return "AtmInfo [ATM_No=" + ATM_No + ", ATM_Balance=" + ATM_Balance
				+ "]";
	}

}

package com.forward.po.trade;

//������ˮ��Ϣ���������ͣ����״��룬�˺ţ�����ʱ��
public class TradeInfo {
	String tradeType;// ��������
	String tradeCode;// ���״���
	String accountNo;// �˺�
	String tradeTime;// ����ʱ��

	public TradeInfo() {
		super();
	}

	public TradeInfo(String tradeType, String tradeCode, String accountNo,
			String tradeTime) {
		super();
		this.tradeType = tradeType;
		this.tradeCode = tradeCode;
		this.accountNo = accountNo;
		this.tradeTime = tradeTime;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	@Override
	public String toString() {
		return "TradeInfo [tradeType=" + tradeType + ", tradeCode=" + tradeCode
				+ ", accountNo=" + accountNo + ", tradeTime=" + tradeTime + "]";
	}

}

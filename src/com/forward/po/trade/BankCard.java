package com.forward.po.trade;

//����Ϣ��
public class BankCard {
	String cardNo;// ����//19λ
	String accountNo;// �˺�//18λ
	int password;// ����//6λ
	String cardType;// ������
	double balance;// �����

	public BankCard() {
		super();
	}

	public BankCard(String accountNo, int password, String cardType,
			double balance) {
		super();
		this.accountNo = accountNo;
		this.password = password;
		this.cardType = cardType;
		this.balance = balance;
	}

	public BankCard(String cardNo, String accountNo, int password,
			String cardType, double balance) {
		super();
		this.cardNo = cardNo;
		this.accountNo = accountNo;
		this.password = password;
		this.cardType = cardType;
		this.balance = balance;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankCard [cardNo=" + cardNo + ", accountNo=" + accountNo
				+ ", password=" + password + ", cardType=" + cardType
				+ ", balance=" + balance + "]";
	}

}

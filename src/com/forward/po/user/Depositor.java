package com.forward.po.user;

//����
public class Depositor {
	String user_name;// ��������
	int user_cardNo;// �����˻������Զ����
	String user_phone;// �����绰
	String user_IDType;// ֤������
	int user_IDNO; // ֤������

	public Depositor() {
		super();
	}

	public Depositor(String user_name, int user_cardNo, String user_phone,
			String user_IDType, int user_IDNO) {
		super();
		this.user_name = user_name;
		this.user_cardNo = user_cardNo;
		this.user_phone = user_phone;
		this.user_IDType = user_IDType;
		this.user_IDNO = user_IDNO;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getUser_cardNo() {
		return user_cardNo;
	}

	public void setUser_cardNo(int user_cardNo) {
		this.user_cardNo = user_cardNo;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_IDType() {
		return user_IDType;
	}

	public void setUser_IDType(String user_IDType) {
		this.user_IDType = user_IDType;
	}

	public int getUser_IDNO() {
		return user_IDNO;
	}

	public void setUser_IDNO(int user_IDNO) {
		this.user_IDNO = user_IDNO;
	}

	@Override
	public String toString() {
		return "Depositor [user_name=" + user_name + ", user_cardNo="
				+ user_cardNo + ", user_phone=" + user_phone + ", user_IDType="
				+ user_IDType + ", user_IDNO=" + user_IDNO + "]";
	}

}

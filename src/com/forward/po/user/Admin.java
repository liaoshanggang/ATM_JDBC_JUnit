package com.forward.po.user;

//����Ա��Ϣ��
public class Admin {
	String admin_name;// ��¼��
	int admin_password;// ����
	String admin_privilege;// Ȩ��

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String admin_name, int admin_password, String admin_privilege) {
		super();
		this.admin_name = admin_name;
		this.admin_password = admin_password;
		this.admin_privilege = admin_privilege;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public int getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(int admin_password) {
		this.admin_password = admin_password;
	}

	public String getAdmin_privilege() {
		return admin_privilege;
	}

	public void setAdmin_privilege(String admin_privilege) {
		this.admin_privilege = admin_privilege;
	}

	@Override
	public String toString() {
		return "Admin [admin_name=" + admin_name + ", admin_password="
				+ admin_password + ", admin_privilege=" + admin_privilege + "]";
	}

}

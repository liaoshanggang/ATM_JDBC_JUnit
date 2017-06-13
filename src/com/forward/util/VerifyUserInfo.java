package com.forward.util;

import com.forward.exception.CardInfoException;

public class VerifyUserInfo {

	public void verifyCardData(String cardNo) throws CardInfoException {
		if (cardNo.length() != 19) {
			throw new CardInfoException("�˺�λ������ȷ��");
		}
		/*if (!cardNo.matches("[0-9]+")){
			throw new CardInfoException("�˺�Ӧ��Ϊ�����֣�");
		}*/
		//...
	}
	
	public void verifyAccData(String acc) throws CardInfoException {
		if (acc.length() != 18) {
			throw new CardInfoException("�˺�λ������ȷ��");
		}
		if (acc.matches("[0-9]+")){
			throw new CardInfoException("�˺�λ��Ӧ��Ϊ�����֣�");
		}
		//...
	}

	public void verifyPwdData(int pwd) throws CardInfoException {
		if (String.valueOf(pwd).length() != 6) {
			throw new CardInfoException("����λ������ȷ��");
		}
		//...
	}

	public void verifyBanData(double ban) throws CardInfoException {
		if (ban % 100 != 0) {
			throw new CardInfoException("���������");
		}
		//...
	}

	public void verifyTypeData(String type) throws CardInfoException {
	}
}

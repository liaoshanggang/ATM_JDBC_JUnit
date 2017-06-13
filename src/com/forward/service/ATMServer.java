package com.forward.service;

import java.util.List;

import com.forward.dao.BankCardDao;
import com.forward.dao.impl.BankCardDaoImpl;
import com.forward.exception.CardInfoException;
import com.forward.po.trade.BankCard;
import com.forward.util.VerifyUserInfo;

public class ATMServer {
	BankCardDao bCardDao = new BankCardDaoImpl();
	VerifyUserInfo v = new VerifyUserInfo();

	// ע��
	public BankCard register(String acc, int pwd, String type, double ban) {
		// ��֤���������
		try {
			v.verifyAccData(acc);
			v.verifyPwdData(pwd);
			v.verifyBanData(ban);
		} catch (CardInfoException e) {
			System.out.println(e.getMessage());
		}

		// �����ݿ���֤����
		BankCard cardInfo = new BankCard(acc, pwd, type, ban);
		BankCard outCardInfo = null;
		// ��֤�����Ƿ��Ѿ�����
		try {
			if (bCardDao.queryCardInfoByAcc(acc)) {
				throw new CardInfoException("�����Ѵ��ڣ�����������");
			} else {
				int flag = bCardDao.addCardInfo(cardInfo);
				if (flag == 1) {
					outCardInfo = new BankCard(acc, pwd, type, ban);
				}
			}
		} catch (CardInfoException e1) {
			System.out.println(e1.getMessage());
		}
		return outCardInfo;
	}

	// ��¼
	public BankCard login(String cardNo, int pwd) {
		// ��֤���������
		try {
			v.verifyCardData(cardNo);
			v.verifyPwdData(pwd);
		} catch (CardInfoException e) {
			System.out.println(e.getMessage());
		}
		// �����ݿ���֤����
		BankCard bCard = null;
		bCard = bCardDao.getCardInfo(cardNo, pwd);
		return bCard;
	}

	// ȡ��
	public int withDrawMoney(String cardNo, double money) {
		// ��֤���������
		try {
			v.verifyCardData(cardNo);
			v.verifyBanData(money);
		} catch (CardInfoException e) {
			System.out.println(e.getMessage());
		}
		return bCardDao.withDrawMoney(cardNo, money);
	}

	// ��ѯ
	public List<BankCard> queryALlCardInfo() {
		return bCardDao.queryALlCardInfo();
	}

	// ���
	public int depositMoney(String cardNo, double money) {
		// ��֤���������
		try {
			v.verifyCardData(cardNo);
			v.verifyBanData(money);
		} catch (CardInfoException e) {
			System.out.println(e.getMessage());
		}
		return bCardDao.depositMoney(cardNo, money);
	}
}

package com.forward.dao;

import java.util.List;

import com.forward.po.trade.BankCard;

public interface BankCardDao {
	/**
	 * @Description:��ӿ�����Ϣ
	 * @param tags
	 * @return return_type
	 */
	public int addCardInfo(BankCard bankCard);
	
	/**
	 * @Description: �����˻���ѯ����Ϣ
	 * @param tags
	 * @return return_type
	 */
	public boolean queryCardInfoByAcc(String acc_id);
	
	/**
	 * @Description:���ݿ��ź������ѯ����Ϣ
	 * @param cardNO,password
	 * @return ���ؿ���Ϣ
	 */
	public BankCard getCardInfo(String cardNo,int password);
	
	/**
	 * @Description: ���¿������
	 * @param cardNO
	 * @return return_type
	 */
	public int withDrawMoney(String cardNo,double balance);
	
	public List<BankCard> queryALlCardInfo();

	public int depositMoney(String cardNo, double money);
}

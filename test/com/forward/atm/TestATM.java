package com.forward.atm;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.forward.po.trade.BankCard;
import com.forward.service.ATMServer;

public class TestATM {
	static ATMServer atmServer;

	@BeforeClass
	public static void initClass() {
		atmServer = new ATMServer();
	}
	
	@Test
	public void testQueryALlCardInfo(){
		java.util.List<BankCard> BanCard = atmServer.queryALlCardInfo();
		for (BankCard bankCard : BanCard) {
			System.out.println(bankCard);
		}
	}
	
	@Test
	public void testDepositMoney(){
		String cardNo = "6228210000000000000";
		double money = 0;
		
		int index = atmServer.depositMoney(cardNo, money);

		assertEquals(1,index);
	}
	
	@Test
	public void testWithDraw() {
		String cardNo = "6228210000000000000";
		double money = 0;
		
		int index = atmServer.withDrawMoney(cardNo, money);

		assertEquals(1,index);
	}
	
	@Test
	public void testLogin() {

		String cardNo = "6228210000000000000";
		String acc = "451111222233334444";
		int pwd = 123456;
		String type = "Agricultural Bank of China";
		double ban = 100000.0;

		BankCard actCardInfo = atmServer.login(cardNo, pwd);

		BankCard excCardInfo = new BankCard(cardNo, acc, pwd, type, ban);

		assertEquals(excCardInfo.toString(), actCardInfo.toString());
		// System.out.println("��¼�ɹ���");
	}

	@Test
	public void testRegister() {
		// String cardNo = "6228210987654321999";//�Զ�����
		String acc = "451111222233339999";// �Զ����ɣ�Ϊ����ʾע�Ṧ�ܣ��˴����������֤
		int pwd = 123456;
		String type = "Agricultural Bank of China";
		double ban = 100000.0;

		BankCard actCardInfo = atmServer.register(acc, pwd, type, ban);
		BankCard excCardInfo = new BankCard(acc, pwd, type, ban);

		assertEquals(excCardInfo.toString(), actCardInfo.toString());
		// System.out.println("ע��ɹ���");
	}
}

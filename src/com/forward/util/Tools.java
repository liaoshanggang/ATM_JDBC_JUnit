package com.forward.util;

import java.util.UUID;

//���ߣ�MD5��String, ����ת�����ߣ����ö�ȡ������ID......
public class Tools {
	
	 public static String getUUID() {
		    return UUID.randomUUID().toString().replace("-","");
	 }
		
}

package com.Ngbussines.dao;

import java.util.List;

public interface membersDao {
	     //ע�ᡢ
	      public boolean Logon(String phone,String password);
	     //��¼��
		  public List login(String mobel, String password);
		 //��ѯ�Ƿ�����ͬ���ֻ��ţ���ͬ������ע�� 
		  public List samename(String mobel);
		  
		
}

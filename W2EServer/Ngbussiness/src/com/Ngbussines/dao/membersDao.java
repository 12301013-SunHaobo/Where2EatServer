package com.Ngbussines.dao;

import java.util.List;

public interface membersDao {
	     //注册、
	      public boolean Logon(String phone,String password);
	     //登录、
		  public List login(String mobel, String password);
		 //查询是否有相同的手机号，相同则不予以注册 
		  public List samename(String mobel);
		  
		
}

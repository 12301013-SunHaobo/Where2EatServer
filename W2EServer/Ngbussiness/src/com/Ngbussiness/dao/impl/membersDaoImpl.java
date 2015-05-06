package com.Ngbussiness.dao.impl;
import java.util.HashMap;
import java.util.List;

import com.Ngbussines.dao.membersDao;
import com.Ngbussiness.util.Calenda;
import com.Ngbussiness.util.DatabaseAccess;
import com.Ngbussiness.util.EasyMapsManager;
import com.Ngbussiness.util.MD5;


public class membersDaoImpl implements membersDao{
	public boolean Logon(String uPhone,String password){
		DatabaseAccess dao=new DatabaseAccess();
		Calenda C=new Calenda();
		String now=C.getNowTime().toString();
		String sql="insert into user (uPhone,password,role,logintime) values(?,?,?,?);";		

		dao.setPreparedParameter(uPhone);
		dao.setPreparedParameter(password);
		//注册用户的身份为2
		dao.setPreparedParameter(2);		
		dao.setPreparedParameter(now);		
		
		boolean b=dao.executeInsert(sql)>0?true:false;
		return b;
	}
	
	//查询是否有相同的手机号，相同则不予以注册
	public List samename(String uPhone){
		DatabaseAccess dao=new DatabaseAccess();
		String sql="select * from user where uPhone=?;";
		try{
			DatabaseAccess databaseAccess = new DatabaseAccess(false);
			EasyMapsManager easyMapsManager = new EasyMapsManager(databaseAccess);
			easyMapsManager.setPreparedParameter(uPhone);
			List list = easyMapsManager.executeQuery(sql);
			databaseAccess.close();
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List login (String uPhone,String password){
		DatabaseAccess dao=new DatabaseAccess();
		String sql="select user.userId,user.uPhone,user.role from user where user.uPhone=? and user.userPassword=?;";
		//"select m.Id,m.name,m.sex,m.mobel,m.email,m.province,m.city,m.bank_card,m.logintime,m.name1," +
		//"m.name2,m.name3 from memberview m where m.6+mobel=? And m.password=? AND is_useful=1;"
		try{
			DatabaseAccess databaseAccess = new DatabaseAccess(false);
			EasyMapsManager easyMapsManager = new EasyMapsManager(databaseAccess);
			easyMapsManager.setPreparedParameter(uPhone);
			easyMapsManager.setPreparedParameter(password);
			List list = easyMapsManager.executeQuery(sql);
			if(list.size()>0){
				HashMap adu=(HashMap)list.get(0);
				Calenda C=new Calenda();
				String curdate=C.getNowTime().toString();
				String Id=adu.get("userId").toString();
				adu.put("logintime",curdate);
				String sql2="update user set logintime=? where userId=?";
				dao.setPreparedParameter(curdate);
				dao.setPreparedParameter(Id);
				dao.executeUpdate(sql2);
			}
			databaseAccess.close();
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

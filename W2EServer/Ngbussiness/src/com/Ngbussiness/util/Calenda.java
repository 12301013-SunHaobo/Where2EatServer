package com.Ngbussiness.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

//获得当前日期时间
public class Calenda {

	public Timestamp getNowTime() throws ParseException {
		 Timestamp dateTime = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
			String s = formatter.format(curDate);// util类型
		    dateTime = Timestamp.valueOf(s);
			return dateTime;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dateTime;
	}
	
	public Timestamp getNowData() throws ParseException {
		 Timestamp dateTime = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
			String s = formatter.format(curDate);// util类型
		    dateTime = Timestamp.valueOf(s);
			return dateTime;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dateTime;
	}

}

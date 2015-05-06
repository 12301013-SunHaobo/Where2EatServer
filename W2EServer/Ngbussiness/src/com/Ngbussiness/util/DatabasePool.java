package com.Ngbussiness.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
 * @类名 DatabasePool
 * @功能描述 使用数据库连接池
 * @�?���?邓忠�?
 * @date 2014-3-15
 */
public class DatabasePool {

	private static DataSource datasource = null;

	static{
		datasource=new ComboPooledDataSource("c3p0pool");
	}

	public static Connection getConnection() {
		try {
			return datasource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

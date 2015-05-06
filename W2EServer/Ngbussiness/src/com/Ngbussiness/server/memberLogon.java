package com.Ngbussiness.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Ngbussines.dao.membersDao;
import com.Ngbussiness.dao.impl.membersDaoImpl;
import com.Ngbussiness.util.DataTools;


public class memberLogon extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		//获取用户注册时输入的数据
		String uPhone=request.getParameter("uPhone");
		//String name=request.getParameter("name");
		String password=request.getParameter("password");
		//默认性别为男
		//String sex="c4d0";
		membersDao members = new membersDaoImpl();
		List list=members.samename(uPhone);
		if(list.size()>0)
		{
			//如果有相同的手机号，返回以下内容
			out.print("user_exist");
		}
		else{
			boolean b1=members.Logon(DataTools.HexStringhtoString(uPhone),password);
			if(b1==true){
				//如果注册成功，返回sucess
			    out.print("success");
			}
			else
			{
			//否则返回error
				out.println("error");
			}
		}
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.Ngbussiness.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Ngbussines.dao.membersDao;
import com.Ngbussiness.dao.impl.membersDaoImpl;

import net.sf.json.JSONArray;

public class membersServlet extends HttpServlet {

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
		String uPhone=request.getParameter("uPhone");
		String password=request.getParameter("password");
		membersDao members = new membersDaoImpl();
		List list1=members.login(uPhone,password);
		if(list1.size()>0){
			HashMap adu=(HashMap)list1.get(0);
			String logintime=adu.get("logintime").toString();
			adu.put("logintime",logintime);
			JSONArray json=JSONArray.fromObject(list1);
			out.print(json);
			}
		else
		{
			out.println("error");
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

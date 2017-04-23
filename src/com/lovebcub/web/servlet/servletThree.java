package com.lovebcub.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletThree extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>doGet()方法被调用");
		super.doGet(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>doPost()方法被调用");
		super.doPost(req, resp);
	}

	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println(">>>>>>>>>service()方法，被调用");
		super.service(arg0, arg1);
		//派发器
	}

	public void destroy() {
		super.destroy();
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println(">>>>>>>>>initialize the Servlet初始化开始");
		super.init(config);
		
	}

}

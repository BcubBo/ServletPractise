package com.lovebcub.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletThree extends HttpServlet {

	

	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println(">>>>>>>>>service()方法调度器进行相应的post或者是get请求的调度，被调用");
		super.service(arg0, arg1);
		//派发器里的super不可取消
		//派发器
	}

	public void destroy() {
		System.out.println(">>>>>>>>>>>>destroy()方法被调用");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println(">>>>>>>>>initialize the Servlet初始化开始");
		System.out.println(">>>>>>>>取得初始化配置设置的参数setCharContent的值:"+config.getInitParameter("charSetContent"));
		
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>doGet()方法被调用");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>doPost()方法被调用");
	}

}

package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet{
	
	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("service()");
		
		//获得请求资源路径
		//http://ip:port/ajax/check.do
		//  请求资源路径   /ajax/check.do
		String uri = req.getRequestURI();
		System.out.println("uri："+uri);
		
		//分析路径  获取 "/check"
		String action = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
		System.out.println("action："+action);
		
		res.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = res.getWriter();
		
		//依据路径，进行不同处理
		if ("/check_admin".equals(action)) {
			String adminCode = req.getParameter("adminCode");
			System.out.println("adminCode："+adminCode);
			
			if ("King".equals(adminCode)) {
				out.println("账号已经存在");
			}else{
				out.println("可以使用");
			}
		}
	}
}

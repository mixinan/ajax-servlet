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
		
		//���������Դ·��
		//http://ip:port/ajax/check.do
		//  ������Դ·��   /ajax/check.do
		String uri = req.getRequestURI();
		System.out.println("uri��"+uri);
		
		//����·��  ��ȡ "/check"
		String action = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
		System.out.println("action��"+action);
		
		res.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = res.getWriter();
		
		//����·�������в�ͬ����
		if ("/check_admin".equals(action)) {
			String adminCode = req.getParameter("adminCode");
			System.out.println("adminCode��"+adminCode);
			
			if ("King".equals(adminCode)) {
				out.println("�˺��Ѿ�����");
			}else{
				out.println("����ʹ��");
			}
		}
	}
}

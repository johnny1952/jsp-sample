package com.servlet.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadCookie
 */
@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=GBK	");
		PrintWriter out=response.getWriter();
		//获取临时cookie
		Cookie tmp=getCookieValue(request.getCookies(), "temp");
		if(tmp != null)
		{
			out.write("临时cookie值:name:" + tmp.getName() + ",value:" + tmp.getValue()+"<br/>");
		}
		else
			out.write("临时cookie未设置"+"<br/>");
		//获取maxage为0的cookie
		Cookie cookie=getCookieValue(request.getCookies(), "cookie");
		if(cookie != null)
		{
			out.write("maxage为0 的cookie值:name:" + cookie.getName() + ",value:" + cookie.getValue()+"<br/>");
		}
		else
			out.write("cookie已删除"+"<br/>");
		//获取永久的cookie
		Cookie user=getCookieValue(request.getCookies(), "user");
		if(tmp != null)
		{
			out.write("永久的cookie值:name:" + user.getName() + ",value:" + user.getValue()+"<br/>");
		}
		else
			out.write("user未设置"+"<br/>");	
	}
	
	private Cookie getCookieValue(Cookie cookies[],String name)
	{
		if(cookies != null)
		{
			for(Cookie c:cookies)
			{
				if(c.getName().equals(name))
					return c;
			}
		}
		return null;
	}
}

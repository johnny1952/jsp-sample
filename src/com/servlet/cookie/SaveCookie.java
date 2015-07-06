package com.servlet.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveCookie
 */
@WebServlet("/SaveCookie")
public class SaveCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveCookie() {
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
		response.setContentType("text/html;charset=GBK");
		PrintWriter pw = response.getWriter();
		//设置临时cookie
		Cookie tempCookie=new Cookie("temp","123456");
		tempCookie.setMaxAge(-1);
		response.addCookie(tempCookie);
		//设置maxage为0的cookie
		Cookie cookie=new Cookie("cookie","1223333");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		//设置永久cookie
		String user=request.getParameter("user");
		if(user != null)
		{
			Cookie userCookie=new Cookie("user",user);
			userCookie.setMaxAge(60 * 60 *24);  //24 hours
			userCookie.setPath("/");
			response.addCookie(userCookie);
		}
		//包含
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/ReadCookie");
		rd.include(request, response);
		
	}
}

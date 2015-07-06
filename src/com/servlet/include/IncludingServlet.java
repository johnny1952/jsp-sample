package com.servlet.include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludingServlet
 */
@WebServlet("/IncludingServlet")
public class IncludingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncludingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plain;charset=gb2312");
		PrintWriter pw = response.getWriter();
		pw.write("<b>超人</b><br/>");
		pw.write("IncludingServlet URI:" + request.getRequestURI() + "<p/>");
		
		//include
		//此时，contenttype以includingservlet（调用者）的为准；不过html仍然以html中设置的编码为准。
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/IncludedServlet");
		rd.include(request, response);
		rd=getServletContext().getRequestDispatcher("/IncludedHtml.html");
		rd.include(request, response);
	}

}

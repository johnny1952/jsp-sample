package com.servlet.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewResponseHeader
 */
@WebServlet("/ViewResponseHeader")
public class ViewResponseHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewResponseHeader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//����http header
		response.setContentType("text/html;charset=utf-8");//utf-8,GBK
		response.setStatus(200);
		Calendar cal=Calendar.getInstance();
		cal.set(2015, 6, 3); //month [0,11]
		response.addDateHeader("mydate", cal.getTimeInMillis());
		response.setIntHeader("int", 100);
		//����getWriter��ͻ��˴�ӡ�ı�
		PrintWriter pw= response.getWriter();
		pw.println("�ҵ��й��ģ�");
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

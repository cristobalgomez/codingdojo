package com.clicker.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Counter
 */
@WebServlet("/Counter")
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Counter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int clicks = 0;
		
		if(!session.isNew()) clicks = (int) session.getAttribute("sessionClicks");
		
		session.setAttribute("sessionClicks", clicks);
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/counter.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		if(request.getParameter("add") != null) {
			int clicks = (int) session.getAttribute("sessionClicks");
			clicks++;
			session.setAttribute("sessionClicks", clicks);
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/counter.jsp");
			view.forward(request, response);	
		}

	}

}

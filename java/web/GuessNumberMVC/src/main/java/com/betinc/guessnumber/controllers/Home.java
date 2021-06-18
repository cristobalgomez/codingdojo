package com.betinc.guessnumber.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.betinc.guessnumber.models.RandomNumber;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		HttpSession session = request.getSession();
		
		
		if(session.isNew()) {
			RandomNumber randomNum = new RandomNumber();
			session.setAttribute("randomNumber", randomNum);
		}
		
		session.setAttribute("answered", "no");

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		RandomNumber randomNum = (RandomNumber) session.getAttribute("randomNumber");
		
		
		if(request.getParameter("submit") != null) {
			int answer = request.getParameter("number") != null && !request.getParameter("number").isEmpty() ? Integer.valueOf(request.getParameter("number")) : 0;
			String ans = randomNum.compareNumbers(answer);
			session.setAttribute("answer", ans);
			session.setAttribute("answered", "yes");
			
		} else if(request.getParameter("reset") != null) {
			randomNum = new RandomNumber();
			session.setAttribute("answer", "none");
			session.setAttribute("answered", "no");
		}
		
		session.setAttribute("randomNumber", randomNum);
		
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/index.jsp");
		view.forward(request, response);
	}

}

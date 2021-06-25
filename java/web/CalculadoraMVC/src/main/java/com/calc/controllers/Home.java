package com.calc.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.calc.models.Calculadora;

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
			Calculadora calc = new Calculadora();
			List<Double> results = new ArrayList<Double>();
			session.setAttribute("calc", calc);
			session.setAttribute("res", results);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String character = !request.getParameter("textcharacter").isEmpty() ? request.getParameter("textcharacter") : request.getParameter("character");
		Calculadora calc = (Calculadora) session.getAttribute("calc");
		
		List<Double> results = (ArrayList<Double>) session.getAttribute("res"); 
		//System.out.println(results);
		
		if(character.equals("*") || character.equals("/") || character.equals("+")|| character.equals("-")) {
			calc.performOperation(character);
			
		} else if(character.equals("=")) {
			calc.performOperation(character);
			
			double res = calc.getResult();
			results.add(res);
			session.setAttribute("res", results);
			
			calc = new Calculadora();
			session.setAttribute("calc", calc);
		
		} else {
			double number = Double.parseDouble(character);
			calc.performOperation(number);
		}
		session.setAttribute("calc", calc);
		
		response.sendRedirect("./Home");
	}

}

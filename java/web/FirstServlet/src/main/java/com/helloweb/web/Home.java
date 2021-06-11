package com.helloweb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String userFirstName = request.getParameter("firstName") != null ? request.getParameter("firstName") : "Unknown";
		String userLastName = request.getParameter("lastName") != null ? request.getParameter("lastName") : "Unknown";
		String userFavoriteLanguage = request.getParameter("favoriteLanguage") != null ? request.getParameter("favoriteLanguage") : "Unknown";
		String userHometown = request.getParameter("homeTown") != null ? request.getParameter("homeTown") : "Unknown";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, "+ userFirstName + " " + userLastName + "</h1>");
		out.write("<h2>Your favorite language is "+ userFavoriteLanguage + "</h2>");
		out.write("<h3>Your hometown is "+ userHometown + "</h3>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

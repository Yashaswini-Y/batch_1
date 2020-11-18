package com.insurance.quote.application;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReportGen
 */
@WebServlet("/ReportGeneration")
public class Report_Generation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String account_number=request.getParameter("account");
		RequestDispatcher rd=null;
		if(account_number==null) {
			out.println("*Account number must not be empty."
					+ " Please fill in the account number");
			rd=request.getRequestDispatcher("/Report.jsp");
			rd.include(request, response);
		}
		else if(account_number.length()<10) {
			out.println("Account number should be 10 digits."+" Please enter the correct account number.");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

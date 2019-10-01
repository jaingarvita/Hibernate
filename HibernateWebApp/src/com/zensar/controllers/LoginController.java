package com.zensar.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.dao.UserDao;
import com.zensar.dao.UserDaoImpl;
import com.zensar.entities.User;
import com.zensar.exception.ServiceException;

import com.zensar.services.UserService;
import com.zensar.services.UserServiceImpl;

/**
 * @author Garvita Jain
 * @version 2.0
 * @creation_date 21/09/2019 5:40PM
 * @modification_date 28/09/2019 11:12AM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Controller Class.
 *              
 *
 */
/**
 * Servlet implementation class LoginController
 */
@WebServlet("/checkuser")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Call business layer Component
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl();
		((UserServiceImpl) userService).setUserDao(userDao);
		setUserService(userService);
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet called");
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("passwd");
		User clientUser = new User();
		clientUser.setUsername(username);
		clientUser.setPassword(password);
		PrintWriter out = response.getWriter();

		try {
			// invoking business logic of business layer is presentation layer
			if (userService.validateUser(clientUser)) {

				// out.println("<p> Dear " + username + " Welcome to Online Shopping</p>");
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);

			} else {

				out.println("<p>Sorry! Invalid username or password</p>");

				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("doPost is called");
		doGet(request, response);
	}

}

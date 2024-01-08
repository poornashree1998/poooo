package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private loginDao logindao;
	public void init()
	{
		logindao = new loginDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        
        login login = new login();
        login.setUsername(username);
        login.setPassword(password);
        try {
        logindao.logininform(login);
        }catch(Exception e)
        {
        	e.printStackTrace();
	}
        response.sendRedirect("login.html");
}
}

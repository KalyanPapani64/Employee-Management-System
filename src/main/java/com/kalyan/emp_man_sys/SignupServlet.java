package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.io.PrintWriter;

import com.kalyan.emp_man_sys.repository.LoginRepository;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signupservlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignupServlet() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1:
		String username=request.getParameter("uname");
		String passwordEnteredFromUI=request.getParameter("passwd");
		//step2:
		LoginRepository repo=new LoginRepository();
		repo.registerUser(username,passwordEnteredFromUI);
		int result=repo.registerUser(username, passwordEnteredFromUI);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(result>0)
		{
			pw.println("Registered Sucessfully");
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		else
		{
			pw.println("Registered Failed");
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}

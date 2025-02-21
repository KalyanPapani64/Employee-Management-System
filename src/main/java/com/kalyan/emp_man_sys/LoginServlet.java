package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.kalyan.emp_man_sys.repository.LoginRepository;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1:
		String username=request.getParameter("uname");
		String passwordEnteredFromUI=request.getParameter("passwd");
		//step2:
		LoginRepository repo=new LoginRepository();
		String PasswordPresentInDB= repo.getPassword(username);
		PrintWriter pw=response.getWriter();
		if (PasswordPresentInDB.length()==0) {
			pw.println("<h1>Entered username is Invalid..</h1>");
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		else if(passwordEnteredFromUI.equals(PasswordPresentInDB)) {
		RequestDispatcher rd= request.getRequestDispatcher("home.jsp");
		request.setAttribute("username", username);
		rd.include(request, response);

		}
		else {
		pw.println("<h1>Invalid Password.</h1>");
		RequestDispatcher rd= request.getRequestDispatcher("login.html");
		rd.include(request, response);
		}
	}

}

package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.io.PrintWriter;

import com.kalyan.emp_man_sys.repository.EmployeeRepository;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteemployee")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteEmployeeServlet() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid= Integer.parseInt(request.getParameter("empid"));
		EmployeeRepository repo= new EmployeeRepository();
		int result=repo.deleteEmployee(empid);
		response.setContentType("text/html");
		if(result>0){
		PrintWriter pw= response.getWriter();

		pw.println("details of "+empid+" is deleted Successfully");
		}
		else {
		PrintWriter pw= response.getWriter();
		pw.println("deletion of details of "+empid+" is Failed");
		}
		RequestDispatcher rd= request.getRequestDispatcher("retrieveall");
		rd.include(request, response);
	}

}

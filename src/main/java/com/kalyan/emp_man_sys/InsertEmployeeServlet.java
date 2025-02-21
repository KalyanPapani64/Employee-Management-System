package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.io.PrintWriter;

import com.kalyan.emp_man_sys.model.Employee;
import com.kalyan.emp_man_sys.repository.EmployeeRepository;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/insertemployee")
public class InsertEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertEmployeeServlet() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1:
		int empid= Integer.parseInt(request.getParameter("empid"));
		String empname= request.getParameter("empname");
		String empfname= request.getParameter("empfname");
		String gender= request.getParameter("gender");
		int experience= Integer.parseInt(request.getParameter("experience"));
		int depid= Integer.parseInt(request.getParameter("depid"));
		int desid= Integer.parseInt(request.getParameter("desid"));
		Employee emp= new Employee();
		emp.setEmpid(empid);
		emp.setEmpname(empname);
		emp.setEmpfname(empfname);
		emp.setGender(gender);
		emp.setExperience(experience);
		emp.setDepid(depid);
		emp.setDesid(desid);
		EmployeeRepository repo= new EmployeeRepository();
		int result = repo.insertEmployee(emp);
		response.setContentType("text/html");
		if(result>0){
		PrintWriter pw= response.getWriter();
		pw.println("details are inserted Successfully");
		}
		else {
		PrintWriter pw= response.getWriter();
		pw.println("insertion of details is Failed");
		}
		RequestDispatcher rd= request.getRequestDispatcher("retrieveall");
		rd.include(request, response);
	}

}

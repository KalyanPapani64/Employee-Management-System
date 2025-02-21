package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.io.PrintWriter;

import com.kalyan.emp_man_sys.repository.DepartmentRepository;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deletedepartment")
public class DeleteDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteDepartmentServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int depid= Integer.parseInt(request.getParameter("depid"));
		DepartmentRepository repo= new DepartmentRepository();
		int result=repo.deleteDepartment(depid);
		response.setContentType("text/html");
		if(result>0){
		PrintWriter pw= response.getWriter();

		pw.println("details of "+depid+" is deleted Successfully");
		}
		else {
		PrintWriter pw= response.getWriter();
		pw.println("deletion of details of "+depid+" is Failed");
		}
		RequestDispatcher rd= request.getRequestDispatcher("retrieveall");
		rd.include(request, response);
	}

}

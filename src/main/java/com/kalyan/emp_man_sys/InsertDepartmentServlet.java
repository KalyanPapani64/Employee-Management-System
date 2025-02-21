 package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.io.PrintWriter;

import com.kalyan.emp_man_sys.model.Department;
import com.kalyan.emp_man_sys.repository.DepartmentRepository;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/insertdepartment")
public class InsertDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertDepartmentServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1:
		int depid= Integer.parseInt(request.getParameter("depid"));
		String depname= request.getParameter("depname");
		String deploc= request.getParameter("deploc");
		Department dep= new Department();
		dep.setDepid(depid);
		dep.setDepname(depname);
		dep.setDeploc(deploc);

		DepartmentRepository repo= new DepartmentRepository();
		int result = repo.insertDepartment(dep);
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

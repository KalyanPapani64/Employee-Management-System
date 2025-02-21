package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.util.List;

import com.kalyan.emp_man_sys.model.Department;
import com.kalyan.emp_man_sys.model.Designation;
import com.kalyan.emp_man_sys.model.Employee;
import com.kalyan.emp_man_sys.repository.DepartmentRepository;
import com.kalyan.emp_man_sys.repository.DesignationRepository;
import com.kalyan.emp_man_sys.repository.EmployeeRepository;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/retrieveall")
public class RetrieveAllInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RetrieveAllInfo() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeRepository repo1=new EmployeeRepository();
		List<Employee> empList= repo1.getAllEmployeeInfo();
		request.setAttribute("employeeList", empList);
		
		DepartmentRepository repo2=new DepartmentRepository();
		List<Department> depList= repo2.getAllDepartmentInfo();
		request.setAttribute("departmentList", depList);
		
		DesignationRepository repo3=new DesignationRepository();
		List<Designation> desList= repo3.getAllDesignationInfo();
		request.setAttribute("designationList", desList);
		
		RequestDispatcher rd = request.getRequestDispatcher("DisplayAllList.jsp");
		rd.include(request, response);
	}

}

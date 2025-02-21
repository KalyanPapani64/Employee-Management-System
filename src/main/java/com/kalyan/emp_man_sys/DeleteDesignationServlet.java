package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.io.PrintWriter;

import com.kalyan.emp_man_sys.repository.DesignationRepository;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deletedesignation")
public class DeleteDesignationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteDesignationServlet() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int desid= Integer.parseInt(request.getParameter("desid"));
		DesignationRepository repo= new DesignationRepository();
		int result=repo.deleteDesignation(desid);
		response.setContentType("text/html");
		if(result>0){
		PrintWriter pw= response.getWriter();

		pw.println("details of "+desid+" is deleted Successfully");
		}
		else {
		PrintWriter pw= response.getWriter();
		pw.println("deletion of details of "+desid+" is Failed");
		}
		RequestDispatcher rd= request.getRequestDispatcher("retrieveall");
		rd.include(request, response);
	}

}

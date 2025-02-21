package com.kalyan.emp_man_sys;

import java.io.IOException;
import java.io.PrintWriter;

import com.kalyan.emp_man_sys.model.Designation;
import com.kalyan.emp_man_sys.repository.DesignationRepository;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updatedesignation")
public class UpdateDesignationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateDesignationServlet() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1:
				int desid= Integer.parseInt(request.getParameter("desid"));
				String desname= request.getParameter("desname");
				int despay= Integer.parseInt(request.getParameter("despay"));
				Designation des= new Designation();
				des.setDesid(desid);
				des.setDesname(desname);
				des.setDespay(despay);
				DesignationRepository repo= new DesignationRepository();
				int result = repo.updateDesignation(des);
				response.setContentType("text/html");
				if(result>0){
				PrintWriter pw= response.getWriter();
				pw.println("details of "+desid+" is updated Successfully");
				}
				else {
				PrintWriter pw= response.getWriter();
				pw.println("details of "+desid+" is updated Failed");
				}
				RequestDispatcher rd= request.getRequestDispatcher("retrieveall");
				rd.include(request, response);
	}

}

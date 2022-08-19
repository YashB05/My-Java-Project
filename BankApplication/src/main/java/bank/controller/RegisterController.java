package bank.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.dao.RegistrerDao;
import bank.model.Register;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rno=Integer.parseInt(request.getParameter("rno"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		double accbal=Double.parseDouble(request.getParameter("accbal"));
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		Register regmodle=new Register(rno, fname, lname, accbal, uname, pass);
		List<Register> lstreg=new ArrayList<Register>();
		RegistrerDao regdao=new RegistrerDao();
		
		
		lstreg.add(regmodle);
		int i=regdao.Create(lstreg);
		if(i>0) { 
			response.sendRedirect("Login.html");
		}
		else {
			response.sendRedirect("Error.html");
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

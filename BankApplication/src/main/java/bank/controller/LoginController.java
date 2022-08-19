package bank.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bank.dao.RegistrerDao;
import bank.model.Login;
import bank.model.Register;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static int logincnt=0;
		
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		Login loginmodel=new Login(uname, pass);
		loginmodel.setUname(uname);
		loginmodel.setPass(pass);
		List<Login> lstlogin=new ArrayList<Login>();
		lstlogin.add(loginmodel);
		
		RegistrerDao regdaoDao=new RegistrerDao();
		List<Register> lstreg=regdaoDao.validateData(lstlogin);
		HttpSession session=request.getSession();
		session.setAttribute("cust", lstreg);
		if(lstreg!=null) {
			response.sendRedirect("Dashboard.html");
		}
		else {
			logincnt++;
			if(logincnt<3)
				response.sendRedirect("Login.html");
			else {
				response.sendRedirect("Block.html");
			}
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

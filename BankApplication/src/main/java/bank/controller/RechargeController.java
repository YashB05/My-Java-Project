package bank.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bank.dao.RechargeDao;
import bank.model.Recharge;
import bank.model.Register;

/**
 * Servlet implementation class RechargeController
 */
public class RechargeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechargeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String mobNo=request.getParameter("mobNo");
		double recrgamt=Double.parseDouble(request.getParameter("recrgamt")) ;
		String servcPro=request.getParameter("servcPro");
		
		HttpSession session=request.getSession();
		
		List<Register> lstreg=(List<Register>)session.getAttribute("cust");
		Register r=lstreg.get(0);
		Recharge rechobj=new Recharge(r.getRno(),mobNo, recrgamt, servcPro);
		
		List<Recharge> lstrech=new ArrayList<Recharge>();
		lstrech.add(rechobj);
		
		RechargeDao rechdao=new  RechargeDao();
		System.out.println("entered dao");
		boolean b=rechdao.rechargeData(lstrech);
		if(b){
			response.sendRedirect("RechargeDone.jsp");
		}else {
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

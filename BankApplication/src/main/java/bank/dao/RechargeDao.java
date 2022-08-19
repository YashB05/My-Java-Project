package bank.dao;

import java.io.PrintWriter;
import java.sql.*;
import java.util.List;

import bank.model.Recharge;

public class RechargeDao {

	public boolean rechargeData(List<Recharge> lstrech) {
		boolean b=false;
		Recharge robj=lstrech.get(0);
		double bal=0 ,rbal=0;
		int i=0;
		Connection con=DataSource.getConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("select acc_bal from bank where register_no=?");
			pstate.setInt(1, robj.getRegNO());
			ResultSet rs=pstate.executeQuery();
			if(rs.next()) {
				bal=rs.getDouble(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(bal>=1000) {
			rbal=bal-robj.getRecrgamt();
		}
		//UPDATE TO DATABASE
		try {
			PreparedStatement pstate=con.prepareStatement("update bank set acc_bal=? where register_no=?");
			System.out.println("updated");
			pstate.setDouble(1, rbal);
			pstate.setInt(2, robj.getRegNO());
			i= pstate.executeUpdate();
			if (i>0) {
				b=true;
				System.out.println("Recharge DONE...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}
}

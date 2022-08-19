package bank.dao;
import java.security.PublicKey;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import bank.model.Login;
import bank.model.Register;

public class RegistrerDao {
	Connection con=DataSource.getConnection();
	public int Create(List<Register> lstreg) {
		Register regmodel=lstreg.get(0);
		int i=0;
		
		try {
			PreparedStatement pstate=con.prepareStatement("insert into bank values(?,?,?,?,?,?)");
			pstate.setInt(1,regmodel.getRno());
			pstate.setString(2, regmodel.getFanme());
			pstate.setString(3,regmodel.getLname());
			pstate.setDouble(4, regmodel.getAccbal());
			pstate.setString(5, regmodel.getUname());
			pstate.setString(6, regmodel.getPass());

			i=pstate.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;


	}
	public List<Register> validateData(List<Login> lstlogin) {
		boolean b=true;
		Login loginmodel=lstlogin.get(0);
		List<Register> lstreg=null;
		Connection con=DataSource.getConnection();

		try {
			PreparedStatement pstate=con.prepareStatement("select * from bank where u_name=? and pass=?");
			pstate.setString(1, loginmodel.getUname());
			pstate.setString(2, loginmodel.getPass());
			ResultSet rs=pstate.executeQuery();
			if (rs.next()) {
				b=true;
				lstreg=new ArrayList();
				Register r=new Register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6));
				lstreg.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstreg;

	}
	public Register SearchRecord(int rno) {
		Register temp=null;
		List<Register> lst=getAllData();
		for(Register r:lst) {
			
			if(r.getRno()==rno) {
				System.out.println("search...");
				temp=r;
				break;
			}
		}
		return temp;
		
	}
	public List<Register> getAllData() {
		List<Register> lst=new LinkedList<Register>();
		con=DataSource.getConnection();
		try {
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from bank");
			while(rs.next()) {
				Register a=new Register();
				a.setRno(rs.getInt(1));
				a.setFanme(rs.getString(2));
				a.setLname(rs.getString(3));
				a.setAccbal(rs.getDouble(4));
				lst.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}

}


/*
 create table bank(
 register_no number(5) primary key,
 f_name varchar2(20),
 l_name varchar2(20),
 Acc_bal float,
 u_name varchar2(20),
 pass varchar2(20)

 );
 * 
 * */

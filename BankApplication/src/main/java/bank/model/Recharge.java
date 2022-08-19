package bank.model;

public class Recharge {

	private int regNO;
	private String mobNo;
	private double recrgamt;
	private String servcPro;
	public Recharge(int regNO, String mobNo, double recrgamt, String servcPro) {
		super();
		this.regNO = regNO;
		this.mobNo = mobNo;
		this.recrgamt = recrgamt;
		this.servcPro = servcPro;
	}
	public int getRegNO() {
		return regNO;
	}
	public void setRegNO(int regNO) {
		this.regNO = regNO;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public double getRecrgamt() {
		return recrgamt;
	}
	public void setRecrgamt(double recrgamt) {
		this.recrgamt = recrgamt;
	}
	public String getServcPro() {
		return servcPro;
	}
	public void setServcPro(String servcPro) {
		this.servcPro = servcPro;
	}
	
	
}

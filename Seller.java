package FinalProject;

public class Seller extends Manager {
    public int worktime;//in month
	public Seller(String n, String sn,int worktime) {
		super(n, sn);
		this.worktime=worktime;
		// TODO Auto-generated constructor stub
	}
	@Override 
	public int GetSalary() {
		return 100000;
		
	}
	
	public void SetWorktime(int worktime) {
		this.worktime=worktime;
	}
	public int GetWotktime() {
		return worktime;
	}
	@Override 
	public Boolean GetVacation () {
		if (worktime>3) {
			return true;
		}
		else {
		return false;	
		}
		
	}
	public Boolean SaleBook() {
		//there should be some code with a link to the library
		return true ;
	}
	public Boolean  ReturnBook() {
		//some code 
		return true;
	}

}

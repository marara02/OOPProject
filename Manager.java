package FinalProject;

public class Manager extends Boss {

	public Manager(String n, String sn) {
		super(n, sn);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public int GetSalary() {
		return 200000;
		
	}
	@Override 
	public Boolean GetVacation () {
		return true;
	}
	public Boolean AddBook() {
		//some code;
		return true;
	}

}

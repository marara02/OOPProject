package Workers;

public class Boss extends Worker {
	public Boss(String name,String surname) {
		super(name,surname);
		
		
	}

	@Override
	public Boolean GetVacation() {
		return true ;
	}

	@Override
	public int GetSalary() {
		// TODO Auto-generated method stub
		return 500000;
	}
	@Override
	public String toString () {
		return "The personal information of the Boss :{"
				+ Name +" " + Surname+", salary:"+GetSalary()+"}";
	}
	

}

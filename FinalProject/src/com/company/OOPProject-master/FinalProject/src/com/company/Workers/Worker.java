package Workers;

public abstract class Worker {//It is an abstract class, because i needed an constructor to create a person. With interface i can not to do it 
	public 	String Name;
	public String Surname;
	public Worker(String Name, String Surname){
		this.Name=Name;
		this.Surname=Surname;
	}
	public void SetName(String Name) {
		this.Name=Name;
	}
	public String GetName() {
	return Name;
	}
	public void SetSurname(String Surname) {
		this.Surname=Surname;
	}
	public String GetSurname() {
	return Surname;
	}
	public int salary;
	abstract public int GetSalary();	//it will be different for workers 
	abstract public Boolean GetVacation();
	
	public String toString () {
		return "Worker's personal information:{"
				+ Name +" " + Surname+", salary:"+salary+"}";
	}

}

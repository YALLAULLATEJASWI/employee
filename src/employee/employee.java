package employee;

public class employee {
	private int empId;
	private String name;
	private double salary;
	public employee(int empId, String name, double salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("Id:"+empId);
		System.out.println("Name:"+name);
		System.out.println("salary:"+salary);
	}
	
}

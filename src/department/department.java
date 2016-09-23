package department;

import employee.employee;


public class department extends employee {
	
	private String deptName;
	
	public department(int empId, String name, double salary,String deptName) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	this.deptName=deptName;
	
	
	}
public void show()
{
	
	System.out.println("Dept:"+deptName);
}

	
}

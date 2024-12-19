// Parameterized Constructor

class Employee 
{
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee(int empId, String empName, double empSalary ){
		this.empId = empId;
		this. empName = empName;
		this.empSalary = empSalary;
	}
	
	public void empDetailInfo(){
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name:"+ empName);
		System.out.println("Employee Salary: " + empSalary);
	}
	}
	
	
	
	class Constructor_02
	{
	
	public static void main(String[] args) 
	{
		Employee c =  new Employee(12,"kedar", 2300000d);
		c.empDetailInfo();
	}
}

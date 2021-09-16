package Encapsulation;

public class Employee //pojo beans value object transfer object
{
	private int empno;
	private String Empname;
	private String city;
	private int salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return Empname;
	}
	
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int empno, String empname, String city, int salary) {
		super();
		this.empno = empno;
		Empname = empname;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", Empname=" + Empname + ", city=" + city + ", salary=" + salary + "]";
	
	}
}

package Encapsulation;

public class Empmanage {
	void addEmployee()
	{
		Employee e1=new Employee(110,"Amar","Ghazipur",25000);
		
		System.out.println(e1);
	}
	
	void dispEmployee(Employee emp)
	{
		System.out.println("Empno "+emp.getEmpno());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getCity());
		System.out.println(emp.getSalary());
	}

}

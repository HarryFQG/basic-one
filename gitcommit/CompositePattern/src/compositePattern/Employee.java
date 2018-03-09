package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;	
	private String dept;
	private int salary;
	List<Employee> subordinates;
	
	//------------------------------------------------
	
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates=new ArrayList<Employee>();
	}
	
	
	//------------------------------------------------
	
	
	public void add(Employee employee){
		subordinates.add(employee);		
	}
	public void remove(Employee employee){
		subordinates.remove(employee);
	}
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	
	
	//--------------------------------------------------
	public String toString(){
		String str="Employee:[name:"+name+",  dept: "+dept+",salary: "+salary+"  ]";
		return str;
	}
	
}

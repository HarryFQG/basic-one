package Demo5;

public class Person {

	private String name;
	private int age;
	
	public Person(){
		System.out.println("Person无参构造");
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("Person全参构造");
	}
	
	public int worker( int salary){
		System.out.println("person.worker");
		return salary*10;
	}
	
	
	public String getInfo(){
		System.out.println("person.getInfo");
		return "姓名："+name+",年龄："+age;
	}
	
}

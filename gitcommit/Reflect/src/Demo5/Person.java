package Demo5;

public class Person {

	private String name;
	private int age;
	
	public Person(){
		System.out.println("Person�޲ι���");
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("Personȫ�ι���");
	}
	
	public int worker( int salary){
		System.out.println("person.worker");
		return salary*10;
	}
	
	
	public String getInfo(){
		System.out.println("person.getInfo");
		return "������"+name+",���䣺"+age;
	}
	
}

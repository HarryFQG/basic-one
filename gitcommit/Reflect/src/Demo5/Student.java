package Demo5;

public class Student {
	
	private String  name;
	private int  id;
	public Student(){
		System.out.println("Student无参构造");
	}
	public Student(String name, int id) {
		System.out.println("Student全参构造");
		this.name = name;
		this.id = id;
	}
	
	public void working(int limit){
		System.out.println("已经做了"+limit*5+"个作业");
	}
	public void sleep(int limit){
		System.out.println("已经睡了"+limit*5+"个小时");
	}
}

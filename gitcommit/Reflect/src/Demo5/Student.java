package Demo5;

public class Student {
	
	private String  name;
	private int  id;
	public Student(){
		System.out.println("Student�޲ι���");
	}
	public Student(String name, int id) {
		System.out.println("Studentȫ�ι���");
		this.name = name;
		this.id = id;
	}
	
	public void working(int limit){
		System.out.println("�Ѿ�����"+limit*5+"����ҵ");
	}
	public void sleep(int limit){
		System.out.println("�Ѿ�˯��"+limit*5+"��Сʱ");
	}
}

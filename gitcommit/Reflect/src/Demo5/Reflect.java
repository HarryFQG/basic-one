package Demo5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflect {

	Student stu;
	public Reflect(){
		
	}
	public Reflect(Student stu){
		this.stu=stu;
	}
	
	static int cangSalary;
	static{
			try {
				Class c = Class.forName("Demo5.Person");
				Constructor cons = c.getConstructor(String.class,int.class);
				Object CangTeacher = cons.newInstance("���忪",33);
				Method method = c.getMethod("worker", int.class);
				Object invoke = method.invoke(CangTeacher, 1000);	
				cangSalary=(int)invoke;
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} 
		}
	public void getSelary(){
		
		 stu.working(cangSalary);
	}
	
}

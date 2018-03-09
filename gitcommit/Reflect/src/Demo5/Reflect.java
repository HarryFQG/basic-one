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
				Object CangTeacher = cons.newInstance("五五开",33);
				Method method = c.getMethod("worker", int.class);
				Object invoke = method.invoke(CangTeacher, 1000);	
				cangSalary=(int)invoke;
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} 
		}
	public void getSelary(){
		
		 stu.working(cangSalary);
	}
	
}

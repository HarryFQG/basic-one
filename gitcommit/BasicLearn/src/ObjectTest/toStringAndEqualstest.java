package ObjectTest;

import org.junit.Test;

/**
 * object 类的测试类
 * @author Administrator
 *
 */
public class toStringAndEqualstest {
	/**
	 * 测试toString方法
	 */
	@Test
	public void toStringTest(){
		Emp emp=new Emp("eric",8000,"4546848545645465");
		Emp emp1=new Emp("join",9000,"545745744857555");
		System.out.println(emp.toString());
		System.out.println(emp1.toString());
	}
	//@Test
	/**
	 * 测试equalsTest（）的方法
	 */
	public void equalsTest(){
		Emp emp1=new Emp("hou",7555,"54654542154");
		Emp emp2=new Emp("hou",7555,"54654542154");
		/* equals方法返回true，说明两个字符串相等（相同）；
		 *             false，则说明两个字符串不相等*/
		System.out.println(emp1.equals(emp2));//其结果是：false
	}
}

class Emp{
	/*一个完整的类，建议具有以下部分内容
	 * 1.私有的成员变量
	 * 2.对外抛出公共的访问成员变量的方法：getter/setter
	 * 3.无参的默认构造方法和初始化所有成员变量的带参构造方法
	 * 4.描述类对象的toString方法
	 */
	private String name;
	private double salary;
	private String pid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	//带参构造
	public Emp(String name, double salary, String pid) {
		
		this.name = name;
		this.salary = salary;
		this.pid = pid;
	}
	//无参构造
	public Emp() {
		
	}
	/**
	 * 重写object类中的toString方法：自定义专门的类描述信息
	 * 格式：类名[属性名=属性值队列表]
	 */
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", pid=" + pid + "]";
	}
	/**
	 * 重写 equals方法：
	 *     返回值类型必须是boolean类型：
	 *        返回true，说明两个对象的值相等
	 *        否则返回false，说明两个值不相等
	 *     参数类型必须是Object类型
	 * @return
	 */
	@Override 
	public boolean equals(Object obj){
		/*
		 * 判断两个对象是否相等的步骤：
		 * 1.先判断传入的对象是否为null
		 *   如果为null，直接返回false，一定不相等
		 * 2.在判断当前对象(this)和传入的对象(obj)是否是同一个对象（==）；
		 *   如果是同一个对象，直接返回true，表示一定相等
		 * 3.判断传入对象是否和当前对象是同一个类型
		 *   如果不是同一个类型，直接返回false，表示一定不相等
		 * 4.**如果两个对象是同一个类型，就要进一步比较两个对象的关建属性是否相等
		 *    先将传入对象类型转换为当前对象
		 *      如果关键属性相等，则返回true，表示两个对象相等
		 *      否则返回false
		 */
		if(obj==null){
			return false; 
		} else if(this==obj){
			return true;
		}else if(!(obj instanceof Emp)){
			return false;
		}else {
			Emp emp=(Emp)obj;
			/*pid是字符串类型，判断两个字符串必须用到equals*/
			if(this.pid.equals(emp.pid)){
				return true;	
			}else{
				return false;
			}
		}
	}
}

package ObjectTest;

import org.junit.Test;

/**
 * object ��Ĳ�����
 * @author Administrator
 *
 */
public class toStringAndEqualstest {
	/**
	 * ����toString����
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
	 * ����equalsTest�����ķ���
	 */
	public void equalsTest(){
		Emp emp1=new Emp("hou",7555,"54654542154");
		Emp emp2=new Emp("hou",7555,"54654542154");
		/* equals��������true��˵�������ַ�����ȣ���ͬ����
		 *             false����˵�������ַ��������*/
		System.out.println(emp1.equals(emp2));//�����ǣ�false
	}
}

class Emp{
	/*һ���������࣬����������²�������
	 * 1.˽�еĳ�Ա����
	 * 2.�����׳������ķ��ʳ�Ա�����ķ�����getter/setter
	 * 3.�޲ε�Ĭ�Ϲ��췽���ͳ�ʼ�����г�Ա�����Ĵ��ι��췽��
	 * 4.����������toString����
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
	
	//���ι���
	public Emp(String name, double salary, String pid) {
		
		this.name = name;
		this.salary = salary;
		this.pid = pid;
	}
	//�޲ι���
	public Emp() {
		
	}
	/**
	 * ��дobject���е�toString�������Զ���ר�ŵ���������Ϣ
	 * ��ʽ������[������=����ֵ���б�]
	 */
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", pid=" + pid + "]";
	}
	/**
	 * ��д equals������
	 *     ����ֵ���ͱ�����boolean���ͣ�
	 *        ����true��˵�����������ֵ���
	 *        ���򷵻�false��˵������ֵ�����
	 *     �������ͱ�����Object����
	 * @return
	 */
	@Override 
	public boolean equals(Object obj){
		/*
		 * �ж����������Ƿ���ȵĲ��裺
		 * 1.���жϴ���Ķ����Ƿ�Ϊnull
		 *   ���Ϊnull��ֱ�ӷ���false��һ�������
		 * 2.���жϵ�ǰ����(this)�ʹ���Ķ���(obj)�Ƿ���ͬһ������==����
		 *   �����ͬһ������ֱ�ӷ���true����ʾһ�����
		 * 3.�жϴ�������Ƿ�͵�ǰ������ͬһ������
		 *   �������ͬһ�����ͣ�ֱ�ӷ���false����ʾһ�������
		 * 4.**�������������ͬһ�����ͣ���Ҫ��һ���Ƚ���������Ĺؽ������Ƿ����
		 *    �Ƚ������������ת��Ϊ��ǰ����
		 *      ����ؼ�������ȣ��򷵻�true����ʾ�����������
		 *      ���򷵻�false
		 */
		if(obj==null){
			return false; 
		} else if(this==obj){
			return true;
		}else if(!(obj instanceof Emp)){
			return false;
		}else {
			Emp emp=(Emp)obj;
			/*pid���ַ������ͣ��ж������ַ��������õ�equals*/
			if(this.pid.equals(emp.pid)){
				return true;	
			}else{
				return false;
			}
		}
	}
}

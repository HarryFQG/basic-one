package compositePattern;

public class Test {

	
	public static void main(String[] args) {
		Employee CEO=new Employee("张伟","CEO",30000);
		Employee CTO=new Employee("大鹏","CTO",10000);
		Employee CFO=new Employee("恒","CFO",20000);
		Employee tech1=new Employee("tech1","CTO",7000);
		Employee tech2=new Employee("tech2","CTO",7000);
		Employee mon1=new Employee("mon1","CFO",5000);
		Employee mon2=new Employee("mon2","CFO",5000);
		Employee bina1=new Employee("bina1","CEO",20000);
		Employee bina2=new Employee("bina2","CEO",20000);
		
		CEO.add(bina1);CEO.add(bina2);
		CFO.add(mon1);CFO.add(mon2);
		CTO.add(tech1);CTO.add(tech2);
		
		System.out.println("---------------------------");
		System.out.println(CEO);
		System.out.println("---------------副总------------");
		for(Employee e:CEO.getSubordinates()){
			System.out.println(e);
		}
		System.out.println("--------------技术部-------------");
		for(Employee e:CTO.getSubordinates()){
			System.out.println(e);
		}
		
		
		System.out.println("---------------财务部------------");
		for(Employee e:CFO.getSubordinates()){
			System.out.println(e);
		}
		
	}
}

package bridgePattern;

public class Test {

	
	public static void main(String[] args) {
		Shape redCricle=new Cricle(10,10,100,new D_RedCricle());	
		redCricle.draw();
		System.out.println("------------------------------------");
		Shape greebCricle=new Cricle(10,100,10,new D_GreenCricle());	
		greebCricle.draw();
		System.out.println("------------------------------------");
		Shape blueCricle=new Cricle(100,10,10,new D_BlueCricle());	
		
		
		blueCricle.draw();
		
	}
}

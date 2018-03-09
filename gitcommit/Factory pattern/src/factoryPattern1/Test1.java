package factoryPattern1;

public class Test1 {
	public static void main(String[] args) {
		Shape square=FactoryPatternProducer.getShape("Square");
		square.draw();
		Shape rectangle=FactoryPatternProducer.getShape("rectangle");
		rectangle.draw();
		Shape criclr=FactoryPatternProducer.getShape("criclr");
		criclr.draw();
		
	}
	
	
}

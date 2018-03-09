package factoryPattern1;

public class FactoryPatternProducer {
	public static Shape getShape(String shapeType){
		if(shapeType==null){
			return null;			
		}else if(shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("Criclr")){
			return new Criclr();			
		}else if(shapeType.equalsIgnoreCase("Square")){
			return new Square();
		}else return null;
		
	}
}

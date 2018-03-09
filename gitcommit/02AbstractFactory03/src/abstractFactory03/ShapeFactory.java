package abstractFactory03;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String colorType) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {

		if(shapeType==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new S_01_Rectangle();
		}else if(shapeType.equalsIgnoreCase("CRICLE")){
			return new S_01_Cricle();
		}else if(shapeType.equalsIgnoreCase("Square"))return new S_01_Square();		
		return null;	
	}

}

package abstractFactory0303;

public class A_Shape extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		if(shape==null){
			return null;}
		if(shape.equalsIgnoreCase("cricle")){
			
			return new S_Cricle();
		}else if(shape.equalsIgnoreCase("retangle")){
			return new S_Retangle();
		}else if(shape.equalsIgnoreCase("square")){
			return new S_Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		
		return null;
	}

}

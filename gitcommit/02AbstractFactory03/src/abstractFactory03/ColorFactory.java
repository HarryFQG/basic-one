package abstractFactory03;

public class ColorFactory  extends AbstractFactory{

	@Override
	Color getColor(String colorType) {
		if(colorType==null){
		return null;
	}
	if(colorType.equalsIgnoreCase("RED")){
		return new C_01_Red();
	}else if(colorType.equalsIgnoreCase("Blue")){
		return new C_01_Bule();
	}else if(colorType.equalsIgnoreCase("GREEN"))return new C_01_Green();		
	return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}

package abstractFactory03;

public class FactoryProducer {
	public static  AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("Color")){
			return new ColorFactory();
		}
		return null;
	}
	public static  AbstractFactory getFactory(String choice1,String choice2){
		if((choice1.equalsIgnoreCase("shape")&&choice2.equalsIgnoreCase("color"))){
			return new ShapeFactory();
		}else if(choice1.equalsIgnoreCase("Color")&&choice2.equalsIgnoreCase("shape")){
			return new ColorFactory();
		}
		return null;
	}
}

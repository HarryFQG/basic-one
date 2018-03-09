package abstractFactory0303;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("Shape")){
			return new A_Shape();			
		}else if(choice.equalsIgnoreCase("color")){
			return new A_Color();
		}		
		return null;
	}
}

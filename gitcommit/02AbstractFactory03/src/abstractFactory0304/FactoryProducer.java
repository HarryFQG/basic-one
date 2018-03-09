package abstractFactory0304;

public class FactoryProducer {
	public static B_T_Factory getFactory(String choice){
		if(choice.equalsIgnoreCase("Book")){
			return new BookFactory();
		}else if(choice.equalsIgnoreCase("TargetY")){
			return new TargetFactory();
		}else return null;
	}
}

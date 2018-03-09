package AbstractFactory0302;

public class factoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("Pen")){
			return new penFactory();
			}
		else if(choice.equalsIgnoreCase("WritteColor")){
			return new drawsColorFactory();
		}
		return null;
	}
}

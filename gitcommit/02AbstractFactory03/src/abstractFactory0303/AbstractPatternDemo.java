package abstractFactory0303;

public class AbstractPatternDemo {

	public static void main(String[] args) {
		AbstractFactory getFactory=FactoryProducer.getFactory("shape");
		Shape shape1=getFactory.getShape("cricle");
		shape1.draw();
	}

}

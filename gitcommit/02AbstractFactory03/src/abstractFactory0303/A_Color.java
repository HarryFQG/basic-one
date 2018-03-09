package abstractFactory0303;

public class A_Color extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color==null){
			return null;}
if(color.equalsIgnoreCase("Red")){
			
			return new C_Red();
		}else if(color.equalsIgnoreCase("green")){
			return new C_Green();
		}else if(color.equalsIgnoreCase("blue")){
			return new C_Blue();
		}
		return null;
	}

}

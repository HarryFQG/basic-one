package abstractFactory0304;

public class BookAdapter implements Book {

	
	Book targety;
	String targetType;
	public BookAdapter(String targetType){
		this.targetType=targetType;
		if(targetType.equalsIgnoreCase("B_SixteenLarge")){
			targety=new B_SixteenLarge();
		}else if(targetType.equalsIgnoreCase("B_eightLarge")){
			targety=new B_EightLarge();
		}else if(targetType.equalsIgnoreCase("B_FourLarge")){
			targety=new B_FourLarge();
		}
		
	}
	
	
	@Override
	public void largeX() {
		if(targetType.equalsIgnoreCase("B_SixteenLarge")){
			System.out.println("A_SixteenLarge：四开大小的本子");
		}else if(targetType.equalsIgnoreCase("B_eightLarge")){
			System.out.println("A_EightLarge：八开大小的本子");
		}else if(targetType.equalsIgnoreCase("B_FourLarge")){
			System.out.println("A_FourLarge：十六开大小的本子");
		}else System.out.println("适配失败！");
		
	}

}

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
			System.out.println("A_SixteenLarge���Ŀ���С�ı���");
		}else if(targetType.equalsIgnoreCase("B_eightLarge")){
			System.out.println("A_EightLarge���˿���С�ı���");
		}else if(targetType.equalsIgnoreCase("B_FourLarge")){
			System.out.println("A_FourLarge��ʮ������С�ı���");
		}else System.out.println("����ʧ�ܣ�");
		
	}

}

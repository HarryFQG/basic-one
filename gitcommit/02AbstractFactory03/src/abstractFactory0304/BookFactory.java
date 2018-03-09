package abstractFactory0304;

public class BookFactory extends B_T_Factory{

	@Override
	public Book getBook(String bookType) {
		if(bookType==null){
			return null;			
		}else if (bookType.equalsIgnoreCase("B_FourLarge")){
			return new B_FourLarge();			
		}else if (bookType.equalsIgnoreCase("B_EightLarge")){
			return new B_EightLarge();			
		}else if (bookType.equalsIgnoreCase("B_SixteenLarge")){
			return new B_SixteenLarge();			
		}else 	return null;
	}

	@Override
	public TargetY getTarget1(String bookType,String type) {
		// TODO 自动生成的方法存根
		return null;
	}

}

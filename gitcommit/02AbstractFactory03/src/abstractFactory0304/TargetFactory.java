package abstractFactory0304;

public class TargetFactory extends B_T_Factory{

	@Override
	public Book getBook(String bookType) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TargetY getTarget1(String bookType,String type) {
		if(bookType==null){
			return null;			
		}else if (bookType.equalsIgnoreCase("T_Work")){
			return new T_Work();			
		}else if (bookType.equalsIgnoreCase("T_fassion")){
			return new T_fassion();			
		}else if (bookType.equalsIgnoreCase("T_countt")){
			return new T_countt();			
		}else if(bookType.equalsIgnoreCase("T_worktAdapter")){
			//System.out.println("TargFOK!!");
			return new  T_worktAdapter(type);
		}else	 return null;
	}

}

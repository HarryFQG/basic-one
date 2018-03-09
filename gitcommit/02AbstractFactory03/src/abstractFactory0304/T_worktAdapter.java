package abstractFactory0304;

public class T_worktAdapter implements TargetY {
	private BookAdapter bookAdapter;
	private String type1;
	public T_worktAdapter(){
		
	}
	public T_worktAdapter(String type){
		//System.out.println("TargWOK---->>>");
		this.type1=type;
		if(type.equalsIgnoreCase("B_SixteenLarge")||type.equalsIgnoreCase("B_fourLarge")||type.equalsIgnoreCase("B_eightLarge")){
			//System.out.println("TargWOK???");
			bookAdapter=new BookAdapter(type);
			//System.out.println("TargWOK!!");
		}
	}
	
	
	public void largeY(){
		bookAdapter.largeX();
		
		
	}
	public void largeX(){
		if(type1.equalsIgnoreCase("B_SixteenLarge")){
			System.out.println("B_SixteenLarge：十六开大小的本子");
		}else if(type1.equalsIgnoreCase("B_fourLarge")){
			System.out.println("B_FourLarge：四开大小的本子");
		}else if(type1.equalsIgnoreCase("B_eightLarge")){
			System.out.println("B_EightLarge：八开大小的本子");
		}		
		
	}
	
	@Override
	public void function() {
		
		
		System.out.println("T_Work：拥有此特性的本子可以办公。");
	}

}

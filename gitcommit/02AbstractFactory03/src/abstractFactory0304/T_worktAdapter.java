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
			System.out.println("B_SixteenLarge��ʮ������С�ı���");
		}else if(type1.equalsIgnoreCase("B_fourLarge")){
			System.out.println("B_FourLarge���Ŀ���С�ı���");
		}else if(type1.equalsIgnoreCase("B_eightLarge")){
			System.out.println("B_EightLarge���˿���С�ı���");
		}		
		
	}
	
	@Override
	public void function() {
		
		
		System.out.println("T_Work��ӵ�д����Եı��ӿ��԰칫��");
	}

}

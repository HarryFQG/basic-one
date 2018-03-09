package abstractFactory0304;

public class Test1 {
	public static void main(String[] args) {
		B_T_Factory book=FactoryProducer.getFactory("book");
		Book four=book.getBook("B_FourLarge");
		four.largeX();
		book.getBook("B_SixteenLarge").largeX();
		book.getBook("B_eightLarge").largeX();
		
		System.out.println("------------------------------------");
		B_T_Factory target=FactoryProducer.getFactory("TargetY");
		TargetY targ=target.getTarget1("T_Work",null);
		targ.function();
		target.getTarget1("T_fassion",null).function();
		target.getTarget1("T_countt",null).function();
		System.out.println("@@@"+targ.getClass());
		target.getTarget1("T_worktAdapter","B_SixteenLarge").function();
		T_worktAdapter y=(T_worktAdapter) target.getTarget1("T_worktAdapter","B_SixteenLarge");y.largeY();
		System.out.println("@@@"+four.getClass());
	}
	
}

package builderPattern;

public abstract class Burger041 implements Item02 {

	@Override
	public String name() {
		
		return null;
	}

	@Override
	public Packing01 packing() {
		
		return new Wrapper032();
	}

	@Override
	public float price() {
		// TODO �Զ����ɵķ������
		return 0;
	}

}

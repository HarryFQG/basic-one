package builderPattern;

public abstract class ColdDrink042 implements Item02 {

	@Override
	public String name() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public Packing01 packing() {
		
		return new Bottle031();
	}

	@Override
	public float price() {
		// TODO �Զ����ɵķ������
		return 0;
	}

}

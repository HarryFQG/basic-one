package AdapterPattern02;

public class H_AnatationHandlerAdapter implements HandlerAdapter{

	@Override
	public boolean sipport(Object handle) {
		// TODO �Զ����ɵķ������
		return (handle instanceof Controller);
	}

	@Override
	public void handle(Object handle) {
		((C_AnnatationController)handle).doAnnatation();
		
	}

}

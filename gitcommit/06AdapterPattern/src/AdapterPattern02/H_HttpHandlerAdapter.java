package AdapterPattern02;

public class H_HttpHandlerAdapter implements  HandlerAdapter{

	@Override
	public boolean sipport(Object handle) {
		// TODO �Զ����ɵķ������
		return (handle instanceof Controller);
	}

	@Override
	public void handle(Object handle) {
		((C_HttpController)handle).doHttpHandler();
		
	}

}

package AdapterPattern02;

public class H_SimpleHandlerAdapter implements HandlerAdapter{

	@Override
	public boolean sipport(Object handle) {
		
		return (handle instanceof Controller);
	}

	@Override
	public void handle(Object handle) {
		((C_SimpleController)handle).doSimpleHandler();		
	}

}

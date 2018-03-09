package AdapterPattern02;

import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet {
	private List<HandlerAdapter> handlerAdapter=new ArrayList<HandlerAdapter>();
	
	public DispatcherServlet(){
		handlerAdapter.add(new H_AnatationHandlerAdapter());
		handlerAdapter.add(new H_HttpHandlerAdapter());
		handlerAdapter.add(new H_SimpleHandlerAdapter());
		System.out.println("-----");
		
	}
	
	
	
	public void doDispatch(){
		/*模拟Springmvc从request中取handle的对象，仅仅new 出对象，可以取出，不论是何种Controller
		适配器经过适配总能找到合适的结果*/
		C_SimpleController controller=new C_SimpleController();
		/*C_AnnatationController controller=new C_AnnatationController();
			C_HttpController controller=new C_HttpController();
		*/
		HandlerAdapter adapter=getHandler(controller);
		adapter.handle(controller);
		
	}
	
	public HandlerAdapter getHandler(Controller controller){
		
		for(HandlerAdapter adapter:this.handlerAdapter){
			if(adapter.sipport(controller)){
				System.out.println(adapter.sipport(controller));
				return adapter; 
			}
			
		}
		
		return null;
	}
}

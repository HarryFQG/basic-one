package bridgePattern;

/**
 * 定义成protected访问的类型可以在子类访问父类的属性，从而就可以使用父类调用的的方法
 * 
 * @author Feng
 *
 */
public abstract class Shape {
	
	protected DrawAPI drawAPI;
	protected Shape (DrawAPI drawAPI) {
		System.out.println("Shape:构造函数！");
		this.drawAPI=drawAPI;
	}
	public abstract void draw();
}

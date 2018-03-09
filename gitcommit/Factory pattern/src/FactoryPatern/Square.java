package FactoryPatern;
/**
 *  *创建实现接口的实体类长方形
 * @author Feng
 *
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println(" Square 实现接口shape,重写draw()方法！");


	}

}

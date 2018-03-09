package FactoryPatern;

/**
 * 创建实现接口的实体类正方形
 * @author Feng
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println(" Rectangle 实现接口shape,重写draw()方法！");

	}

}

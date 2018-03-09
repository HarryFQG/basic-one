/**
 * 
 */
package FactoryPatern;

/**
 * @author Feng
 * *创建实现接口的实体类园
 */
public class Cricle implements Shape {

	/* （非 Javadoc）
	 * @see FactoryPatern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println(" Cricle 实现接口shape,重写draw()方法！");


	}

}

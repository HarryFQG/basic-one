/**
 * 使用该工厂，通过传递类型信息来获取实体类型的对象
 */
package FactoryPatern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		shapeFactory shapeFactory=new shapeFactory();
		//获取Cricle的对象，并调用它的draw方法
		Shape shape1 =shapeFactory.getShape("CRICLE");
		shape1.draw();
		//获取Rectangle的对象，并调用它的draw方法
		Shape shape2 =shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		//获取Square的对象，并调用它的draw方法
		Shape shape3 =shapeFactory.getShape("SQUARE");
		shape3.draw();

	}

}

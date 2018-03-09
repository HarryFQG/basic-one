/**
 * 创建一个工厂，生成基于给定信息的实体类的对象
 */
package FactoryPatern;

/**
 * @author Feng
 *
 */
public class shapeFactory  {
	//使用getShape方法获取形状类型的对象
	public Shape getShape(String shapeType){
		if(shapeType==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CRICLE")){
			return new Cricle();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
}

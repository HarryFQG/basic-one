/**
 * ����һ�����������ɻ��ڸ�����Ϣ��ʵ����Ķ���
 */
package FactoryPatern;

/**
 * @author Feng
 *
 */
public class shapeFactory  {
	//ʹ��getShape������ȡ��״���͵Ķ���
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

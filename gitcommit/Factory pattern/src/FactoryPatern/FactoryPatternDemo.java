/**
 * ʹ�øù�����ͨ������������Ϣ����ȡʵ�����͵Ķ���
 */
package FactoryPatern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		shapeFactory shapeFactory=new shapeFactory();
		//��ȡCricle�Ķ��󣬲���������draw����
		Shape shape1 =shapeFactory.getShape("CRICLE");
		shape1.draw();
		//��ȡRectangle�Ķ��󣬲���������draw����
		Shape shape2 =shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		//��ȡSquare�Ķ��󣬲���������draw����
		Shape shape3 =shapeFactory.getShape("SQUARE");
		shape3.draw();

	}

}

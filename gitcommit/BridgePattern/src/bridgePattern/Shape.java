package bridgePattern;

/**
 * �����protected���ʵ����Ϳ�����������ʸ�������ԣ��Ӷ��Ϳ���ʹ�ø�����õĵķ���
 * 
 * @author Feng
 *
 */
public abstract class Shape {
	
	protected DrawAPI drawAPI;
	protected Shape (DrawAPI drawAPI) {
		System.out.println("Shape:���캯����");
		this.drawAPI=drawAPI;
	}
	public abstract void draw();
}

package bridgePattern;
/**
 * �Ž��࣬ͨ����ͬ�Ľӿ��������
 * @author Feng
 *
 */
public class Cricle extends Shape{
	
	private int radius,x,y;

	protected Cricle(int x,int y,int radius,DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}

	@Override
	public void draw() {
		drawAPI.DrawCricle(radius, x, y);//�൱�ڶ�̬��������D_BlueCricle��D_GreenCricle��D_RedCricleʵ����
		
	}

}

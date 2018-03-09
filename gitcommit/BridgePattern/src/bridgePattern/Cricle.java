package bridgePattern;
/**
 * 桥接类，通过不同的接口与抽象类
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
		drawAPI.DrawCricle(radius, x, y);//相当于动态的整合了D_BlueCricle、D_GreenCricle、D_RedCricle实体类
		
	}

}

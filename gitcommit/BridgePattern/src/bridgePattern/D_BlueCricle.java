package bridgePattern;

public class D_BlueCricle implements DrawAPI {

	public D_BlueCricle(){

		System.out.println("D_BlueCricle:���캯����");
	}
	@Override
	public void DrawCricle(int radius, int x, int y) {
		System.out.println("Draw Cricle[color :Blue,radius"+radius+", x:"+x+", y:"+y);
	}

}

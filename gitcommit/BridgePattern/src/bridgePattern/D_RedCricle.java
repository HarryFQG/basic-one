package bridgePattern;

public class D_RedCricle implements DrawAPI {

	public D_RedCricle(){

		System.out.println("D_RedCricle:���캯����");
	}
	@Override
	public void DrawCricle(int radius, int x, int y) {
		System.out.println("Draw Cricle[color :red,radius"+radius+", x:"+x+", y:"+y);

	}

}

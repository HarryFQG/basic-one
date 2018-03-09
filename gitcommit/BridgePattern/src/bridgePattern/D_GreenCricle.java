package bridgePattern;

public class D_GreenCricle implements DrawAPI{

	public D_GreenCricle(){

		System.out.println("D_GreenCricle:¹¹Ôìº¯Êý£¡");
	}
	@Override
	public void DrawCricle(int radius, int x, int y) {
		System.out.println("Draw Cricle[color :Green,radius"+radius+", x:"+x+", y:"+y);
		
	}

}

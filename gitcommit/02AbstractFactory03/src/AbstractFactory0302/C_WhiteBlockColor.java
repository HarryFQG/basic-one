package AbstractFactory0302;

public class C_WhiteBlockColor implements DrawColor {
	private String prama="灰黑色的笔芯";
	private float price=9.50f;
	
	public String getPrama() {
		return prama;
	}

	public float getPrice() {
		return price;
	}

	private void setPrama(String prama) {
		this.prama = prama;
	}

	private void setPrice(float price) {
		this.price = price;
	}

	@Override
	public void WritteColor() {
		System.out.println("这是一直铅笔的WritteColor方法写灰黑色的字！！");
	}

}

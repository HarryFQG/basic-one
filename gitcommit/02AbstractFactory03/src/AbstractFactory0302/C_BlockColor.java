package AbstractFactory0302;

public class C_BlockColor implements DrawColor {
	private String prama="黑色的笔芯";
	private float price=5.0f;
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
		System.out.println("这是一直黑笔的writteColor方法写黑色字！！");

	}

}

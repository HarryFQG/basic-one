package AbstractFactory0302;

public class C_RedColor implements DrawColor {
	private String prama="红色的笔芯";
	private float price=5.50f;
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
		System.out.println("这是一直红笔的writteColor方法写红色字！！");
	}

}

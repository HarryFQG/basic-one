package AbstractFactory0302;

public class P_RedPen implements Pen {
	private String prama="红笔";
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
	private float price=15.0f;	
	@Override
	public void draws() {
		System.out.println("这是一直红笔的draws方法,你可以写字！！");

	}

}

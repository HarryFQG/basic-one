package AbstractFactory0302;

public class P_YuanPen implements Pen {
	private String prama="圆珠笔";
	private float price=16.5f;	
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
	public void draws() {
		System.out.println("只是一直圆珠笔的draw方法！！");

	}

}

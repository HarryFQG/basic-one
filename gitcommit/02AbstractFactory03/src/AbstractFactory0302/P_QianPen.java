package AbstractFactory0302;

public class P_QianPen implements Pen {
	private String prama="铅笔";
	private float price=25.5f;	
	public String getPrama() {
		return prama;
	}
	private void setPrama(String prama) {
		this.prama = prama;
	}
	public float getPrice() {
		return price;
	}
	private void setPrice(float price) {
		this.price = price;
	}

	@Override
	public void draws() {
		System.out.println("这是一直铅笔的draws方法！！");
	}

}

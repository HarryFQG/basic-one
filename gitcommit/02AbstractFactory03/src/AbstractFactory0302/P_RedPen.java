package AbstractFactory0302;

public class P_RedPen implements Pen {
	private String prama="���";
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
		System.out.println("����һֱ��ʵ�draws����,�����д�֣���");

	}

}

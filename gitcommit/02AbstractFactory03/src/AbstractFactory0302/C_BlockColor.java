package AbstractFactory0302;

public class C_BlockColor implements DrawColor {
	private String prama="��ɫ�ı�о";
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
		System.out.println("����һֱ�ڱʵ�writteColor����д��ɫ�֣���");

	}

}

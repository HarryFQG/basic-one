package AbstractFactory0302;

public class C_RedColor implements DrawColor {
	private String prama="��ɫ�ı�о";
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
		System.out.println("����һֱ��ʵ�writteColor����д��ɫ�֣���");
	}

}

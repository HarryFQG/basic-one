package AbstractFactory0302;

public class C_WhiteBlockColor implements DrawColor {
	private String prama="�Һ�ɫ�ı�о";
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
		System.out.println("����һֱǦ�ʵ�WritteColor����д�Һ�ɫ���֣���");
	}

}

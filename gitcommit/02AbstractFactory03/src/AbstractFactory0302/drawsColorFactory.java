package AbstractFactory0302;

public class drawsColorFactory extends AbstractFactory{

	@Override
	Pen getPen(String pen) {
	
		return null;
	}

	@Override
	DrawColor getColor(String colorType) {
		if(colorType==null){
			return null;
		}
		if(colorType.equalsIgnoreCase("C_BlockColor")){
			return new C_BlockColor();
		}else if(colorType.equalsIgnoreCase("C_RedCOlOR")){			
			return new C_RedColor();
		}else if(colorType.equalsIgnoreCase("C_WhiteBlockCOlOR")){
			return new C_WhiteBlockColor();
		}
		return null;
	}

}

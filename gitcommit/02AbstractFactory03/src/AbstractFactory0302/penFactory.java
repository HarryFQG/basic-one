package AbstractFactory0302;

public class penFactory  extends AbstractFactory{

	@Override
	Pen getPen(String penType) {
		if(penType==null){
			return null;
		}
		if(penType.equalsIgnoreCase("P_QianPen")){
			return new P_QianPen();
		}else if(penType.equalsIgnoreCase("P_YuanPen")){
			return new P_YuanPen();
		}else if (penType.equalsIgnoreCase("P_RedPen")){
			return new P_RedPen();			
		}
		return null;
	}

	@Override
	DrawColor getColor(String color) {
		// TODO 自动生成的方法存根
		return null;
	}

}

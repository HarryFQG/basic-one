package AbstractFactory0302;

public class centerSelef {	
	private String pen="";
	private String drawColor="";	
	public centerSelef(){}
	public centerSelef(String pen,String drawColor){
		this.pen=pen;
		this.drawColor=drawColor;
		 //centerProducer();
	}
	public generalInterface[]  centerProducer(){
		if(pen!=null&&drawColor!=null){
			new penFactory();
				generalInterface[] ab=new generalInterface[2];
				ab[0]=(new penFactory()).getPen(pen);
				/**if(pen.equalsIgnoreCase("P_QianPen")){
					ab[0]=new  P_QianPen();
				}else if(pen.equalsIgnoreCase("P_RedPen")){
					ab[0]=new  P_RedPen();
				}else if(pen.equalsIgnoreCase("P_YuanPen")){
					ab[0]=new  P_YuanPen();
				}**/
				/**if(drawColor.equalsIgnoreCase("C_BlockColor")){
					ab[1]=new  C_BlockColor();
				}else if(drawColor.equalsIgnoreCase("C_RedColor")){
					ab[1]=new  C_RedColor();
				}else if(drawColor.equalsIgnoreCase("C_WhiteBlockColor")){
					ab[1]=new  C_WhiteBlockColor();
				}**/
				ab[1]=(new drawsColorFactory()).getColor(drawColor);
				return ab;
		}
		return null;
	}
	public String writter(){
		String str="你正在使用：";
		switch(pen){
					case "P_QianPen":{
						generalInterface[]  pen1=centerProducer();
						P_QianPen s=(P_QianPen) pen1[0];str+=s.getPrama();break;
					}
					case "P_RedPen":{
						generalInterface[]  pen1=centerProducer();
						P_RedPen s=(P_RedPen) pen1[0];str+=s.getPrama();break;
					}
					case "P_YuanPen":{
						generalInterface[]  pen1=centerProducer();
						P_YuanPen s=(P_YuanPen) pen1[0];str+=s.getPrama();break;
					}		
					
			}
		switch(drawColor){
				case "C_BlockColor":{
					generalInterface[]  pen1=centerProducer();
					C_BlockColor s=(C_BlockColor) pen1[1];str+=s.getPrama();break;
				}
				case "C_RedColor":{
					generalInterface[]  pen1=centerProducer();
					C_RedColor s=(C_RedColor) pen1[1];str+=s.getPrama();break;
				}
				case "C_WhiteBlockColor":{
					generalInterface[]  pen1=centerProducer();
					C_WhiteBlockColor s=(C_WhiteBlockColor) pen1[1];str+=s.getPrama();break;
				}
			}
		return str;
		
	}
	
	
}

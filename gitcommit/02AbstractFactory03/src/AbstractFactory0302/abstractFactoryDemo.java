package AbstractFactory0302;

import java.util.Scanner;

import abstractFactory03.FactoryProducer;

public class abstractFactoryDemo {

	public static void main(String[] args) {
		//获取笔的工厂
		/**
		AbstractFactory penFactory=factoryProducer.getFactory("pen");
		Pen p_YuanPen=penFactory.getPen("P_YuanPen");
		p_YuanPen.draws();
		Pen p_RedPen=penFactory.getPen("p_RedPen");
		p_RedPen.draws();
		Pen p_QianPen=penFactory.getPen("P_QianPen");
		p_QianPen.draws();
		//获取该笔颜的工厂
		AbstractFactory drawColor=factoryProducer.getFactory("WritteColor");
		DrawColor c_RedColor=drawColor.getColor("c_RedColor");
		c_RedColor.WritteColor();
		DrawColor c_whiteblockColor=drawColor.getColor("c_whiteblockColor");
		c_whiteblockColor.WritteColor();
		DrawColor c_BlockColor=drawColor.getColor("c_BlockColor");
		c_BlockColor.WritteColor();**/
		System.out.println("你需要选择的笔是：");
		Scanner sc=new Scanner(System.in);
		String penKind=sc.nextLine();
		String colorPen=sc.nextLine();
		centerSelef pen=new centerSelef("P_QianPen","C_RedColor");
		generalInterface[] pen1=pen.centerProducer();
		for (int i=0;i<pen1.length;i++) {
			if(i==0){P_QianPen s=(P_QianPen) pen1[0];s.draws();}
			if(i==1){C_RedColor c=(C_RedColor) pen1[1];c.WritteColor();}
		}
		System.out.println(pen.writter());
	}

}

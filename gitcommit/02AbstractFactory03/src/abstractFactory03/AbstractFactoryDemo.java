package abstractFactory03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFormattedTextField.AbstractFormatterFactory;

public class AbstractFactoryDemo {

	public static <T> void main(String[] args) {
		List listArray=new ArrayList();
		//形状工厂
		AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");		
		Shape shape1=shapeFactory.getShape("Rectangle");
		shape1.draw();
		Shape shape2=shapeFactory.getShape("SQUARE");
		shape2.draw();
		Shape shape3=shapeFactory.getShape("CRICLE");
		shape3.draw();
		listArray.add(shape1);
		//颜色工厂
		AbstractFactory colorFactory=FactoryProducer.getFactory("color");
		Color color1=colorFactory.getColor("Red");
		color1.fill();
		listArray.add(color1);
		Color color2=colorFactory.getColor("blue");
		color2.fill();
		Color color3=colorFactory.getColor("Green");
		color3.fill();	
		//if(color3 instanceof C_01_Bule){
			//System.out.println("sadsad");}
		//}
		//迭代器
		/**Iterator<T> it=listArray.iterator();
		while(it.hasNext()){
			if(it.next() instanceof Shape){
					if(it.next() instanceof S_01_Rectangle){
						S_01_Rectangle	i=(S_01_Rectangle) it.next();i.draw();	
					}
					else if(it.next() instanceof S_01_Cricle){
						S_01_Cricle	i=(S_01_Cricle) it.next();i.draw();
					}
					else if(it.next() instanceof S_01_Square){
						S_01_Square	i=(S_01_Square) it.next();i.draw();
					}
				
				}
			else if(it.next() instanceof Color){
						if(it.next() instanceof C_01_Red){
							C_01_Red	i=(C_01_Red) it.next();i.fill();	
						}
						if(it.next() instanceof C_01_Green){
							C_01_Green	i=(C_01_Green) it.next();i.fill();
						}
						if(it.next() instanceof C_01_Bule){
							C_01_Bule	i=(C_01_Bule) it.next();i.fill();
						}
					}
			
			}**/
		
		}
		
		

	}



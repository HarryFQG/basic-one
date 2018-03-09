package builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal06 {
	
	private List<Item02> items=new ArrayList<Item02>(); 
	public void addItem(Item02 item){
		items.add(item);		
	}
	public float getCost(){
		float cost=0f;
		for(Item02 item:items){
			cost+=item.price();			
		}
		return cost;
	}
	
	public void showItem(){
		for(Item02 item:items){
			System.out.print("Item\n"+item.name()+":\t\t");
			System.out.print("Price:\t"+item.price()+",\t\t");
			System.out.print("Packing:\t"+item.packing().pack()+";\n");
		}
		
		
	}
	
}

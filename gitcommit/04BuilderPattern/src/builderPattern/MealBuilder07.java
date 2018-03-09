package builderPattern;

public class MealBuilder07 {
	public Meal06 preparVegMeal(){
		Meal06 meal=new Meal06();
		meal.addItem(new BurgerVeg051());
		meal.addItem(new DrinkCoke053());
		return meal;
	}
	
	public Meal06 preparChickenMeal(){
		Meal06 meal=new Meal06();
		meal.addItem(new BurgerChicken052());
		meal.addItem(new DrinkPeisi054());
		return meal;
	} 
	
}

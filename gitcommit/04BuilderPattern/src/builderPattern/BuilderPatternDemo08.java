package builderPattern;

public class BuilderPatternDemo08 {

	public static void main(String[] args) {
		MealBuilder07 mealBuilder=new MealBuilder07();
		Meal06 vegMeal=mealBuilder.preparVegMeal();
		System.out.println("VegMeal:");
		vegMeal.showItem();
		System.out.println("Total Cost:"+vegMeal.getCost());
		
	}

}


public class App {
	public static void main(String[] args) {
		Beverage plainBeverage = new PlainBeverage();
		Beverage sugarBeverage = new Sugar(plainBeverage);
		Beverage milkBeverage = new Milk(sugarBeverage);
		Beverage sugarMilkBeverage = new Sugar(milkBeverage);

		System.out.println(sugarMilkBeverage.getDescription());
		System.out.println(sugarMilkBeverage.getCost());
	}
}

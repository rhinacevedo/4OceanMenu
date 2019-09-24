import java.util.Scanner;

public class Bracelets extends Update {

	private static String item1 = "The 4ocean Bracelet: $";
	private static String item2 = "Whale Shark Bracelet: $";
	private static String item3 = "July 2-Pound Pack: $";
	private static String item4 = "Hawaiian Monk Seal Bracelet: $";
	private static String item5 = "Sea Turtle Bracelet: $";
	private static String item6 = "Seabird Bracelet: $";

	private double PriceOne = 20.00, priceTwo = 40.00;

	private String Update;

	Bracelets() {
		this("", 00.00, "");
	}

	public Bracelets(String title, double cost, String update) {
		super(title, cost);
		setUpdate(update);
	}

	public static String getItem1() {
		return item1;
	}

	public static void setItem1(String item1) {
		Bracelets.item1 = item1;
	}

	public static String getItem2() {
		return item2;
	}

	public static void setItem2(String item2) {
		Bracelets.item2 = item2;
	}

	public static String getItem3() {
		return item3;
	}

	public static void setItem3(String item3) {
		Bracelets.item3 = item3;
	}

	public static String getItem4() {
		return item4;
	}

	public static void setItem4(String item4) {
		Bracelets.item4 = item4;
	}

	public static String getItem5() {
		return item5;
	}

	public static void setItem5(String item5) {
		Bracelets.item5 = item5;
	}

	public static String getItem6() {
		return item6;
	}

	public static void setItem6(String item6) {
		Bracelets.item6 = item6;
	}

	public double getPriceOne() {
		return PriceOne;
	}

	public void setPriceOne(double priceOne) {
		PriceOne = priceOne;
	}

	public double getPriceTwo() {
		return priceTwo;
	}

	public void setPriceTwo(double priceTwo) {
		this.priceTwo = priceTwo;
	}

	@Override
	public void loadExtraInfo() {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter update note: \n");
		Update = in.nextLine();
		setUpdate(Update);

	}

	public String getUpdate() {
		return Update;
	}

	public void setUpdate(String update) {
		Update = update;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t\t"+ getUpdate();
	}

}

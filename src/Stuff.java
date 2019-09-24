import java.util.Scanner;

public class Stuff extends Update {
	private static String stuff1 = "4ocean + Guy Harvey Whale Shark T-Shirt: $";
	private static String stuff2 = "2018 Clean Ocean Collection: $";
	private static String stuff3 = "4ocean Reusable Bottle - Blue: $";

	private double priceone = 25.00, pricetwo = 240.00, pricethree = 30.00;

	private String Update;

	Stuff() {
		this("", 00.00, "");
	}

	public Stuff(String title, double cost, String update) {
		super(title, cost);
		setUpdate(update);

	}

	public static String getStuff1() {
		return stuff1;
	}

	public static void setStuff1(String stuff1) {
		Stuff.stuff1 = stuff1;
	}

	public static String getStuff2() {
		return stuff2;
	}

	public static void setStuff2(String stuff2) {
		Stuff.stuff2 = stuff2;
	}

	public static String getStuff3() {
		return stuff3;
	}

	public static void setStuff3(String stuff3) {
		Stuff.stuff3 = stuff3;
	}

	public double getPriceone() {
		return priceone;
	}

	public void setPriceone(double priceone) {
		this.priceone = priceone;
	}

	public double getPricetwo() {
		return pricetwo;
	}

	public void setPricetwo(double pricetwo) {
		this.pricetwo = pricetwo;
	}

	public double getPricethree() {
		return pricethree;
	}

	public void setPricethree(double pricethree) {
		this.pricethree = pricethree;
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
		return super.toString() +"\t\t"+ getUpdate();
	}

}

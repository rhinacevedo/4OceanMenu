import java.util.Scanner;

public class Monthly extends Update {
	private static String monthly = "4ocean Monthly Subscription: $";
	private double month = 20.00;
	private String Update;

	Monthly() {
		this("", 00.00, "");
	}

	public Monthly(String title, double cost, String update) {
		super(title, cost);
		setUpdate(update);
	}

	public static String getMonthly() {
		return monthly;
	}

	public void setMonthly(String monthly) {
		Monthly.monthly = monthly;
	}

	public double getMonth() {
		return month;
	}

	public void setMonth(double month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return super.toString() +"\t\t"+ getUpdate();
	}

	public String getUpdate() {
		return Update;
	}

	public void setUpdate(String update) {
		Update = update;
	}


	@Override
	public void loadExtraInfo() {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter update note: \n");
		Update = in.nextLine();
		setUpdate(Update);

	}

}

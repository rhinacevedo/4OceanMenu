import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuOcean extends Users {

	private Menu startUp;

	public MenuOcean(String user, String pass) {
		super(user, pass);
		// TODO Auto-generated constructor stub
	}

	public static final int MONTHLY = 1;
	public static final int BRACELETS = 2;
	public static final int OTHER = 3;
	public static final int EXIT = 4;
	private static final int ADD = 5;
	private static final int DIS = 6;
	private static final int DEL = 7;

	public static int MON = 1;
	public static int BRA = 2;
	public static int OTH = 3;

	private Date date = new Date();
	static DateFormat dateFormat = new java.text.SimpleDateFormat("EEE, MMM d, yyyy 'at' HH:mm:ss");

	String time = dateFormat.format(date);// Converting dateFormat to a String.

	public static void main(String[] args) throws IOException {
		MenuOcean console = new MenuOcean(getUsername(), getPassword());
		console.menuOcean();
	}

	static Scanner in = new Scanner(System.in);

	public void menuOcean() throws IOException {
		int choice;
		do {

			System.out.println("********************************************************");
			System.out.println("                 Welcome!\n         OCEAN MERCHANDIZE CATALOG: \n");
			System.out.println(MenuOcean.MONTHLY + ".  Monthly Subscription! (Best Value)");
			System.out.println(MenuOcean.BRACELETS + ".  Bracelets ");
			System.out.println(MenuOcean.OTHER + ".  Other Stuffs");
			System.out.println(MenuOcean.EXIT + ".  Log out");
			System.out.println("\n --------------------------------------------------------");
			if (getUsername().equals(accounts[0][0])) {
				System.out.print(MenuOcean.ADD + ".  Add Items to the Catalog. \n");
				System.out.print(MenuOcean.DIS + ".  Display Items from the Catalog. \n");
				System.out.println("--------------------------------------------------------");
				System.out.println("*******************************************************\n");
			} else
				

			System.out.print("SELECTION: ");

			choice = in.nextInt();
			in.nextLine();

			switch (choice) {
			case MenuOcean.MONTHLY:
				monthly();
				break;
			case MenuOcean.BRACELETS:
				bracelets();
				break;
			case MenuOcean.OTHER:
				otherStuff();
			case MenuOcean.EXIT:
				System.out.println("See you next time :)");
				break;
			case MenuOcean.ADD:
				if (getUsername().equals(accounts[0][0])) {addCatalog();}
				break;
			case MenuOcean.DIS:
				if (getUsername().equals(accounts[0][0])) {display();}
				break;
			default:
				System.out.println("INVALID CHOICE; PLEASE RE-ENTER");

			}
		} while (choice != MenuOcean.EXIT);

	}// end menu

	private void addCatalog() {
		 try {
		System.out.print("Name Of product: ");
		String title = in.nextLine();

		System.out.print("Cost of the product: ");
		double cost = in.nextDouble();

		System.out.print(" Catalog Type (Monthly = 1, Bracelets = 2, Stuff = 3):  ");
		int type = in.nextInt();

		switch (type) {
		case 1:
			type = MON;
			Update myMonthly = new Monthly();

			myMonthly.loadExtraInfo();
			break;
		case 2:
			type = BRA;
			Update myBra = new Bracelets();

			myBra.loadExtraInfo();
			break;
		case 3:
			type = OTH;
			Update myStuff = new Stuff();

			myStuff.loadExtraInfo();
			
			break;
		default:
			System.out.print(" Wrong category type! ");
		
		startUp.addCatalog(title, cost, type);
	
		startUp.getProduct().clear();
	}} catch(NullPointerException e) {
		System.out.print("Cooming soon...");
	}}

	private void display() {
		
		 startUp = new Menu();
	//	try {
			System.out.println("NAME OF PRODUCT\t\t\t\tCOST\tUPDATE NOTE");
			if (startUp.getProduct().size() == 0) {
				System.out.println("There are no employees\n");
			} else {

				for (int i = 0; i < startUp.getProduct().size(); i++)
					System.out.println(startUp.getProduct().get(i));
				
				
			}
//		} catch (NullPointerException e) {
//			System.out.println("To be continue...");
//		}

	}

	private void otherStuff() {
		Stuff stu = new Stuff();

		int pick3;
		do {
			System.out.println("\n          MAKE A SELECTION: ");
			System.out.printf("1) " + Stuff.getStuff1() + stu.getPriceone() + "\n");
			System.out.printf("2) " + Stuff.getStuff2() + stu.getPricetwo() + "\n");
			System.out.printf("3) " + Stuff.getStuff3() + stu.getPricethree() + "\n");
			System.out.println("4) Go back to menu \n");

			System.out.print("SELECTION: ");
			pick3 = in.nextInt();

			try (Writer fileWriter = new FileWriter("Purchase.xml", true);) {

				switch (pick3) {
				case 1:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() + " (" + time + ")- " + Stuff.getStuff1()
							+ stu.getPriceone());

					break;
				case 2:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() + " (" + time + ")- " + Stuff.getStuff2()
							+ stu.getPricetwo());

					break;
				case 3:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " +  MenuOcean.getUsername() +" (" + time + ")- " + Stuff.getStuff3()
							+ stu.getPricethree());

					break;
				case 4:
					System.out.print("Going back to Catalog...\n");

					break;
				default:
					System.out.println("INVALID CHOICE; PLEASE RE-ENTER");
					otherStuff();
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (pick3 != 1 && pick3 != 2 && pick3 != 3 && pick3 != 4);

	}

	private void bracelets() throws IOException {
		Bracelets bra = new Bracelets();
		int pick2;
		do {
			System.out.println("\n          MAKE A SELECTION: ");
			System.out.printf("1) " + Bracelets.getItem1() + bra.getPriceOne() + "\n");
			System.out.printf("2) " + Bracelets.getItem2() + bra.getPriceOne() + "\n");
			System.out.printf("3) " + Bracelets.getItem3() + bra.getPriceTwo() + "\n");
			System.out.printf("4) " + Bracelets.getItem4() + bra.getPriceOne() + "\n");
			System.out.printf("5) " + Bracelets.getItem5() + bra.getPriceOne() + "\n");
			System.out.printf("6) " + Bracelets.getItem6() + bra.getPriceOne() + "\n");

			System.out.println("7) Go back to menu \n");

			System.out.print("SELECTION: ");
			pick2 = in.nextInt();

			try (Writer fileWriter = new FileWriter("Purchase.xml", true);) {

				switch (pick2) {
				case 1:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() +" (" + time + ")- " + Bracelets.getItem1()
							+ bra.getPriceOne());

					break;
				case 2:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() +" (" + time + ")- " + Bracelets.getItem2()
							+ bra.getPriceOne());

					break;
				case 3:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() +" (" + time + ")- " + Bracelets.getItem3()
							+ bra.getPriceTwo());

					break;
				case 4:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() +" (" + time + ")- " + Bracelets.getItem4()
							+ bra.getPriceOne());

					break;
				case 5:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() +" (" + time + ")- " + Bracelets.getItem5()
							+ bra.getPriceOne());

					break;
				case 6:

					System.out.print("Thank you for purchasing :)\n");
					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() +" (" + time + ")- " + Bracelets.getItem6()
							+ bra.getPriceOne());
					break;

				case 7:
					System.out.print("Going back to Catalog...\n");

					break;
				default:
					System.out.println("INVALID CHOICE; PLEASE RE-ENTER");
					bracelets();
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (pick2 != 1 && pick2 != 2 && pick2 != 3 && pick2 != 4 && pick2 != 5 && pick2 != 6 && pick2 != 7);

	}

	private void monthly() {

		Monthly mes = new Monthly();
		int pick;
		do {
			System.out.println("\n          MAKE A SELECTION: ");
			System.out.printf("1) " + Monthly.getMonthly() + mes.getMonth() + "\n");
			System.out.println("2) Go back to menu \n");

			System.out.print("SELECTION: ");
			pick = in.nextInt();
			try (Writer fileWriter = new FileWriter("Purchase.xml", true);) {
				switch (pick) {
				case 1:

					System.out.print("Thank you for purchasing :)\n");

					fileWriter.write("\nThe User purchased this item:\n " + MenuOcean.getUsername() +" (" + time + ")- " + Monthly.getMonthly() + mes.getMonth());

					break;
				case 2:
					System.out.print("Going back to Catalog...\n");

					break;
				default:
					System.out.println("INVALID CHOICE; PLEASE RE-ENTER");
					monthly();
					break;
				}
			} catch (IOException ioException) {
				System.err.println("Error opening file. Terminating.");
			}

		} while (pick != 1 && pick != 2);

	}

}

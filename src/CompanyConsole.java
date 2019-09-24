import java.io.IOException;
import java.util.Scanner;

public class CompanyConsole {
	public static final int LOGIN = 1;
	public static final int EXIT = 2;
	public static final int ADD = 3;

	public static void main(String[] args) throws IOException {
		CompanyConsole console = new CompanyConsole();
		console.menu(args);
	}

	Scanner in = new Scanner(System.in);

	public void menu(String[] args) throws IOException {
		int choice;
		do {

			System.out.println("********************************************************");
			System.out.println(CompanyConsole.LOGIN + ".  LOGIN INTO YOUR ACCOUNT");
			System.out.println(CompanyConsole.EXIT + ".  EXIT ");

			System.out.println("*******************************************************\n");

			System.out.print("SELECTION: ");

			choice = in.nextInt();
			in.nextLine(); // get rid of newline character in buffer

			switch (choice) {
			case CompanyConsole.LOGIN:
				login(args);
			case CompanyConsole.EXIT:
				System.out.println("See you next time :)");
				break;
			default:
				System.out.println("INVALID CHOICE; PLEASE RE-ENTER");

			}
		} while (choice != CompanyConsole.EXIT && choice != MenuOcean.EXIT); // end do and exit program

	}// end menu

	private void login(String[] args) throws IOException {
		int choice = 0;
		do {
			Scanner input = new Scanner(System.in);

			String username;
			String password;

			System.out.print("LOGIN MENU\n");
			System.out.print("Enter UserName: ");
			username = input.nextLine();

			System.out.print("Enter PassWord: ");
			password = input.nextLine();

			Users loginCheck = new Users(username, password);

			if (loginCheck.verify(args)) {
				System.out.println();
				// Enter the other menu
			} else
				System.out.println("\nINVALID  PLEASE RE-ENTER\n-----------------------");
			login(args); // For some reason only if I enter number 4 it won't keep asking for input
		} while (choice != CompanyConsole.EXIT && choice != MenuOcean.EXIT);
	}

}

import java.io.IOException;

public class  Users {
	private static String username;
	private static String password;

	protected static String[][] accounts = { { "admin", "123" } ,{ "user1", "123" } };

	public Users(String user, String pass) {
		Users.setUsername(user);
		Users.setPassword(pass);
	}

	public boolean verify(String[] args) throws IOException  {
		if ((getUsername().equals(accounts[0][0])) || (getPassword().equals(accounts[0][1])) )
			return CompanyConsole(args);
		else
			return false;

	}

	private boolean CompanyConsole(String[] args) throws IOException {
		MenuOcean.main(args);
		return true;
	}

	public static String[][] getAccounts() {
		return accounts;
	}

	public void setAccounts(String[][] accounts) {
		Users.accounts = accounts;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		Users.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Users.password = password;
	}
	
	
}

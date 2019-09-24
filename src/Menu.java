import java.util.ArrayList;

public class Menu {

	private ArrayList<Update> product;
	private static int numberEmployees = 0;
	public Menu() {
		product = new ArrayList<Update>();

		addCatalog("4ocean Year Subscription", 100.00,1);
		addCatalog("Marine Nursery Bracelet\t", 20.00, 2);
		addCatalog("4ocean Reusable Bottle - White", 30.00, 3);
	}

	public ArrayList<Update> getProduct() {
		return product;

	}
	
	public Update addCatalog(String title, double cost, int type) {
		Update addCatalog = null;

		switch (type) {
		case 1:
			addCatalog = new Monthly(title, cost, "");
			break;
		case 2:
			addCatalog = new Bracelets(title, cost, "");
			break;
		case 3:
			addCatalog = new Stuff(title, cost, "");
			break;
		default:
			System.out.print(" Wrong category type! ");
		}
		getProduct().add(addCatalog);
		return addCatalog;
	}

}// End of class

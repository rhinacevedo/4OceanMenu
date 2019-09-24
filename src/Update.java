import java.util.ArrayList;
import java.util.Objects;

public abstract class Update {

	private String title;
	private double cost;
	public static final long serialVersionUID = 1L;
	public Update() {
		this("unkwown", 00.00);
	}

	public Update(String title, double cost) {
		setTitle(title);
		setCost(cost);
	}

	public String getTitle() {
		return title;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void loadExtraInfo();

	@Override
	public String toString() {
		return getTitle() + "\t\t" + getCost() + "\t\t";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, title);
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj == null) || (this.getClass() != obj.getClass())) return false;
		Update other = (Update) obj;		
		return (this.getTitle().equals(other.getTitle()) && 
				this.getCost() == other.getCost());
	}

}// END OF UPDATE

import java.util.Arrays;

public class Checkout {
	

	private int size;

	private DessertItem[] dessertItems;

	private int amount;

	private int sum;

	private final double taxRate;

	Checkout() {

		size = 100;

		dessertItems = new DessertItem[size];

		amount = 0;

		sum = 0;

		taxRate = DessertShoppe.TAX_RATE;

	}

	public void enterItem(DessertItem d) {

		dessertItems[amount] = d;

		amount++;

	}

	public int numberOfItems() {

		return amount;

	}

	public int totalCost() {

		// make sum into zero, and calculate price from every item

		sum = 0;

		for (int i = 0; i < amount; i++) {

		sum += dessertItems[i].getCost();

		}

		return sum;

	}

	public int totalTax() {

		// use the totalCost method

		return (int) (Math.round(this.totalCost() * taxRate / 100));

	}

	public void clear() {

		// clear the array

		Arrays.fill(dessertItems, null);

	amount = 0;

	sum = 0;

	}

	// override the toString method in java object

	// this is for printing the object itself out

	@Override
	public String toString() {

		String result = "";

		result += DessertShoppe.STORE_NAME + "\n";

		result += "--------------------\n";

		for (DessertItem d : dessertItems) {
			if (d == null) {
				break;
			}
			result += d.toString();
		}

		result += "Tax: ";

		String totalTax = DessertShoppe.cents2dollarsAndCents(totalTax());

		result += totalTax;

		result += "\nTotal Cost: ";

		String totalPay = DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax());

		if (totalPay.length() > DessertShoppe.COST_WIDTH) {

		totalPay = totalPay.substring(0, DessertShoppe.COST_WIDTH);

		}

		result += "$" + totalPay;

		return result;

	}
}




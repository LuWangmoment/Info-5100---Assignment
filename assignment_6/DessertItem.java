package assignment666;

public abstract class DessertItem {

		protected String name;

		/**

		* Null constructor for DessertItem class

		*/

		public DessertItem() {

		this("");

		}

		/**

		* Initializes DessertItem data

		*/

		public DessertItem(String name) {

		if (name.length() <= DessertShoppe.MAX_ITEM_NAME_SIZE)

		this.name = name;

		else

		this.name = name.substring(0, DessertShoppe.MAX_ITEM_NAME_SIZE);

		}

		/**

		* Returns name of DessertItem

		*

		* @return name of DessertItem

		*/

		public final String getName() {

		return name;

		}

		/**

		* Returns cost of DessertItem

		*

		* @return cost of DessertItem

		*/

		public abstract int getCost();

		/**

		* Returns the name of the dessert item and it's cost as formatted String.

		*

		* @return name and cost of the dessert item.

		*/

		@Override

		public String toString() {

		return String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s" + "%" + DessertShoppe.COST_WIDTH + "s",

		getName(), DessertShoppe.cents2dollarsAndCents(getCost()));

		}

		}




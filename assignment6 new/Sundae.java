public class Sundae extends IceCream{
	

		protected String topName;

		protected int topCost;

		public Sundae(String _n0, int _cost0, String _n1, int _cost1) {

		// put the icecream name in icecream while putting top name and cost in

		// a separate property

		super(_n0, _cost0);

		topName = _n1;

		topCost = _cost1;

		}

		public int getCost() {

		// return the sum of the icecream and the topping

		return cost + topCost;

		}

		}


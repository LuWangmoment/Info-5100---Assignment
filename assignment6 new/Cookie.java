public class Cookie extends DessertItem{


		protected double number;

		protected double pricePerDoze;

		public Cookie(String _n, double _ppd, int _number) {

		super(_n);

		pricePerDoze = _ppd;

		number = _number;

		}

		public int getCost() {

		return (int) Math.round(number / 12 * pricePerDoze);

		}

		}




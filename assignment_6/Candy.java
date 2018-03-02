package assignment666;

public class Candy extends DessertItem {


		protected double weight;

		protected double pricePerPound;

		public Candy(String _n, double _ppp, int _w) {

		// using parent's constructor with name while storing its own properties

		super(_n);

		pricePerPound = _ppp;

		weight = _w;

		}

		public int getCost() {

		return (int) Math.round(weight * pricePerPound);

		}

		}


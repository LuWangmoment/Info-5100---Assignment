package assignment3;

public class salary {
	double hours;
	
	public double employeeSalary(double hours){
		if (hours<=36) {
			return 15*hours;
		}
		if (hours <= 41) {
			return 525+(hours-36)*15*1.5;
		}
		if (hours<=48) {
			return 637.5+(hours-41)*15*2;
		}
		return 847.5;

	}
		

}

package day2;

public class TestBus {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.busId = "mn021";
		bus1.busSource = "chennai";
		bus1.busDestination = "coimbatore";
		bus1.nonStop = false;
		System.out.println("bus1.busDestination:" + bus1.busDestination);
		System.out.println("bus1.busId:" + bus1.busId);
		System.out.println("bus1.busSource:" + bus1.busSource);

	}

}

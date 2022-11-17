package day2;

public class TestVehicle {

	public static void main(String[] args) {

		Vehicle vehi = new Vehicle();
		vehi.vehicleName = "mini";
		vehi.numberPlate = "MH045";
		vehi.colorOfVehicle = "black";
		vehi.numberOfSeats = 12;
		vehi.boardingPoint = "Mumbai";
		System.out.println("Name of Vehicle:" + vehi.vehicleName + '\n' + "Number Plate:" + vehi.numberPlate + '\n'
				+ "Boarding Point:" + vehi.boardingPoint);

	}

}

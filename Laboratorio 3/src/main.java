public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricVehicle myEV = new ElectricVehicle ("Tesla", "Model 3", 50000, 75, 500);
		myEV.start();
		myEV.displayInfo();
		myEV.displayRange();
		myEV.stop();
	}

}


public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	private String brand;
	private String model;
	private double price;
	
	public Vehicle(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public void start () {
		System.out.println(brand+ "" + model + "is starting.");
	}
	
	public void stop () {
		System.out.println(brand + "" + model + "is stopping.");
	}
	public void displayInfo() {
		System.out.println("Brand:" + brand + ",Model:" + model + ",Price:" +price);
	}
}

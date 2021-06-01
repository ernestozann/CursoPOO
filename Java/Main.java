class Main {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
		uberX.setPassenger(4);
		uberX.printDataCar();

		UberVan uberVan = new UberVan("AMQ123", new Account("Andres Herrera", "AND123"));
		uberVan.setPassenger(6);
		uberVan.printDataCar();

		/*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "AND123"));
		car2.passegenger = 3;
		car2.printDataCar();*/
	}
}
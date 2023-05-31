public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(5.0, 3.0, 2.0);

        double volume = figure.calculateVolume();
        System.out.println("Volume of the figure: " + volume);

        figure.calculateSurfaceArea();

        Transport transport = new Transport();

        transport.setName("Car");
        transport.setSeatCount(4);

        System.out.println("Name: " + transport.getName());
        System.out.println("Seat count: " + transport.getSeatCount());

        Car car = new Car();
        car.setVIN("123456789");
        car.setLicensePlate("AB123CD");

        car.move(); // Output: Car is moving

        car.options(); // Output: I can move back and forward
    }
}
public class TransportVehicle {
    private int id;
    private String registrationNumber;
    private String transportType;
    private String brand;
    private String model;
    private int year;
    private String routeNumber;
    private double currentSpeed;
    private String currentCoordinates;
    private String status;

    public TransportVehicle() {}

    public TransportVehicle(int id, String registrationNumber, String transportType,
                            String brand, String model, int year, String routeNumber,
                            double currentSpeed, String currentCoordinates, String status) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.transportType = transportType;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.routeNumber = routeNumber;
        this.currentSpeed = currentSpeed;
        this.currentCoordinates = currentCoordinates;
        this.status = status;
    }

    public void transportPassengers() {}
    public void followRoute() {
        System.out.println("Транспорт " + registrationNumber + " рухається маршрутом №" + routeNumber);
    }
    public void transmitLocation() {}
    public void transmitSpeed() {
        System.out.println("Швидкість транспорту " + registrationNumber + ": " + currentSpeed + " км/год");
    }

    public void updateSpeed(double newSpeed) {
        if (newSpeed < 0) {
            throw new IllegalArgumentException("Швидкість не може бути від’ємною");
        }
        this.currentSpeed = newSpeed;
    }

    public void updateCoordinates(String newCoordinates) {
        this.currentCoordinates = newCoordinates;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
    public void reportStatus() {}

    @Override
    public String toString() {
        return "TransportVehicle{" +
                "id=" + id +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", transportType='" + transportType + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", routeNumber='" + routeNumber + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", currentCoordinates='" + currentCoordinates + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

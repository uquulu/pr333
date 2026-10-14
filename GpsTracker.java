public class GpsTracker {
    private int id;
    private String serialNumber;
    private String currentCoordinates;
    private double speed;
    private String lastUpdateTime;
    private String connectionStatus;
    private String connectedVehicle;

    public GpsTracker() {}

    public GpsTracker(int id, String serialNumber, String currentCoordinates,
                      double speed, String lastUpdateTime,
                      String connectionStatus, String connectedVehicle) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.currentCoordinates = currentCoordinates;
        this.speed = speed;
        this.lastUpdateTime = lastUpdateTime;
        this.connectionStatus = connectionStatus;
        this.connectedVehicle = connectedVehicle;
    }

    public void determineCoordinates() {
        System.out.println("GPS " + serialNumber + ": координати " + currentCoordinates);
    }
    public void transmitCoordinates() {}
    public void determineSpeed() {}
    public void transmitData() {
        System.out.println("GPS " + serialNumber + ": передано швидкість " + speed
                + " км/год; оновлено: " + lastUpdateTime);
    }

    public void updateTelemetry(String coordinates, double newSpeed, String updateTime) {
        if (newSpeed < 0) {
            throw new IllegalArgumentException("Швидкість не може бути від’ємною");
        }
        this.currentCoordinates = coordinates;
        this.speed = newSpeed;
        this.lastUpdateTime = updateTime;
    }
    public void checkDeviceStatus() {}

    @Override
    public String toString() {
        return "GpsTracker{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", currentCoordinates='" + currentCoordinates + '\'' +
                ", speed=" + speed +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", connectionStatus='" + connectionStatus + '\'' +
                ", connectedVehicle='" + connectedVehicle + '\'' +
                '}';
    }
}

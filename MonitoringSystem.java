public class MonitoringSystem {
    private int systemId;
    private String name;
    private String softwareVersion;
    private int connectedVehiclesCount;
    private int activeRoutesCount;
    private int connectedGpsTrackersCount;
    private String systemStatus;

    public MonitoringSystem() {}

    public MonitoringSystem(int systemId, String name, String softwareVersion,
                            int connectedVehiclesCount, int activeRoutesCount,
                            int connectedGpsTrackersCount, String systemStatus) {
        this.systemId = systemId;
        this.name = name;
        this.softwareVersion = softwareVersion;
        this.connectedVehiclesCount = connectedVehiclesCount;
        this.activeRoutesCount = activeRoutesCount;
        this.connectedGpsTrackersCount = connectedGpsTrackersCount;
        this.systemStatus = systemStatus;
    }

    public void receiveGpsData() {
        System.out.println("Система «" + name + "» отримує дані GPS (демонстрація)");
    }
    public void storeTransportInformation() {}
    public void trackVehicles() {
        System.out.println("Моніторинг транспорту: підключених машин — " + connectedVehiclesCount);
    }
    public void processCoordinates() {}
    public void calculateArrivalTime() {}
    public void transmitInformationToDisplays() {
        System.out.println("Система передає інформацію електронним табло (демонстрація)");
    }
    public void providePassengerInformation() {}
    public void notifyDispatchers() {}

    @Override
    public String toString() {
        return "MonitoringSystem{" +
                "systemId=" + systemId +
                ", name='" + name + '\'' +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", connectedVehiclesCount=" + connectedVehiclesCount +
                ", activeRoutesCount=" + activeRoutesCount +
                ", connectedGpsTrackersCount=" + connectedGpsTrackersCount +
                ", systemStatus='" + systemStatus + '\'' +
                '}';
    }
}

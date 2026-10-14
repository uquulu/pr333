public class ElectronicDisplay {
    private int id;
    private String installationAddress;
    private int stopNumber;
    private String deviceStatus;
    private String currentMessage;
    private String lastUpdateTime;

    public ElectronicDisplay() {}

    public ElectronicDisplay(int id, String installationAddress, int stopNumber,
                             String deviceStatus, String currentMessage,
                             String lastUpdateTime) {
        this.id = id;
        this.installationAddress = installationAddress;
        this.stopNumber = stopNumber;
        this.deviceStatus = deviceStatus;
        this.currentMessage = currentMessage;
        this.lastUpdateTime = lastUpdateTime;
    }

    public void displayRouteNumbers() {}
    public void displayRouteNames() {}
    public void displayArrivalTime() {
        System.out.println("Електронне табло (зупинка №" + stopNumber + "): " + currentMessage);
    }
    public void displayPassengerMessages() {}
    public void updateInformation() {
        System.out.println("Інформацію на табло №" + id + " оновлено о " + lastUpdateTime);
    }

    public void updateMessage(String message, String updateTime) {
        this.currentMessage = message;
        this.lastUpdateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ElectronicDisplay{" +
                "id=" + id +
                ", installationAddress='" + installationAddress + '\'' +
                ", stopNumber=" + stopNumber +
                ", deviceStatus='" + deviceStatus + '\'' +
                ", currentMessage='" + currentMessage + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                '}';
    }
}

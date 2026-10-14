import java.util.List;

public class Stop {
    private int id;
    private String name;
    private String address;
    private String coordinates;
    private List<String> routes;
    private int stopNumber;

    public Stop() {}

    public Stop(int id, String name, String address, String coordinates,
                List<String> routes, int stopNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.coordinates = coordinates;
        this.routes = routes;
        this.stopNumber = stopNumber;
    }

    public void storeLocation() {}
    public void determineRoutes() {
        System.out.println("Зупинка «" + name + "»: маршрути " + routes);
    }
    public void displayTransportInformation() {}
    public void provideArrivalData() {}

    @Override
    public String toString() {
        return "Stop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", coordinates='" + coordinates + '\'' +
                ", routes=" + routes +
                ", stopNumber=" + stopNumber +
                '}';
    }
}

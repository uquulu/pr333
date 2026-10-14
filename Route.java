import java.util.List;

public class Route {
    private String routeNumber;
    private String routeName;
    private String startingStop;
    private String finalStop;
    private List<String> stops;
    private double routeLength;
    private int approximateTravelTime;
    private String schedule;

    public Route() {}

    public Route(String routeNumber, String routeName, String startingStop,
                 String finalStop, List<String> stops, double routeLength,
                 int approximateTravelTime, String schedule) {
        this.routeNumber = routeNumber;
        this.routeName = routeName;
        this.startingStop = startingStop;
        this.finalStop = finalStop;
        this.stops = stops;
        this.routeLength = routeLength;
        this.approximateTravelTime = approximateTravelTime;
        this.schedule = schedule;
    }

    public void defineDirection() {
        System.out.println("Маршрут №" + routeNumber + ": " + startingStop + " → " + finalStop);
    }
    public void storeStops() {}
    public void calculateLength() {}
    public void calculateTravelTime() {
        System.out.println("Орієнтовний час поїздки маршрутом №" + routeNumber + ": "
                + approximateTravelTime + " хв");
    }
    public void assignVehicle() {}

    @Override
    public String toString() {
        return "Route{" +
                "routeNumber='" + routeNumber + '\'' +
                ", routeName='" + routeName + '\'' +
                ", startingStop='" + startingStop + '\'' +
                ", finalStop='" + finalStop + '\'' +
                ", stops=" + stops +
                ", routeLength=" + routeLength +
                ", approximateTravelTime=" + approximateTravelTime +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}

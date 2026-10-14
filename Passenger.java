import java.util.List;

public class Passenger {
    private int id;
    private String name;
    private String phone;
    private String email;
    private List<String> favoriteRoutes;
    private List<String> favoriteStops;

    public Passenger() {}

    public Passenger(int id, String name, String phone, String email,
                     List<String> favoriteRoutes, List<String> favoriteStops) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.favoriteRoutes = favoriteRoutes;
        this.favoriteStops = favoriteStops;
    }

    public void viewAvailableRoutes() {
        System.out.println("Пасажир " + name + ": обрані маршрути — " + favoriteRoutes);
    }
    public void searchRoute() {}
    public void viewTransportLocation() {}
    public void viewNearestStops() {}
    public void getEstimatedArrivalTime() {}
    public void selectStop() {
        System.out.println("Пасажир " + name + ": обрані зупинки — " + favoriteStops);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", favoriteRoutes=" + favoriteRoutes +
                ", favoriteStops=" + favoriteStops +
                '}';
    }
}

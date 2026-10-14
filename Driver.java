public class Driver {
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String licenseNumber;
    private String assignedVehicle;
    private String assignedRoute;

    public Driver() {}

    public Driver(int id, String name, String surname, String phone,
                  String licenseNumber, String assignedVehicle, String assignedRoute) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
        this.assignedVehicle = assignedVehicle;
        this.assignedRoute = assignedRoute;
    }

    public void driveVehicle() {
        System.out.println("Водій " + name + " " + surname + " керує транспортом " + assignedVehicle);
    }
    public void performRoute() {}
    public void followSchedule() {
        System.out.println("Водій " + surname + " дотримується графіка маршруту №" + assignedRoute);
    }
    public void arriveAtStops() {}
    public void reportProblem() {}

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", assignedVehicle='" + assignedVehicle + '\'' +
                ", assignedRoute='" + assignedRoute + '\'' +
                '}';
    }
}

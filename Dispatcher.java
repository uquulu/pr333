public class Dispatcher {
    private int id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String phone;
    private String workShift;

    public Dispatcher() {}

    public Dispatcher(int id, String name, String surname, String login,
                      String password, String phone, String workShift) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.phone = phone;
        this.workShift = workShift;
    }

    public void controlTransportMovement() {
        System.out.println("Диспетчер " + name + " " + surname + " контролює рух транспорту");
    }
    public void viewVehicleLocation() {}
    public void controlSchedule() {}
    public void detectDelays() {
        System.out.println("Диспетчер " + surname + " перевіряє можливі затримки рейсів");
    }
    public void receiveFaultNotifications() {}
    public void sendInformationToDrivers() {}

    @Override
    public String toString() {
        return "Dispatcher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", password='[приховано]'" +
                ", phone='" + phone + '\'' +
                ", workShift='" + workShift + '\'' +
                '}';
    }
}

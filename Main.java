import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger(
                1,
                "Олексій",
                "+380501234567",
                "oleksii@example.com",
                Arrays.asList("12", "18"),
                Arrays.asList("Центральна", "Вокзальна")
        );

        Driver driver = new Driver(
                2,
                "Іван",
                "Петренко",
                "+380671234567",
                "AB123456",
                "Богдан А092",
                "12"
        );

        TransportVehicle vehicle = new TransportVehicle(
                3,
                "BH1234AA",
                "Автобус",
                "Богдан",
                "А092",
                2019,
                "12",
                42.5,
                "46.4825, 30.7233",
                "На маршруті"
        );

        Route route = new Route(
                "12",
                "Центр — Вокзал",
                "Центральна",
                "Вокзальна",
                Arrays.asList("Центральна", "Парк", "Вокзальна"),
                8.5,
                35,
                "06:00–22:00"
        );

        Stop stop = new Stop(
                5,
                "Центральна",
                "вул. Дерибасівська, 1",
                "46.4825, 30.7233",
                Arrays.asList("12", "18"),
                1
        );

        GpsTracker gpsTracker = new GpsTracker(
                6,
                "GPS-001",
                "46.4825, 30.7233",
                42.5,
                "05.10.2026 19:00",
                "Підключено",
                "BH1234AA"
        );

        Dispatcher dispatcher = new Dispatcher(
                7,
                "Петро",
                "Іваненко",
                "dispatcher01",
                "password123",
                "+380931234567",
                "08:00–20:00"
        );

        ElectronicDisplay display = new ElectronicDisplay(
                8,
                "вул. Дерибасівська, 1",
                1,
                "Працює",
                "Маршрут 12 — прибуття через 5 хв",
                "05.10.2026 19:00"
        );

        MonitoringSystem system = new MonitoringSystem(
                9,
                "Система моніторингу громадського транспорту",
                "1.0.0",
                25,
                10,
                25,
                "Активна"
        );

        // Етапи можна запустити окремо: Main 1, Main 2, Main 3.
        // Без аргументів виконуються всі три етапи послідовно.
        String stage = args.length == 0 ? "all" : args[0];
        switch (stage) {
            case "1":
                showObjects(passenger, driver, vehicle, route, stop,
                        gpsTracker, dispatcher, display, system);
                break;
            case "2":
                demonstrateMethods(passenger, driver, vehicle, route, stop,
                        gpsTracker, dispatcher, display, system);
                break;
            case "3":
                demonstrateUpdates(vehicle, gpsTracker, display);
                break;
            case "all":
                showObjects(passenger, driver, vehicle, route, stop,
                        gpsTracker, dispatcher, display, system);
                demonstrateMethods(passenger, driver, vehicle, route, stop,
                        gpsTracker, dispatcher, display, system);
                demonstrateUpdates(vehicle, gpsTracker, display);
                break;
            default:
                System.out.println("Доступні етапи: 1, 2, 3 або без аргументів (усі етапи)");
        }
    }

    private static void showObjects(Passenger passenger, Driver driver,
                                    TransportVehicle vehicle, Route route, Stop stop,
                                    GpsTracker gpsTracker, Dispatcher dispatcher,
                                    ElectronicDisplay display, MonitoringSystem system) {
        System.out.println("========== ЕТАП 1. СТВОРЕННЯ ОБ'ЄКТІВ ==========");
        System.out.println(passenger);
        System.out.println(driver);
        System.out.println(vehicle);
        System.out.println(route);
        System.out.println(stop);
        System.out.println(gpsTracker);
        System.out.println(dispatcher);
        System.out.println(display);
        System.out.println(system);
        System.out.println("Створено 9 об'єктів. Метод toString() викликано для кожного.\n");
    }

    private static void demonstrateMethods(Passenger passenger, Driver driver,
                                           TransportVehicle vehicle, Route route, Stop stop,
                                           GpsTracker gpsTracker, Dispatcher dispatcher,
                                           ElectronicDisplay display, MonitoringSystem system) {
        System.out.println("========== ЕТАП 2. ВИКЛИК МЕТОДІВ ==========");
        passenger.viewAvailableRoutes();
        passenger.selectStop();
        driver.driveVehicle();
        driver.followSchedule();
        vehicle.followRoute();
        vehicle.transmitSpeed();
        route.defineDirection();
        route.calculateTravelTime();
        stop.determineRoutes();
        gpsTracker.determineCoordinates();
        gpsTracker.transmitData();
        dispatcher.controlTransportMovement();
        dispatcher.detectDelays();
        display.displayArrivalTime();
        system.receiveGpsData();
        system.trackVehicles();
        system.transmitInformationToDisplays();
        System.out.println("Виклики методів виконано.\n");
    }

    private static void demonstrateUpdates(TransportVehicle vehicle,
                                            GpsTracker gpsTracker, ElectronicDisplay display) {
        System.out.println("========== ЕТАП 3. ОНОВЛЕННЯ ДАНИХ ==========");
        System.out.println("До оновлення:");
        vehicle.transmitSpeed();
        gpsTracker.determineCoordinates();
        display.displayArrivalTime();

        vehicle.updateSpeed(28.0);
        vehicle.updateStatus("Наближається до зупинки");
        vehicle.updateCoordinates("46.4850, 30.7300");
        gpsTracker.updateTelemetry("46.4850, 30.7300", 28.0, "14.10.2026 17:00");
        display.updateMessage("Маршрут 12 — прибуття через 2 хв", "14.10.2026 17:00");

        System.out.println("Після оновлення:");
        vehicle.transmitSpeed();
        gpsTracker.determineCoordinates();
        gpsTracker.transmitData();
        display.displayArrivalTime();
        display.updateInformation();
        System.out.println("Змінений стан транспортного засобу: " + vehicle);
        System.out.println("Етап 3 завершено.");
    }
}

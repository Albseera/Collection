import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        System.out.println("Коллекции. #1");

        Driver driver = new Driver("John");

        Mechanic mechanicsTayota = new Mechanic("Semuael", "Tayota", TransportType.ALL);

        Bus bus = new Bus("Mercedes", "B700", 8.0);

        Car car = new Car("Tayota", " Mark II", 2.5);

        car.addMechanica(mechanicsTayota);


        List<Mechanic> racers = new ArrayList<>();
        racers.add(mechanicsTayota);
        System.out.println(racers);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(driver);
        System.out.println(drivers);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addQueue(car);
        serviceStation.addQueue(bus);

        serviceStation.spendTO();
        serviceStation.spendTO();


    }
}

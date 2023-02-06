public class Truck extends Transport {


    public Truck(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);

    }

    @Override
    public String toString() {
        return "Марка " + getStamp() + "; " + "Модель " + getModel() + "; " + "Объём двигателя " + getEngineCapacity();
    }

    @Override
    public void passDiagnostics() {
        throw new RuntimeException("Грузовики могут проходить диагностику");
    }

    @Override
    public void printЕhePilotCommand() {
        System.out.println("команда водителя");
    }









}
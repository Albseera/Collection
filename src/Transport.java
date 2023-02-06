import java.util.ArrayList;
import java.util.List;

public abstract class Transport {

    private String stamp;
    private String model;
    private double engineCapacity;
   // private final ArrayList<Mechanic> mechanics = new ArrayList<>();
    private  List<Mechanic> mechanics = new ArrayList<>();


    public String getStamp() {
        return stamp;
    }
    public void setStamp(String stamp) {
        this.stamp = stamp;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }
    public void addMechanica(Mechanic mechanics) {
        getMechanics().add(mechanics);
        System.out.println("Механик " + mechanics.getName() + " Из компании " + mechanics.getCompany() +
                " Транспорт обслуживания " + mechanics.getTransportType());
    }


    public Transport(String stamp, String model, double engineCapacity) {
        this.stamp = stamp;
        this.model = model;
        this.engineCapacity = engineCapacity;

    }
    public abstract void passDiagnostics();
    public abstract void printЕhePilotCommand();






}
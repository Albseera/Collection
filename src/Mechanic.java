public class Mechanic {
    private String name;
    private String company;
    private TransportType transportType;


    public Mechanic(String name, String company, TransportType transportType) {
        this.name = name;
        this.company = company;
        this.transportType = transportType;
    }

    public void performMaintenance() {
        System.out.println(name + " из компании " + company + " Проводит техобслуживание");
    }

    public void fixTheCar() {
        System.out.println(name + " из компании " + company + " починит машину");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public TransportType getTransportType() {
        return transportType;
    }
    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return " Механик " + name + " Из компании " + company;
    }
}
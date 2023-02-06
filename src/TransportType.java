public enum TransportType {
    BUS("Автобус"),
    CAR("Легковой автомобиль"),
    TRUCK("Грузовик"),
    ALL("Любой");
    private final String assignmentTransportType;


    TransportType(String assignmentTransportType) {
        this.assignmentTransportType = assignmentTransportType;
    }
    @Override
    public String toString() {
        return assignmentTransportType;
    }

}
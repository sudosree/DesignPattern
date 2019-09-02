public abstract class Vehicle {

    private String vehicleNo;
    private VehicleColor vehicleColor;

    public Vehicle(String vehicleNo, VehicleColor vehicleColor) {
        this.vehicleNo = vehicleNo;
        this.vehicleColor = vehicleColor;
    }

    public abstract VehicleType getVehicleType();

    public String getVehicleNo() {
        return vehicleNo;
    }

    public VehicleColor getVehicleColor() {
        return vehicleColor;
    }

}

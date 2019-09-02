public class Car extends Vehicle {

    public Car(String vehicleNo, VehicleColor vehicleColor) {
        super(vehicleNo, vehicleColor);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.CAR;
    }
}

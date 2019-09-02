public class MotorBike extends Vehicle {

    public MotorBike(String vehicleNo, VehicleColor vehicleColor) {
        super(vehicleNo, vehicleColor);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.MOTORBIKE;
    }
}

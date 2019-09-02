public class LargeParkingSpot extends ParkingSpot {

    public LargeParkingSpot(int parkingSpotId) {
        super(parkingSpotId, true);
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.LARGE;
    }

    @Override
    public boolean canVehicleFitInTheSpot(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.MOTORBIKE || vehicle.getVehicleType() == VehicleType.CAR;
    }
}

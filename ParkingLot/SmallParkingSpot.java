public class SmallParkingSpot extends ParkingSpot {

    public SmallParkingSpot(int parkingSpotId) {
        super(parkingSpotId, true);
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.SMALL;
    }

    @Override
    public boolean canVehicleFitInTheSpot(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.MOTORBIKE;
    }
}

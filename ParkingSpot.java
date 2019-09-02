public abstract class ParkingSpot {

    private int parkingSpotId;
    private boolean parkingSpotAvailable;
    private Vehicle vehicle;

    public ParkingSpot(int parkingSpotId, boolean parkingSpotAvailable) {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotAvailable = parkingSpotAvailable;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public abstract ParkingSpotType getParkingSpotType();

    public abstract boolean canVehicleFitInTheSpot(Vehicle vehicle);

    public void addVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        parkingSpotAvailable = false;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        parkingSpotAvailable = true;
    }

    public boolean isParkingSpotAvailable() {
        return parkingSpotAvailable;
    }
}

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ParkingSpace {

    private int parkingSpaceId;
    private String parkingSpaceName;
    private Map<Integer, ParkingSpot> freeParkingSpotList;
    private Map<ParkingSpot, Vehicle> occupiedParkingSpotVehicleList;

    private int maxParkingSpot;

    public ParkingSpace(int parkingSpaceId, String parkingSpaceName, int maxParkingSpot) {
        this.parkingSpaceId = parkingSpaceId;
        this.parkingSpaceName = parkingSpaceName;
        this.maxParkingSpot = maxParkingSpot;
        this.freeParkingSpotList = new HashMap<>();
        this.occupiedParkingSpotVehicleList = new HashMap<>();
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        if (freeParkingSpotList.size() < maxParkingSpot) {
            freeParkingSpotList.put(parkingSpot.getParkingSpotId(), parkingSpot);
        } else {
            System.out.println("Cannot add a parking spot as the count of parking spot will exceed the maximum threshold.");
        }
    }

    public void addVehicleToTheParkingSpot(Vehicle vehicle) {
        for (Map.Entry<Integer, ParkingSpot> freeSpot : freeParkingSpotList.entrySet()) {
            ParkingSpot parkingSpot = freeSpot.getValue();
            if (parkingSpot.isParkingSpotAvailable() && parkingSpot.canVehicleFitInTheSpot(vehicle)) {
                parkingSpot.addVehicle(vehicle);
                occupiedParkingSpotVehicleList.put(parkingSpot, vehicle);
                freeParkingSpotList.remove(freeSpot.getKey());
                return;
            }
        }
        System.out.println("No free parking spots are available");
    }

    public void removeVehicleFromTheParkingSpot(Vehicle vehicle) {
        for (Map.Entry<ParkingSpot, Vehicle> occupiedSpot : occupiedParkingSpotVehicleList.entrySet()) {
            ParkingSpot parkingSpot = occupiedSpot.getKey();
            if (occupiedParkingSpotVehicleList.containsValue(vehicle) && !parkingSpot.isParkingSpotAvailable()) {
                parkingSpot.removeVehicle(vehicle);
                freeParkingSpotList.put(parkingSpot.getParkingSpotId(), parkingSpot);
                occupiedParkingSpotVehicleList.remove(parkingSpot);
                return;
            }
        }
        System.out.println("This vehicle doesn't exist in our parking lot");
    }

    public int getParkingSpaceId() {
        return parkingSpaceId;
    }

    public String getParkingSpaceName() {
        return parkingSpaceName;
    }

    public int getMaxParkingSpot() {
        return maxParkingSpot;
    }

    public Map<Integer, ParkingSpot> getFreeParkingSpotList() {
        return Collections.unmodifiableMap(freeParkingSpotList);
    }

    public Map<ParkingSpot, Vehicle> getOccupiedParkingSpotVehicleList() {
        return Collections.unmodifiableMap(occupiedParkingSpotVehicleList);
    }
}

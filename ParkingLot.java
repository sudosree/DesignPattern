import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private String name;
    private Address address;
    private int maxParkingSpaceCount;

    private Map<Integer, ParkingSpace> parkingSpaceList;

    public ParkingLot(String name, Address address, int maxParkingSpaceCount) {
        this.name = name;
        this.address = address;
        this.maxParkingSpaceCount = maxParkingSpaceCount;
        parkingSpaceList = new HashMap<>();
    }

    public void addParkingSpace(ParkingSpace parkingSpace) {
        if (parkingSpaceList.size() < maxParkingSpaceCount) {
            parkingSpaceList.put(parkingSpace.getParkingSpaceId(), parkingSpace);
        } else {
            System.out.println("cannot add parking space after a certain threshold");
        }
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getMaxParkingSpaceCount() {
        return maxParkingSpaceCount;
    }

    public Map<Integer, ParkingSpace> getParkingSpaceList() {
        return Collections.unmodifiableMap(parkingSpaceList);
    }
}

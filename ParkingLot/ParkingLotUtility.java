public class ParkingLotUtility {
    public static void main(String[] args) {
        /*Vehicle vehicle = new MotorBike("1234", VehicleColor.BLUE);
        vehicle.display();
        Vehicle vehicle1 = new MotorBike("ashd", VehicleColor.RED);
        vehicle1.display();

        Vehicle vehicle2 = new Car("9876", VehicleColor.BROWN);
        vehicle2.display();
        Vehicle vehicle3 = new Car("lkhy", VehicleColor.WHITE);
        vehicle3.display();*/

        ParkingLot parkingLot = new ParkingLot();

        ParkingSpot parkingSpot1 = new SmallParkingSpot(1);
        parkingLot.addParkingSpot(parkingSpot1);
        ParkingSpot parkingSpot2 = new SmallParkingSpot(2);
        parkingLot.addParkingSpot(parkingSpot2);
        parkingLot.displayMotorBikesParkingSpot();

        ParkingSpot parkingSpot3 = new LargeParkingSpot(3);
        parkingLot.addParkingSpot(parkingSpot3);
        ParkingSpot parkingSpot4 = new LargeParkingSpot(4);
        parkingLot.addParkingSpot(parkingSpot4);
        parkingLot.displayCarParkingSpot();

        Vehicle vehicle = new MotorBike("1234", VehicleColor.WHITE);
        parkingLot.addVehicleToParkingSpot(parkingSpot1, vehicle);
        parkingLot.displayMotorBikesParkingSpot();
        parkingLot.displayCarParkingSpot();
    }
}

package innerClasses;

// Hotel class that manages room reservations
class Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    // Constructor to initialize the hotel details
    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    // Method to reserve rooms for a guest
    public void reservedRoom(String guestName, int numOfRooms) {

        // Local inner class used to validate reservation inputs
        class ReservationValidator {
            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("Guest name cannot be empty");
                    return false;
                } else if (numOfRooms < 0) {
                    System.out.println("Number of rooms should be positive");
                    return false;
                } else if (reservedRooms + numOfRooms > totalRooms) {
                    System.out.println("Not enough rooms available");
                    return false;
                }
                return true; // All validations passed
            }
        }

        // Create an instance of the inner validator class
        ReservationValidator v = new ReservationValidator();

        // If validation passes, update the reserved rooms count
        if (v.validate()) {
            reservedRooms += numOfRooms;
            System.out.println("Reservation confirmed for " + guestName + " for " + numOfRooms);
        } else {
            // Otherwise, indicate that the reservation failed
            System.out.println("Reservation failed");
        }
    }
}
//<----------------------------------------------------------------------------------------------------------------------------->
// Test class with main method to run the Hotel reservation example
public class test1 {
    public static void main(String[] args) {
        Hotel h = new Hotel("Sunshine", 5, 2); // Create hotel with 5 rooms, 2 already reserved
        h.reservedRoom("Swarup", 2);          // Should succeed: 2 + 2 = 4 < 5
        h.reservedRoom("Subham", 3);          // Should fail: 4 + 3 = 7 > 5
    }
}

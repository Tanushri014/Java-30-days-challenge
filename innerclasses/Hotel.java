package innerclasses;

public class Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms) {

        class ReservationValidator {
            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("geust name cannot be empty");

                    return false;
                }

                if (numOfRooms < 0) {

                    System.out.println("room is reserved");
                    return false;
                }
                if (reservedRooms + numOfRooms > totalRooms) {
                    System.out.println("enough room are not present ");

                    return false;
                }
                return true;
            }

            public ReservationValidator() {
            }
        }
        ReservationValidator validator=new ReservationValidator();
    if(validator.validate()){
        reservedRooms+=numOfRooms;
        System.out.println("reservation succed ");
    }
    else{
        System.out.println("reservation failed ");
    }

    }

    

}

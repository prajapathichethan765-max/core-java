class HotelRoomsRunner {
    public static void main(String[] args) {

        boolean roomNumber1 = true;
        boolean roomNumber2 = false;
        boolean roomNumber3 = true;
        boolean roomNumber4 = true;
        boolean roomNumber5 = false;

        boolean result = HotelRooms.roomAvailability(
            roomNumber1, roomNumber2, roomNumber3, roomNumber4, roomNumber5);

        System.out.println("All rooms available: " + result);

        System.out.println(roomNumber1);
        System.out.println(roomNumber2);
        System.out.println(roomNumber3);
        System.out.println(roomNumber4);
        System.out.println(roomNumber5);
    }
}
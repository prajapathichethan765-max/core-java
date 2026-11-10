classclass HotelRooms {
    static boolean roomAvailability(boolean room1, boolean room2, boolean room3, boolean room4, boolean room5) {

        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println(room4);
        System.out.println(room5);

        boolean rooms[] = {room1, room2, room3, room4, room5};

        System.out.println(rooms[0]);
        System.out.println(rooms[1]);
        System.out.println(rooms[2]);
        System.out.println(rooms[3]);
        System.out.println(rooms[4]);

        return rooms[0] && rooms[1] && rooms[2] && rooms[3] && rooms[4];
    }
}
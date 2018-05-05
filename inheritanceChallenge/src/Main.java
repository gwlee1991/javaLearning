public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("twin", "rectangle");
        Desk desk = new Desk(4, "multi");

        Room room = new Room(desk, bed);
        room.clearnDesk();
    }
}

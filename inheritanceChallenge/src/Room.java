public class Room {
    private Desk desk;
    private Bed bed;

    public Room(Desk desk, Bed bed) {
        this.desk = desk;
        this.bed = bed;
    }

    public void clearnDesk() {
        desk.cleanDesk();
    }

}

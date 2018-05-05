public class Desk {
    private int legs;
    private String purpose;

    public Desk(int legs, String purpose) {
        this.legs = legs;
        this.purpose = purpose;
    }

    public void cleanDesk() {
        System.out.println("desk is now clean");
    }

    public int getLegs() {
        return legs;
    }

    public String getPurpose() {
        return purpose;
    }
}

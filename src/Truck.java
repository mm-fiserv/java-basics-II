public final class Truck extends Vehicle{
    private int trunkSize;

    public Truck(String color, double maxSpeed, double milesTillEmpty, int trunkSize) {
        super(color, maxSpeed, milesTillEmpty);
        this.trunkSize = trunkSize;
    }

    public int getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(int trunkSize) {
        this.trunkSize = trunkSize;
    }

    @Override
    public void horn(){
        System.out.println("BEEEEEPPPP BEEEEPPPP");
    }
}

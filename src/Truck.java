public class Truck extends Car {
    private double wagaLadunku;

    public Truck(String nazwa, double pojemnoscBaku, double spalanieNa100, boolean wlaczonaKlimatyzacja, double wagaLadunku) {
        super(nazwa, pojemnoscBaku, spalanieNa100, wlaczonaKlimatyzacja);
        this.wagaLadunku = wagaLadunku;
    }

    public double getWagaLadunku() {
        return wagaLadunku;
    }

    public void setWagaLadunku(double wagaLadunku) {
        this.wagaLadunku = wagaLadunku;
    }

    public double obliczZasieg(){
        double zasieg;
        if(isWlaczonaKlimatyzacja()){
            zasieg = (getPojemnoscBaku() * 100) / (getSpalanieNa100() + 1.6 + (wagaLadunku * 0.5 / 100));
        } else {
            zasieg = (getPojemnoscBaku() * 100) / (getSpalanieNa100() + (wagaLadunku * 0.5 / 100));
        }
        return zasieg;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Waga ładunku: " + wagaLadunku);
    }
}

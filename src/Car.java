public class Car extends Vehicle {
    private boolean wlaczonaKlimatyzacja;

    public Car(String nazwa, double pojemnoscBaku, double spalanieNa100, boolean wlaczonaKlimatyzacja) {
        super(nazwa, pojemnoscBaku, spalanieNa100);
        this.wlaczonaKlimatyzacja = wlaczonaKlimatyzacja;
    }

    public boolean isWlaczonaKlimatyzacja() {
        return wlaczonaKlimatyzacja;
    }

    public void setWlaczonaKlimatyzacja(boolean wlaczonaKlimatyzacja) {
        this.wlaczonaKlimatyzacja = wlaczonaKlimatyzacja;
    }

    public double obliczZasieg(){
        double zasieg;
        if(wlaczonaKlimatyzacja){
            zasieg = (getPojemnoscBaku() * 100) / (getSpalanieNa100() + 0.8);
        } else {
            zasieg = (getPojemnoscBaku() * 100) / getSpalanieNa100();
        }
        return zasieg;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(", włączona klimatyzacja: " + wlaczonaKlimatyzacja);
    }
}

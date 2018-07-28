public class Vehicle {
    private String nazwa;
    private double pojemnoscBaku;
    private double spalanieNa100;

    public Vehicle(String nazwa, double pojemnoscBaku, double spalanieNa100) {
        this.nazwa = nazwa;
        this.pojemnoscBaku = pojemnoscBaku;
        this.spalanieNa100 = spalanieNa100;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getPojemnoscBaku() {
        return pojemnoscBaku;
    }

    public void setPojemnoscBaku(double pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public double getSpalanieNa100() {
        return spalanieNa100;
    }

    public void setSpalanieNa100(double spalanieNa100) {
        this.spalanieNa100 = spalanieNa100;
    }

    public void showInfo(){
        System.out.print("Nazwa: " + nazwa + ", pojemność baku: " + pojemnoscBaku + ", średnie spalanie na 100 km: " + spalanieNa100);
    }
}

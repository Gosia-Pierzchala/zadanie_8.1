public class Test {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", 80, 12.5, false);
        cars[1] = new Car("BMW", 60, 11, false);
        cars[2] = new Truck("TIR1", 120, 15, false, 1000);
        cars[3] = new Truck("TIR2", 150, 25, false, 500);

        for(Car car: cars){
            car.showInfo();
            double zasieg = car.obliczZasieg();
            System.out.println("Zasięg pojazdu to: " + zasieg + " km");
        }

        for(Car car: cars){
            car.setWlaczonaKlimatyzacja(true);
            car.showInfo();
            double zasieg = car.obliczZasieg();
            System.out.println("Zasięg pojazdu to: " + zasieg + " km");
        }
    }
}

import dto.*;

public class Main {

    public static void main(String[] args) {
        ICar c1 = new BMW(new Motor(50, "AI-80", "Двигатель внутреннего сгорания"), new Wheel(30, "Зимние", "Ошипованные шины"), 4, "B", 961281);
        ICar m1 = new Motorcycle(new Motor(20,"AI-60","Двигатель внутреннего сгорания"), new Wheel(20,"Летние","Простые"), 1, "A", 73737);
        Driver d1 = new OneGuy(4, "A,B", 961281);
        Driver d2 = new OneGuy(4, "A", 9612381);
        Driver d3 = new OneGuy(4, "A", 73737);

        /*c1.openCar(d1.getKey());
        c1.startCar(d1.getKey());
        c1.takePassengers(3);
        c1.driveCar(d2.getMyCategory());
        c1.refuelCar(40);*/

        m1.openCar(d3.getKey());
        m1.startCar(d3.getKey());
        m1.takePassengers(2);
        m1.driveCar(d3.getMyCategory());
        m1.refuelCar(30);
    }
}

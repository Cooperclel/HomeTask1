package dto;

public abstract class Car implements ICar{
    private Motor motor;
    private Wheel wheel;
    private int seatPlaces;
    private String category;
    private int key;

    public Car(Motor motor, Wheel wheel, int seatPlaces, String category, int key){
        this.motor = motor;
        this.wheel = wheel;
        this.seatPlaces = seatPlaces;
        this.category = category;
        this.key = key;
    }

    public Motor getMotor() {
        return motor;
    }
    public Wheel getWheel() {
        return wheel;
    }

    public void setSeatPlaces(int seatPlaces){this.seatPlaces = seatPlaces;}
    public int getSeatPlaces(){return seatPlaces;}

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory(){return category;}

    public void setKey(int key) {
        this.key = key;
    }
    public int getKey() {
        return key;
    }

    public void openCar(int myKey){
        System.out.println("Вы вставили ключ в замок");
        if (key == myKey){
            System.out.println("Ключ верный. Дверь открыта");
        }
        else {
            System.out.println("Ключ фальшивый. Дверь заперта");
        }
    }

    public void startCar(int myKey){
        System.out.println("Вы пытайтесь вставить ключь в замок зажигания");
        if (key == myKey){
            System.out.println("Ключ верный. Машина завелась");
        }
        else {
            System.out.println("Ключ фальшивый. Вы не смогли завести машину");
        }
    }

    public void driveCar(String myCategory){
        System.out.println("Можете ли вы управлять данным транспортным средством");
        System.out.println("Необходимая категория прав:  " + category + "  или выше");
        if (myCategory == "A" & category == "A"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "B" & category == "B"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "A,B" & category == "B" | category == "A"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "C" & category == "C" | category == "B"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "A,C" & category == "C" | category == "B" | category == "A"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "A,B,C" & category == "C" | category == "B" | category == "A"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "D" & category == "D" | category == "C" | category == "B"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "A,D" & category == "D" | category == "C" | category == "B" | category == "A"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "A,B,D" & category == "D" | category == "C" | category == "B" | category == "A"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }else
        if (myCategory == "A,B,C,D" & category == "D" | category == "C" | category == "B" | category == "A"){
            System.out.println("Ваша категория подходит. Вы можете управлять этим транспортным средством");
        }
        else {
            System.out.println("Вы не можете управлять этим транспортным средством. Или проверьте написанную категорию");
        }
    }

    public void takePassengers(int passengers){
        System.out.println("Количество мест для пассажиров:" + seatPlaces);
        if (passengers <= seatPlaces){
            System.out.println("Количество мест приемлемо. Вы можете взять столько пассажиров");
        }
        else {
            System.out.println("Количество мест мало. Вы не можете взять столько пассажиров");
        }
    }

    public void refuelCar(int desiredVolume){
        System.out.println("Нужно заправиться! Тип бензина: " + motor.getBenzineType());
        if (desiredVolume <= motor.getVolume()){
            System.out.println("Можно заправить бак на " + desiredVolume + " л");
        }
        else {
            System.out.println("Слишком велико количество заливаемого топлива");
        }
    }
}

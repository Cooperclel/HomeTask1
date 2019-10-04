package dto;

public interface ICar {
    void openCar(int myKey);
    void startCar(int myKey);
    void driveCar(String myCategory);
    void takePassengers(int passengers);
    void refuelCar(int desiredVolume);

}

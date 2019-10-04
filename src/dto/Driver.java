package dto;

public abstract class Driver{
    private int yearOfDriving;
    private String myCategory;
    private int key;

    public Driver ( int yearOfDriving, String myCategory, int key){
        this.yearOfDriving = yearOfDriving;
        this.myCategory = myCategory;
        this.key = key;
    }

    public void setYearOfDriving(int yearOfDriving){
        this.yearOfDriving = yearOfDriving;
    }
    public int getYearOfDriving() {
        return yearOfDriving;
    }

    public void setMyCategory(String myCategory){
        this.myCategory = myCategory;
    }
    public String getMyCategory() {
        return myCategory;
    }

    public void setKey(int key){
        this.key = key;
    }
    public int getKey(){
        return key;
    }




}

package dto;

public class Wheel {
    private int radius;
    private String seasonType;
    private String name;

    public Wheel(int radius, String seasonType, String name){
        this.radius = radius;
        this.seasonType = seasonType;
        this.name = name;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setSeasonType(String seasonType){
        this.seasonType = seasonType;
    }
    public String getSeasonType(){
        return seasonType;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}

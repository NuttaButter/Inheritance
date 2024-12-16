package Ex3_MusicFestival;

class FoodTrucks extends NonMusicEvent {
    public String foodType;
    public FoodTrucks(String name, String type, String loc ){
        super(name, type, loc);
        type = this.foodType;

    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void printInfo(){
        System.out.println(super.getEventName() + " is a food truck selling " + this.foodType + " at " + super.getLocation());
        System.out.println();
    }
}

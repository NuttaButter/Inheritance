package Ex3_MusicFestival;


class SmallStageEvent extends Event {
    public int totalPerformers;
    public int duration;

    public SmallStageEvent(String name, String type, int performers, int duration) {
        super(name, type);
        super.setLocation("Small Stage");
        this.totalPerformers = performers;
        this.duration = duration;
    }

    public void extendDuration(int e){
        this.duration += e;
    }

    public void printTotals(){
        System.out.println(super.getEventName() + " has a total of " + this.totalPerformers + " performers and lasts " + this.duration + " minutes.");
        System.out.println();
    }



}

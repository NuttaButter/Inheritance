package Ex3_MusicFestival;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex3_Main {
    public static void run() {
        ArrayList<Event> allEvents = new ArrayList<>();

        allEvents.add(new MainStageEvent("Walk off the Earth", "Music"));
        allEvents.add(new MainStageEvent("The Black Pumas", "Music"));
        allEvents.add(new MainStageEvent("Kahoot music quiz", "Music"));
        allEvents.add(new MainStageEvent("Macbeth", "Play"));
        allEvents.add(new MainStageEvent("Othello", "Play"));

        allEvents.add(new FoodTrucks("Bharatiya Brunch", "Food Truck", "Lot 1"));
        allEvents.add(new FoodTrucks("Burger King", "Food Truck", "Lot 2"));
        allEvents.add(new FoodTrucks("Subway", "Food Truck", "Lot 3"));
        allEvents.add(new FoodTrucks("Nando's", "Food Truck", "Lot 4"));
        allEvents.add(new FoodTrucks("Thai Valley Grill", "Food Truck", "Lot 5"));

        allEvents.add(new SmallStageEvent("Tortoise vs. Hare Race", "Race", 2, 20));
        allEvents.add(new SmallStageEvent("Fencing Duel", "Action", 2, 30));
        allEvents.add(new SmallStageEvent("20 Meter Sprint", "Race", 5, 1));
        allEvents.add(new SmallStageEvent("Water Balloon Juggling", "Action", 1, 10));
        allEvents.add(new SmallStageEvent("Stand Up Comedy", "Comedy", 1, 15));

        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");

//        for (int i = 0; i < allEvents.size(); i++) {
//            System.out.println(allEvents.get(i).getEventName());
//            if(allEvents.get(i) instanceof MainStageEvent){
//                ((MainStageEvent)allEvents.get(i)).printTech();
//            }
//
//        }

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("1.  Add new event");
            System.out.println("2.  Search for event");
            System.out.println("3.  Filter by event type");
            System.out.println("4.  Exit");

            int choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                System.out.println("Which event type are you adding? (Main/Small/FoodTruck)");
                String response = input.nextLine();

                if(response.equalsIgnoreCase("main")){
                    System.out.println("What will this event be called?");
                    String eventName = input.nextLine();
                    System.out.println("What type of event is " + eventName + "?");
                    String eventType = input.nextLine();

                    allEvents.add(new MainStageEvent(eventName, eventType));
                }
                if(response.equalsIgnoreCase("small")){
                    System.out.println("What will this event be called?");
                    String eventName = input.nextLine();
                    System.out.println("What type of event is " + eventName + "?");
                    String eventType = input.nextLine();
                    System.out.println("How many performers are in this event?");
                    int eventPerformers = input.nextInt();
                    input.nextLine();
                    System.out.println("How many minutes will this event last?");
                    int eventDuration = input.nextInt();
                    input.nextLine();
                    allEvents.add(new SmallStageEvent(eventName, eventType, eventPerformers, eventDuration));
                }
                if(response.equalsIgnoreCase("foodtruck")){
                    System.out.println("What will this truck be called?");
                    String eventName = input.nextLine();

                }

            }
            if(choice == 2){

            }
            if(choice == 3){

            }
            if(choice == 4){
                break;
            }
        }
    }
}

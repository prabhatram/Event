import java.util.*;
import java.time.*;

public class EventCollection {

    Scanner reader = new Scanner(System.in);
    ArrayList<Event> eventCollection;

    public EventCollection(){
        this.eventCollection = new ArrayList<>();
    }

    public void addEvent(){
            
        System.out.println("Enter the Event ID : ");
        String id = reader.nextLine();
        
        System.out.println("Enter the name of the Event: ");
        String name = reader.nextLine();
    
        System.out.println("Enter the Event date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(reader.nextLine());
        
        System.out.println("Enter the date venue: ");
        String venue = reader.nextLine();
        
        /* System.out.println("How many people are attending?: ");
        int num = reader.nextInt();
        reader.nextLine();  */
        eventCollection.add(new Event(id, name, date, venue));
    }

    public void updateEvent(){

        System.out.println("\n" + "Enter the event ID to update it:");
        String eventID = reader.nextLine();

        for(Event event: eventCollection){
            if(event.getEventID().equals(eventID)){

                System.out.println("\n" + "Type 1 if you want to update the Event name:");
                System.out.println("\n" + "Type 2 if you want to update the Event date:");
                System.out.println("\n" + "Type 3 if you want to update the Event venue:");
                int choice = reader.nextInt();
                reader.nextLine();
                
                switch(choice){
                    case 1:
                    System.out.println("\n" + "Enter the new Event name");
                    String newName = reader.nextLine();
                    eventCollection(eventCollection.indexOf(eventID), new Event())
                    event.setEventName(newName);
                    break;
                    case 2:
                    System.out.println("\n" + "Enter the new Event date (YYYY-MM-DD): ");
                    String newDate = reader.nextLine();
                    event.setEventDate(LocalDate.parse(newDate));
                    break;
                    case 3:
                    System.out.println("\n" + "Enter the new date venue: ");
                    String newVenue = reader.nextLine();
                    event.setEventVenue(newVenue);
                    break;
                }
            }
        }
    }

    public void removeEvent(){
        System.out.println("\n" + "Enter the event ID to remove it completely:");
        String id = reader.nextLine();

        for(Event event: eventCollection){
            if(event.getEventID().equals(id)){
                eventCollection.remove(event);
            }
        }

    }

    public void findEvent(){

    }

    public void displayEvents(){

    }
 

    public void addAttendees(int num){
        event.handleAttendees(num);
    }

    public void displayAttendees(){

        for(Event event: eventCollection){
            eventCollection.get(event);

        }
        

    }
}


   /*  public void removeAttendee(String attendee){
        events.remove(attendee);
    }

    public void updateAttendee(String attendee, int index){
        eventAttendees.set(index, attendee);
    }

    public void getAttendee(int index){
        eventAttendees.get(index);
    }

    public void displayAttendees(){
        for(String attendee: eventAttendees){
            System.out.println(attendee);
        }
    } */
    
    /* public void addEvent(){

        System.out.println("Enter the Event ID : ");
        String id = reader.nextLine();
        

        System.out.println("Enter the name of the Event: ");
        String name = reader.nextLine();
        

        System.out.println("Enter the Event date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(reader.nextLine());
        

        System.out.println("Enter the date venue: ");
        String venue = reader.nextLine();   
        

        System.out.println("How many people are attending the event? ");
        int num = reader.nextInt();   
        reader.nextLine();

        events.add(new Event(id, name, date, venue, num));

        if(num > 0){
            handleAttendees(num);
        }
        
    } */

    /* public void handleAttendees(int num){

        for(int i=0; i<num; i++){
            System.out.println("Enter the name of the attendee: ");
            String attendee = reader.nextLine();
            eventAttendees.add(attendee);
            System.out.println("\n" + attendee + " added successfully to the list of attendees");
        }
        
        System.out.println("Enter the name of the attendee to remove:");
        String nameToRemove = reader.nextLine();
        eventAttendees.remove(nameToRemove);
        System.out.println("\n" + nameToRemove + " removed successfully from the list of attendees");
        
        System.out.println("Enter the name of the attendee to update:");
        String nameToUpdate = reader.nextLine();
        System.out.println("Enter the position where you want to update:");
        int index = reader.nextInt();
        reader.nextLine();
        System.out.println("\n" + nameToUpdate + " updated successfully at the " + index + " position");
        
        System.out.println("Enter the name of the attendee to find:");
        String nameToFind = reader.nextLine();
        if(eventAttendees.contains(nameToFind)){
            System.out.println("\n" + nameToFind + " found in the list of attendees");
        }else{
            System.out.println("\n" + nameToFind + " not found in the list of attendees");
        }
    
        System.out.println("Here is the list of attendees:" + "\n" + eventAttendees);
    
        System.out.println("Invalid choice");

        
    } */

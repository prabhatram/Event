import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class Event {

    Scanner reader = new Scanner(System.in);
    public final static int capacity = 10_000;

    private String eventID;
    private String eventName;
    private LocalDate eventDate;
    private String eventVenue;
    ArrayList<String> eventAttendees;

    public Event(String id, String name, LocalDate date, String venue, ArrayList<String> attendees){
        eventID = id;
        eventName = name;
        eventDate = date;
        eventVenue = venue;
        eventAttendees = new ArrayList<>(attendees);
    }

    public void setEventID(String id){
        eventID = id;
    }

    public String getEventID(){
        return eventID;
    }

    public void setEventName(String name){
        eventName = name;
    }
    
    public String getEventName(){
        return eventName;
    }

    public void setEventDate(LocalDate date){
        eventDate = date;
    }
    
    public LocalDate getEventDate(){
        return eventDate;
    }

    public void setEventVenue(String venue){
        eventVenue = venue;
    }

    public String getEventVenue(){
        return eventVenue;
    }

    public void organizeEvent(int choice){

        switch(choice){
            case 1:
                System.out.println("Enter the Event ID : ");
                String id = reader.nextLine();
                setEventID(id);

                System.out.println("Enter the name of the Event: ");
                String name = reader.nextLine();
                setEventName(name);

                System.out.println("Enter the Event date (YYYY-MM-DD): ");
                LocalDate date = LocalDate.parse(reader.nextLine());
                setEventDate(date);

                System.out.println("Enter the date venue: ");
                String venue = reader.nextLine();   
                setEventVenue(venue);
            case 2:
                System.out.println("How many attendees are coming?: ");
                int num = reader.nextInt();
                reader.nextLine();   

                for(int i=0; i<num; i++){
                    System.out.println("Enter the name of the attendee: ");
                    String attendee = reader.nextLine();
                    eventAttendees.add(attendee);
                    System.out.println("\n" + attendee + " added successfully to the list of attendees");
                }
                break;
            case 3:
                System.out.println("Enter the name of the attendee to remove:");
                String nameToRemove = reader.nextLine();
                eventAttendees.remove(nameToRemove);
                System.out.println("\n" + nameToRemove + " removed successfully from the list of attendees");
                break;
            case 4:
                System.out.println("Enter the name of the attendee to update:");
                String nameToUpdate = reader.nextLine();
                System.out.println("Enter the position where you want to update:");
                int index = reader.nextInt();
                reader.nextLine();
                System.out.println("\n" + nameToUpdate + " updated successfully at the " + index + " position");
                break;
            case 5:
                System.out.println("Enter the name of the attendee to find:");
                String nameToFind = reader.nextLine();
                if(eventAttendees.contains(nameToFind)){
                    System.out.println("\n" + nameToFind + " found in the list of attendees");
                }else{
                    System.out.println("\n" + nameToFind + " not found in the list of attendees");
                }
                break;
            case 6: 
                System.out.println("Here is the list of attendees:" + "\n" + eventAttendees);
                break;     
            case 7: 
                break;
            default:
                System.out.println("Invalid choice");
        
        }
    }
}

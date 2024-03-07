import java.time.LocalDate;
import java.util.*;

public class Event {

    Scanner reader = new Scanner(System.in);
    //public final static capacity = 10_000;

    private String eventID;
    private String eventName;
    private LocalDate eventDate;
    private String eventVenue;
    ArrayList<String> eventAttendees;

    public Event(String id, String name, LocalDate date, String venue){
        eventID = id;
        eventName = name;
        eventDate = date;
        eventVenue = venue;
        eventAttendees = new ArrayList<>();

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
    
    public void addAttendee(String attendee){
        eventAttendees.add(attendee);
    }

    public void removeAttendee(String attendee){
        eventAttendees.remove(attendee);
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
    }

    public void handleAttendees(int num){
        for(int i=0; i<num; i++){
            System.out.println("Enter the name of the attendee: ");
            String name = reader.nextLine();
            //String attendee = reader.nextLine();
            eventAttendees.add(name);
    }
    reader.close();
}
}

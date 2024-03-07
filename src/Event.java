import java.time.LocalDate;
import java.util.*;

public class Event {

    Scanner reader = new Scanner(System.in);
    public final static int capacity = 10_000;

    private String eventID;
    private String eventName;
    private LocalDate eventDate;
    private String eventVenue;
    ArrayList<Attendee> eventAttendees = new ArrayList<>();

    public Event(){}

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
                String eventName = reader.nextLine();
                setEventName(eventName);

                System.out.println("Enter the Event date (YYYY-MM-DD): ");
                LocalDate date = LocalDate.parse(reader.nextLine());
                setEventDate(date);

                System.out.println("Enter the event's venue: ");
                String venue = reader.nextLine();   
                setEventVenue(venue);
            case 2:
                System.out.println("How many attendees are coming?: ");
                int num = reader.nextInt();
                reader.nextLine();   

                for(int i=0; i<num; i++){
                    System.out.println("Enter the name of the attendee: ");
                    String attendeeName = reader.nextLine();
                    System.out.println("Enter the gender of the attendee: ");
                    char attendeeGender = reader.nextLine().charAt(0);
                    System.out.println("Enter the email of the attendee: ");
                    String attendeeEmail = reader.nextLine();
                    System.out.println("Enter the age of the attendee: ");
                    int attendeeAge = reader.nextInt();
                    reader.nextLine();

                    //String attendeeDetail = "Attendee Name: " + attendeeName + "\n" + "Attendee Gender: " + attendeeGender + "\n" + "Attendee Email: " + attendeeEmail + "\n" + "Attendee Age: " + attendeeAge + "\n";

                    eventAttendees.add(new Attendee(attendeeName, attendeeGender, attendeeEmail, attendeeAge));
                    System.out.println("\n" + attendeeName + " added successfully to the list of attendees");
                }
                break;
            case 3:
                System.out.println("Enter the name of the attendee to remove:");
                String nameToRemove = reader.nextLine();
                eventAttendees.removeIf(attendee -> attendee.getName().equals(nameToRemove));
                System.out.println("\n" + nameToRemove + " removed successfully from the list of attendees");
                break;
            case 4:

                System.out.println("Enter the position of the attendee you want to update:");
                int position = reader.nextInt();
                reader.nextLine(); 

                if (position >= 0 && position < eventAttendees.size()) {
                    System.out.println("Enter the new name for the attendee:");
                    String newName = reader.nextLine();
                    
                    Attendee attendeeToUpdate = eventAttendees.get(position);
                    attendeeToUpdate.setName(newName);
                    
                    System.out.println("Attendee at position " + position + " updated successfully to " + newName);
                } else {
                    System.out.println("Invalid position. No update performed.");
                }
                break;
          /*       System.out.println("Enter the name of the attendee to update:");
                String nameToUpdate = reader.nextLine();
                System.out.println("Enter the position where you want to update:");
                int index = reader.nextInt();
                reader.nextLine();
                System.out.println("\n" + nameToUpdate + " updated successfully at the " + index + " position");
                break; */
            case 5:
                System.out.println("Enter the name of the attendee to find:");
                String nameToFind = reader.nextLine();
                boolean found = false;
                for(Attendee attendee : eventAttendees){
                    System.out.println(attendee);
                    if(attendee.getName().equals(nameToFind)){
                        System.out.println(attendee);
                        found = true;
                        break;
                    } 
                }
                if(found){

                    System.out.println("\n" + nameToFind + " found in the list of attendees");
                }
                else{
                    System.out.println("\n" + nameToFind + " not found in the list of attendees");
                    break;
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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        //Event event = new Event();
        EventCollection eventCollection = new EventCollection();

        int choice = 0;
        do{
            
            System.out.println("\n" + "Here's what you can do in the program" + "\n");
            System.out.println("Type 1 to enter event details:" + "\n");
            System.out.println("Type 2 to update an event's details:" + "\n");
            System.out.println("Type 3 to remove an event completely:" + "\n");
            System.out.println("Type 4 to find an event:" + "\n");
            System.out.println("Type 5 to display all events:" + "\n");
            /* System.out.println("Type 6 to enter attendee details:" + "\n");
            System.out.println("Type 3 to remove an attendee from the list:" + "\n");
            System.out.println("Type 4 to update an attendee in the list:" + "\n");
            System.out.println("Type 5 to search for an attendee in the list:" + "\n");
            System.out.println("Type 6 to display all the attendees from the event:" + "\n"); */
            choice = reader.nextInt();
            reader.nextLine();


            switch(choice){
                case 1:
                eventCollection.addEvent();
                
                System.out.println("Enter the number of attendees:");
                int num = reader.nextInt();
                reader.nextLine();
                for(int i = 0; i < num; i++){
                    /* System.out.println("Enter the name of the attendee:");
                    String name = reader.nextLine(); */
                    eventCollection.addAttendees(num);
                }
            
                break;

                case 2:
                eventCollection.updateEvent();
                break;

                case 3:
                eventCollection.removeEvent();
                break;

                case 4:
                eventCollection.findEvent();
                break;

                case 5:
                eventCollection.displayEvents();
                break;
                /* case 6:
                eventCollection.addAttendee();
                break;
       /*  case 3:
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
        /* case 4: 
            System.out.println("Here is the list of attendees:" + "\n");
            eventCollection.displayAttendees()
            break; */     
                case 7: 
                    break;
                default:
                    System.out.println("Invalid choice");
        
        }

            /* }
            
            eventCollection.organizeEvent(choice);
        } while(choice != 7); */
    
    }while(choice!=7);
    reader.close();
}
}
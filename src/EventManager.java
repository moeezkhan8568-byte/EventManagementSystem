import java.util.ArrayList;

public class EventManager {

    private static ArrayList<Event> events = new ArrayList<>();

    // Add Event
    public static void addEvent(Event event) {
        events.add(event);
    }

    // View Events
    public static ArrayList<Event> getEvents() {
        return events;
    }

    // Search Event
    public static Event searchEvent(int id) {

        for (Event event : events) {

            if (event.getId() == id) {
                return event;
            }
        }

        return null;
    }

    // Delete Event
    public static boolean deleteEvent(int id) {

        Event event = searchEvent(id);

        if (event != null) {
            events.remove(event);
            return true;
        }

        return false;
    }

    // Update Event
    public static boolean updateEvent(int id,
                                      String name,
                                      String date,
                                      String venue) {

        Event event = searchEvent(id);

        if (event != null) {

            event.setName(name);
            event.setDate(date);
            event.setVenue(venue);

            return true;
        }

        return false;
    }
}
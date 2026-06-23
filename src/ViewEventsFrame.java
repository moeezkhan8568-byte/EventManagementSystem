import javax.swing.*;
import java.util.ArrayList;

public class ViewEventsFrame extends JFrame {

    JTextArea area;

    public ViewEventsFrame() {

        setTitle("View Events");
        setSize(500,400);

        area = new JTextArea();
        add(new JScrollPane(area));

        ArrayList<Event> events = EventManager.getEvents();

        if(events.isEmpty()) {

            area.setText("No Events Available");

        } else {

            for(Event e : events) {

                area.append(e.toString() + "\n");
            }
        }

        setVisible(true);
    }
}
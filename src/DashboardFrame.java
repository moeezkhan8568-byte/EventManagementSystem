import javax.swing.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {

        setTitle("Event Management System");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("EVENT MANAGEMENT SYSTEM");
        title.setBounds(150, 30, 250, 30);
        add(title);

        JButton btnAdd = new JButton("Add Event");
        btnAdd.setBounds(150, 100, 180, 40);
        add(btnAdd);

        JButton btnView = new JButton("View Events");
        btnView.setBounds(150, 160, 180, 40);
        add(btnView);

        JButton btnSearch = new JButton("Search Event");
        btnSearch.setBounds(150, 220, 180, 40);
        add(btnSearch);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(150, 280, 180, 40);
        add(btnExit);

        // Button Actions

        btnAdd.addActionListener(e -> new AddEventFrame());

        btnView.addActionListener(e -> new ViewEventsFrame());

        btnSearch.addActionListener(e -> new SearchEventFrame());

        btnExit.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
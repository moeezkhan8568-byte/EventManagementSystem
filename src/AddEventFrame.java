import javax.swing.*;

public class AddEventFrame extends JFrame {

    JTextField txtId, txtName, txtDate, txtVenue;
    JButton btnSave;

    public AddEventFrame() {

        setTitle("Add Event");
        setSize(350,300);
        setLayout(null);

        JLabel lblId = new JLabel("Event ID");
        lblId.setBounds(20,20,100,25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(120,20,150,25);
        add(txtId);

        JLabel lblName = new JLabel("Event Name");
        lblName.setBounds(20,60,100,25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(120,60,150,25);
        add(txtName);

        JLabel lblDate = new JLabel("Date");
        lblDate.setBounds(20,100,100,25);
        add(lblDate);

        txtDate = new JTextField();
        txtDate.setBounds(120,100,150,25);
        add(txtDate);

        JLabel lblVenue = new JLabel("Venue");
        lblVenue.setBounds(20,140,100,25);
        add(lblVenue);

        txtVenue = new JTextField();
        txtVenue.setBounds(120,140,150,25);
        add(txtVenue);

        btnSave = new JButton("Save");
        btnSave.setBounds(120,190,100,30);
        add(btnSave);

        btnSave.addActionListener(e -> {

            try {

                int id = Integer.parseInt(txtId.getText());
                String name = txtName.getText();
                String date = txtDate.getText();
                String venue = txtVenue.getText();

                Event event = new Event(id,name,date,venue);

                EventManager.getEvents().add(event);

                JOptionPane.showMessageDialog(this,
                        "Event Added Successfully");

                dispose();

            } catch(Exception ex) {

                JOptionPane.showMessageDialog(this,
                        "Invalid Input");
            }
        });

        setVisible(true);
    }
}
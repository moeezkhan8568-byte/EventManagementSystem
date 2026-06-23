import javax.swing.*;

public class SearchEventFrame extends JFrame {

    JTextField txtId;
    JTextArea resultArea;
    JButton btnSearch;

    public SearchEventFrame() {

        setTitle("Search Event");
        setSize(400,300);
        setLayout(null);

        JLabel lbl = new JLabel("Enter Event ID");
        lbl.setBounds(20,20,100,25);
        add(lbl);

        txtId = new JTextField();
        txtId.setBounds(130,20,120,25);
        add(txtId);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(270,20,90,25);
        add(btnSearch);

        resultArea = new JTextArea();
        resultArea.setBounds(20,70,340,150);
        add(resultArea);

        btnSearch.addActionListener(e -> {

            try {

                int id = Integer.parseInt(txtId.getText());

                boolean found = false;

                for(Event event : EventManager.getEvents()) {

                    if(event.getId() == id) {

                        resultArea.setText(event.toString());
                        found = true;
                        break;
                    }
                }

                if(!found) {

                    resultArea.setText("Event Not Found");
                }

            } catch(Exception ex) {

                JOptionPane.showMessageDialog(this,
                        "Enter Valid ID");
            }
        });

        setVisible(true);
    }
}
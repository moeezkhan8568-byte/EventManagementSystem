import java.util.ArrayList;

public class ParticipantManager {

    private ArrayList<Participant> participants;

    public ParticipantManager() {
        participants = new ArrayList<>();
    }

    // Add Participant
    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    // View Participants
    public void viewParticipants() {

        if (participants.isEmpty()) {
            System.out.println("No Participants Found.");
            return;
        }

        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }

    // Search Participant
    public Participant searchParticipant(int id) {

        for (Participant participant : participants) {

            if (participant.getParticipantId() == id) {
                return participant;
            }
        }

        return null;
    }

    // Delete Participant
    public void deleteParticipant(int id) {

        Participant participant = searchParticipant(id);

        if (participant != null) {
            participants.remove(participant);
            System.out.println("Participant Deleted Successfully.");
        } else {
            System.out.println("Participant Not Found.");
        }
    }

    // Update Participant
    public void updateParticipant(int id,
                                  String name,
                                  String email,
                                  String phone) {

        Participant participant = searchParticipant(id);

        if (participant != null) {

            participant.setName(name);
            participant.setEmail(email);
            participant.setPhone(phone);

            System.out.println("Participant Updated Successfully.");

        } else {

            System.out.println("Participant Not Found.");
        }
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }
}
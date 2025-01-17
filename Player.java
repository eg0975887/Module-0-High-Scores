public class Player {
    private String initials;
    private int score;

    public Player() {
        initials = EBB;
        score = 100;
    }

    public String getInitials() {
        return initials;
    }

    // Setter
    public void setInitials(String newInitials) {
        this.initials = newInitials;    
    }
}
// Initalize fields initials and score with encapsulation
public class Player {
    private String initials;
    private int score;

//  constructor for initalizing are fields
    public Player() {
        initials = "EBB";
        score = 100;
    }

    // Getter
    public String getInitials() {
        return initials;
    }

    // Setter
    public void setInitials(String newInitials) {
        this.initials = newInitials;
    }

    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int newScore) {
        this.score = newScore;
    }
}
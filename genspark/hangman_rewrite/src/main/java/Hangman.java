public class Hangman {
    private int tries = 3;
    private String missedLetters = "";
    private String correctLetters = "";

    //    default constructor
    public Hangman() {

    }

    // parameterized constructor
    public Hangman(int tries, String missedLetters, String correctLetters) {
        this.tries = tries;
        this.missedLetters = missedLetters;
        this.correctLetters = correctLetters;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public String getMissedLetters() {
        return missedLetters;
    }

    public void setMissedLetters(String missedLetters) {
        this.missedLetters = missedLetters;
    }

    public String getCorrectLetters() {
        return correctLetters;
    }

    public void setCorrectLetters(String correctLetters) {
        this.correctLetters = correctLetters;
    }
}

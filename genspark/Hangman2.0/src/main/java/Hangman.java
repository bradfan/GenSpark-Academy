public class Hangman {
    private int tries = 3;
    private int high = 0;
    private String name;
    private String missedLetters = "";
    private String correctLetters = "";
    private char again = 'y';
    private boolean win;

    public Hangman() {

    }

    public Hangman(int tries, int high, String missedLetters, String name, String correctLetters, char again, boolean win) {
        this.tries = tries;
        this.high = high;
        this.missedLetters = missedLetters;
        this.correctLetters = correctLetters;
        this.again = again;
        this.win = win;
        this.name = name;
    }


    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public char getAgain() {
        return again;
    }

    public void setAgain(char again) {
        this.again = again;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}

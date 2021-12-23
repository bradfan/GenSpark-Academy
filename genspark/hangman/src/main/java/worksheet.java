import java.util.ArrayList;

public class worksheet {

    public static String RetrieveDisplay(int tries) {
        String result = "";
        String oneDisplay = """
                        +---+
                            |
                            |
                            |
                           === """;
        String twoDisplay = """
                        +---+
                          O |
                            |
                            |
                           === """;
        String threeDisplay = """
                        +---+
                          O |
                          | |
                            |
                           === """;
        String fourDisplay = """
                        +---+
                          O |
                          | |
                          ^ |
                           === """;

        switch(tries) {
            case 1:
                result = threeDisplay;
                System.out.println(threeDisplay);
                break;
            case 2:
                result = twoDisplay;
                System.out.println(twoDisplay);
                break;
            case 3:
                result = oneDisplay;
                System.out.println(oneDisplay);
                break;
        }
        return result;
    }

//     public static String RetrieveMissed (){
//
//    }

    public static void main(String[] args) {
        String[] words = new String[] {"cat", "dog", "bat", "mice", "bird"};
        String randomWord = words[(int) (Math.random() * words.length)];
        System.out.println("Just for dev: " + randomWord);
        char[] letters = new char[randomWord.length()];
        ArrayList<Character> missedLetter = new ArrayList<>();
        boolean isGameOver = true;
        //        set up for do you want to play again
        char again = 'y';
        int tries = 3;
        RetrieveDisplay(tries);
    }
}

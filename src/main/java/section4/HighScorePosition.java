package section4;

public class HighScorePosition {





    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Player " + name + " is now " + position + " on the high score table");
    }

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Marcin", highScorePosition);
        int highScorePosition2 = calculateHighScorePosition(900);
        displayHighScorePosition("WOjte", highScorePosition2);
        int highScorePosition3 = calculateHighScorePosition(200);
        displayHighScorePosition("Kuba", highScorePosition3);
        int highScorePosition4 = calculateHighScorePosition(1020);
        displayHighScorePosition("Jan", highScorePosition4);

    }

}

import static javax.swing.UIManager.getString;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int play1Score, int play2Score) {
        int tempScore;
        if (play1Score == play2Score) {
            return  getString1(play1Score);
        } else if (play1Score >= 4 || play2Score >= 4) {
            int minusResult = play1Score - play2Score;
            if (minusResult == 1) return  "Advantage player1";
            else if (minusResult == -1) return  "Advantage player2";
            else if (minusResult >= 2) return  "Win for player1";
            else return  "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = play1Score;
                else {
                    tempScore = getTempScore(play2Score);
                }
                switch (tempScore) {
                    case 0:
                        return  "Love";
                    case 1:
                        return  "Fifteen";
                    case 2:
                        return  "Thirty";
                    case 3:
                        return  "Forty";
                }
            }
        }
        return getString1(play1Score);
    }

    private static int getTempScore(int play2Score) {
        int tempScore;
        tempScore = play2Score;
        return tempScore;
    }

    private static String getString1(int play1Score) {
        return getString(play1Score);
    }



    private static String getScore(int m_score1) {
        String score;
        switch (m_score1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
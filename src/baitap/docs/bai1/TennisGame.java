package baitap.docs.bai1;

public class TennisGame
{
    final static String ADVANTAGE_PLAYER_1 = "Advantage player1";
    final static String ADVANTAGE_PLAYER_2 = "Advantage player2";
    final static String WIN_FOR_PLAYER1 = "Win for player1";
    final static String WIN_FOR_PLAYER2 = "Win for player2";
    final static int SCORE_1_POINT = 1;
    final static int SCORE_2_POINT = 2;
    public static final String LOVE = "Love-";
    public static final String ALL = "All";
    public static final String FIFTEEN = "Fifteen-";
    public static final String THIRTY = "Thirty-";
    public static final String FORTY = "Forty-";
    public static final String DEUCE = "Deuce";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score)
    {
        String scoreMessage = "";//Dùng Shift F6 đổi tên score thành scoreMessage để tên dễ hiểu hơn
        int tempScore = 0;
        int winningScore = 4;
        if (player1Score == player2Score)
        {
            switch (player1Score)
            {
                case 0:
                    scoreMessage = LOVE + ALL;
                    break;
                case 1:
                    scoreMessage = FIFTEEN + ALL;
                    break;
                case 2:
                    scoreMessage = THIRTY + ALL;
                    break;
                case 3:
                    scoreMessage = FORTY + ALL;
                    break;
                default:
                    scoreMessage = DEUCE;
                    break;
            }
        } else if (player1Score >= winningScore || player2Score >= winningScore)//4 là magic number
        {                                                                   // => Đổi thành tên biến cho dễ hiểu
            scoreMessage = getWinner(player1Score, player2Score);
        } else
        {
            scoreMessage = getCurrentScore(player1Score, player2Score, scoreMessage);
        }
        return scoreMessage;
    }

    private static String getCurrentScore(int player1Score, int player2Score, String score)
    {
        int tempScore;
        int maxScoreBeforeWin = 3;
        for (int i = 1; i < maxScoreBeforeWin; i++)//3 là magic number
        {                                   // => Đổi thành tên biến cho dễ hiểu
            if (i == 1) tempScore = player1Score;
            else
            {
                score += "-";
                tempScore = player2Score;
            }
            switch (tempScore)
            {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }

    private static String getWinner(int player1Score, int player2Score)
    {
        String scoreMessage;
        int minusResult = player1Score - player2Score;
        if (minusResult == SCORE_1_POINT) scoreMessage = ADVANTAGE_PLAYER_1;
        else if (minusResult == -SCORE_1_POINT) scoreMessage = ADVANTAGE_PLAYER_2;
        else if (minusResult >= SCORE_2_POINT) scoreMessage = WIN_FOR_PLAYER1;
        else scoreMessage = WIN_FOR_PLAYER2;
        return scoreMessage;
    }
}
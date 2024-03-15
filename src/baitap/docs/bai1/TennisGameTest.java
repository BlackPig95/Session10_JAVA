package baitap.docs.bai1;

import java.util.Arrays;
import java.util.Collection;

public class TennisGameTest
{
    final static int NUM0 = 0;
    final static int NUM1 = 1;
    final static int NUM2 = 2;
    final static int NUM3 = 3;
    final static int NUM4 = 4;
    final static int NUM5 = 5;
    final static int NUM6 = 6;
    final static int NUM14 = 14;
    final static int NUM15 = 15;
    final static int NUM16 = 16;
    final static String WIN_FOR_PLAYER1 = "Win for player1";
    final static String WIN_FOR_PLAYER2 = "Win for player2";
    final static String ADVANTAGE_PLAYER_1 = "Advantage player1";
    final static String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String PLAYER_1_NAME = "John";
    public static final String PLAYER_2_NAME = "Bill";
    public static final String LOVE = "Love-";
    public static final String ALL = "All";
    public static final String FIFTEEN = "Fifteen-";
    public static final String THIRTY = "Thirty-";
    public static final String FORTY = "Forty-";
    public static final String DEUCE = "Deuce";

    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public TennisGameTest(int player1Score, int player2Score, String expectedScore)
    {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    public static Collection<Object[]> getAllScores()
    {
        return Arrays.asList(new Object[][]{
                {NUM0, NUM0, LOVE + ALL},
                {NUM1, NUM1, FIFTEEN + ALL},
                {NUM2, NUM2, THIRTY + ALL},
                {NUM3, NUM3, FORTY + ALL},
                {NUM4, NUM4, DEUCE},

                {NUM1, NUM0, FIFTEEN + LOVE},
                {NUM0, NUM1, LOVE + FIFTEEN},
                {NUM2, NUM0, THIRTY + LOVE},
                {NUM0, NUM2, LOVE + THIRTY},
                {NUM3, NUM0, FORTY + LOVE},
                {NUM0, NUM3, LOVE + FORTY},
                {NUM4, NUM0, WIN_FOR_PLAYER1},
                {NUM0, NUM4, WIN_FOR_PLAYER2},

                {NUM2, NUM1, THIRTY + FIFTEEN},
                {NUM1, NUM2, FIFTEEN + THIRTY},
                {NUM3, NUM1, FORTY + FIFTEEN},
                {NUM1, NUM3, FIFTEEN + FORTY},
                {NUM4, NUM1, WIN_FOR_PLAYER1},
                {NUM1, NUM4, WIN_FOR_PLAYER2},

                {NUM3, NUM2, FORTY + THIRTY},
                {NUM2, NUM3, THIRTY + FORTY},
                {NUM4, NUM2, WIN_FOR_PLAYER1},
                {NUM2, NUM4, WIN_FOR_PLAYER2},

                {NUM4, NUM3, ADVANTAGE_PLAYER_1},
                {NUM3, NUM4, ADVANTAGE_PLAYER_2},
                {NUM5, NUM4, ADVANTAGE_PLAYER_1},
                {NUM4, NUM5, ADVANTAGE_PLAYER_2},
                {NUM15, NUM14, ADVANTAGE_PLAYER_1},
                {NUM14, NUM15, ADVANTAGE_PLAYER_2},

                {NUM6, NUM4, WIN_FOR_PLAYER1},
                {NUM4, NUM6, WIN_FOR_PLAYER2},
                {NUM16, NUM14, WIN_FOR_PLAYER1},
                {NUM14, NUM16, WIN_FOR_PLAYER2},
        });
    }

    public void checkAllScores()
    {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        int player1Score = NUM0;
        int player2Score = NUM0;
        for (int i = 0; i < highestScore; i++)
        {
            if (i < this.player1Score)
                player1Score += NUM1;
            if (i < this.player2Score)
                player2Score += NUM1;
        }
    }
}
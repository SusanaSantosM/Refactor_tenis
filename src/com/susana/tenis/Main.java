package com.susana.tenis;

public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int score1, int score2) {
        String typeScore = "";
        int tempScore=0;

        if (score1 == score2) {
            switch (score1)
            {
                case 0:
                    typeScore = "Love-All";
                    break;
                case 1:
                    typeScore = "Fifteen-All";
                    break;
                case 2:
                    typeScore = "Thirty-All";
                    break;
                case 3:
                    typeScore = "Forty-All";
                    break;
                default:
                    typeScore = "Deuce";
                    break;

            }
        }
        else if (score1 >=4 || score2 >=4)
        {
            int minusResult = score1-score2;
            if (minusResult==1) typeScore ="Advantage player1";
            else if (minusResult ==-1) typeScore ="Advantage player2";
            else if (minusResult>=2) typeScore = "Win for player1";
            else typeScore ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = score1;
                else { typeScore+="-"; tempScore = score2;}
                switch(tempScore)
                {
                    case 0:
                        typeScore+="Love";
                        break;
                    case 1:
                        typeScore+="Fifteen";
                        break;
                    case 2:
                        typeScore+="Thirty";
                        break;
                    case 3:
                        typeScore+="Forty";
                        break;
                }
            }

        }
    return typeScore;
    }
}
package com.susana.tenis;

public class Main {
    /**
     * método para devolver la puntuacion de tenis
     */
    public static String getScore(int scorePlayer1, int scorePlayer2) {
        /**
         * score1 puntuación del primer jugador
         * score2 puntuación del segundo jugador
         * typeScore tipo de puntución del set
         */
        String typeScore = "";
        int auxiliarScore=0;

        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1)
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
        else if (scorePlayer1 >=4 || scorePlayer2 >=4)
        /**
         * auxiliarScore variable auxiliar
         * diferentPoint diferentcia de puntos entre jugadores
         **/
        {
            int diferentPoint = scorePlayer1-scorePlayer2;
            if (diferentPoint==1) typeScore ="Advantage player1";
            else if (diferentPoint ==-1) typeScore ="Advantage player2";
            else if (diferentPoint>=2) typeScore = "Win for player1";
            else typeScore ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) auxiliarScore = scorePlayer1;
                else { typeScore+="-"; auxiliarScore = scorePlayer2;}
                switch(auxiliarScore)
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
public class TennisGame2
{
    private int player1Point;
    private int player2Point;


    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    public String point(int point){
        switch (point) {
            case 0 :
                return "Love";
            case 1 :
                return "Fifteen";
            case 2 :
                return "Thirty";
            case 3 :
                return "Forty";

        }
        return null;
    }


    public String getScore(){
        String player1Result = point(player1Point);
        String player2Result = point(player2Point);
        String score = "";
        if (player1Point == player2Point && player1Point < 4)
        {
            score = point(player1Point);
            score += "-All";
        }
        if (player1Point == player2Point && player1Point >=3)
            score = "Deuce";

        if (player1Point > 0 && player2Point ==0)
        {
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > 0 && player1Point ==0)
        {

            score = player1Result + "-" + player2Result;
        }

        if (player1Point > player2Point && player1Point < 4)
        {

            score = player1Result + "-" + player2Result;
        }
        if (player2Point > player1Point && player2Point < 4)
        {
            score = player1Result + "-" + player2Result;
        }

        if (player1Point > player2Point && player2Point >= 3)
        {
            score = "Advantage player1";
        }

        if (player2Point > player1Point && player1Point >= 3)
        {
            score = "Advantage player2";
        }

        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            score = "Win for player1";
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }



    public void player1Score(){
        player1Point++;
    }

    public void player2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))
            player1Score();
        else
            player2Score();
    }
}
import java.util.*;


public class RPSGame {
    public static void main(String[] args)
    {


        //Asking They Want to Play Again (Pt.1)//
        boolean done;

        do {


            //Scanners//
            Scanner UserInput = new Scanner(System.in);

            String Player1 = " ";
            String Player2 = " ";

            //Game Elements//
            String R;
            String P;
            String S;

            String Name;

            //Rule//
            String Tie;

            //Asking PLayers Name //
            Player1 = SafeInput.getNonZeroLenString(UserInput, "Player 1, Enter Your Name");
            Player2 = SafeInput.getNonZeroLenString(UserInput, "Player 2, Enter Your Name");

            //Storing Player Name SO it Displays their Name instead of Player 1 or 2//

            Name = Player1;
            Name = Player2;


            //Asking Players Move For The Game//
            String Player1Move = SafeInput.getRegExString(UserInput, Player1 + " Enter Your Move (R, P, S)", "R|P|S");
            String Player2Move = SafeInput.getRegExString(UserInput, Player2 + " Enter Your Move (R, P, S)", "R|P|S");


            if (Player1Move.equalsIgnoreCase("R") & Player2Move.equalsIgnoreCase("S")) {
                System.out.println(Player1 + ":" + "You Win");
            }
            if (Player1Move.equalsIgnoreCase("R") & Player2Move.equalsIgnoreCase("P")) {
                System.out.println(Player2 + ":" + "You Win");
            }
            if (Player1Move.equalsIgnoreCase("P") & Player2Move.equalsIgnoreCase("S")) {
                System.out.println(Player2Move + ":" + "You Win");
            }
            if (Player1Move.equalsIgnoreCase("R") & Player2Move.equalsIgnoreCase("R")) {
                System.out.println("Tie");
            }
            if (Player1Move.equalsIgnoreCase("P") & Player2Move.equalsIgnoreCase("P")) {
                System.out.println("Tie");
            }
            if (Player1Move.equalsIgnoreCase("S") & Player2Move.equalsIgnoreCase("S")) {
                System.out.println("Tie");
            }

            //Asking They Want to Play Again (Pt.2)//

        done = SafeInput.getYNConfirm(UserInput, "Are you done? ");
    } while(!done);





    }
}

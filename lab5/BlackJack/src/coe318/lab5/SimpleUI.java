package coe318.lab5;
/**
 *
 * @author Artheeckkumarran Shanmugalingam
 */
import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame playGame;
    private Scanner text = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        playGame = game;
    }

  @Override
    public void display() {
     System.out.println("House Holds: \n===========" + playGame.getHouseCards().toString()); 
        System.out.println("You Hold: \n=========" + playGame.getYourCards().toString()); 
    }

  @Override
    public boolean hitMe() {
        System.out.println("Would you like a hit?\nType 'y' for yes and 'n' for no");
        String choice = text.nextLine();
        boolean pick = false;
        
        switch(choice){
            case "y":
                pick = true;
                break;
            case "n":
                pick = false;
                break;
            default:
                System.out.println("You have to type either 'y' or 'n' to continue.");
                hitMe();
        }
        return(pick);
    }

  @Override
    public void gameOver() {
        this.display();
        int yourScore = playGame.score(playGame.getYourCards());
        int houseScore = playGame.score(playGame.getHouseCards());
        System.out.println("House Score: " + houseScore + ", Your Score: " + yourScore);
        if( (yourScore > houseScore || houseScore > 21) && (yourScore <= 21)){
            System.out.println("You Won!");
        }else{
            System.out.println("House Won!");
        }
       System.out.println("Thank you for playing!");
    }

}
import java.util.Scanner;
import java.util.Random; //random library
public class RockPaperScissor {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in); //declaration
        Random rd = new Random(); // random instance declaration
        System.out.println("Enter Number of Matches > :");
        int n = sc.nextInt(); // for number of matches
        while (i<=n){
            int ai = rd.nextInt(3)+1; // random number generated
            System.out.println("Enter Your Choice > :");
            System.out.println("1) for STONE \n 2) for PAPER \n 3) for SCISSOR");
            int ch = sc.nextInt();
            if (ch==ai){ // draw condition
                System.out.println("Tie, System choice was " +ai);
            }else if ((ch == 1 && ai == 2) || (ch == 2 && ai == 3) || (ch == 3 && ai ==1)){ //every possible conditions for user to lose
                System.out.println("AI WON \t [user -> "+ch+ "| AI -> " +ai+ "]");
            }else {
                System.out.println("U WON \t [user -> "+ch+ "| AI -> " +ai+ "]");
            }
            i++;
        }
    }
}

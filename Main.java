import java.util.Scanner;
/**
 * This program determines if a number that the user inputs is odd or even
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user
    Scanner input = new Scanner(System.in);

    // ask user for an integer
    System.out.println("Please enter an integer:");
   
    int number = input.nextInt();

    // detemine
    if(number % 2 == 0){
      System.out.println(number + " is an even number");
    } else {
      System.out.println(number + " is an odd number");
    }
    
  }
}

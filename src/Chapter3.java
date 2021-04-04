import java.util.Scanner;

public class Chapter3 {
    // Declare the Chapter 3 milestone 1 method here
    Scanner scanner = new Scanner(System.in);
    public void milestone1(int num3_1a, int num3_1b)
    {
        int small = Math.min(num3_1a, num3_1b);
        int big = Math.max(num3_1a, num3_1b);
        
        System.out.print("Your numbers were " + num3_1a + " and " + num3_1b); 
        System.out.print(" and the even numbers between them are ");
        System.out.println();

        for(int i = small; i <= big; i++)
        {
            if(i % 2 == 0 && i != small && i != big)
            {
                System.out.println(i + " ");
            }
        }
    } 
    // Declare the Chapter 3 milestone 2 method here
    public void milestone2(Scanner scanner){
        //DON'T CLOSE THE SCANNER, it's still being used in another file.
           double sum = 0;
           int count = 0;
           int myInput = 0;
                    
            do{
                System.out.println("Input a number for milestone 2.");
                myInput = scanner.nextInt();
    
                if(myInput >= 0){
                    sum += myInput;
                    count++;
                }
    
            } while(myInput > -1);

            double avg = (sum / count);
            System.out.println("Your average is " + avg);
            // look into bigdecimal
    }

    public void milestone3(int randomNumber1, int randomNumber2, int userGuess) {    
        int product = randomNumber1 * randomNumber2;
        //userGuess = scanner.nextInt();

        for(int i = 2; i >= 0; i--)
        {
            if(userGuess == product)
            {
                System.out.println("Correct!");
                break;
            } 
            else
            {
                System.out.println("Incorrect.");
                System.out.println("You have " + i + " guesses remaining.");
            }

            if(i == 0)
            {
                System.out.println("You have guessed too many times! \n The correct answer was " + product + ".");
                break;
            }
            System.out.print("What is the product of these two numbers?");
            userGuess = scanner.nextInt();
        }
        
        /*if (randomNumber1 * randomNumber1 == product)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (randomNumber1 * randomNumber2));*/
    }

}
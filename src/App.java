import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


class Chapter2 {// in the same file, public is not required
    Scanner scanner = new Scanner(System.in);

    void milestone1(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    // Declare the Chapter 2 milestone 2 method here
    public void milestone2(double myDoubleM2){
        int myIntM2 = (int)myDoubleM2;
        double myDecimalM2 = (myDoubleM2 - myIntM2) * 100;
        int myRemainderM2 = (int)myDecimalM2;

        System.out.println("Your input: " + myDoubleM2 + "\nIts Integer: "
        + myIntM2 + "\nIts Remains: " + myRemainderM2);
    }

    // Declare the Chapter 2 milestone 3 method here, add public to give access
    public void milestone3(){ // needs corrected
        /*
            milestone 3: Write a program that finds all of the prime numbers between 2 and 100. 
            You must use a nested for loop and the % operator to get credit. (10 pts)
        */
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int x = 2; x <= Math.sqrt(i); x++)
            {
                if(i % x == 0)
                {
                    isPrime = false;
                    break;
                }// end if statement
            }// end of inner while loop
            System.out.println("Is " + i + " prime? " + isPrime);
        }// end of outter for loop
    } // end Chapter 2 milestone 3

    // Declare the Chapter 2 milestone 4 method here
    public void milestone4(int myInput){
        System.out.println("\nFor milestone 4, input the number of seconds you would like calculated.");
        int mySeconds = myInput % 60;
        int myMinutes = (myInput/60) % 60;
        int myHours = (myInput % 86400 ) / 3600;
        int myDays = myInput / 86400;

        System.out.println(     
        "Days " + myDays +
        "\nHours " + myHours +
        "\nMinutes " + myMinutes +
        "\nSeconds " + mySeconds);
    }// end Chapter 2 milestone 4

}

public class App {
    static void chapter1milestone1(double num1, double num2) {
        System.out.print("Largest is: ");
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
    
    // Declare the Chapter 1 milestone 2 method here
    static void chapter1milestone2(double milestone2A, double milestone2B) {
        System.out
            .println("The average of the two inputted values is " 
                + ((milestone2A + milestone2B) / 2));
        System.out.println();
    }
    // Declare the Chapter 1 milestone 3 method here
    static void chapter1milestone3(double milestone3A){
        double pi = 3.14;
        
        double diameter = milestone3A * 2;
        double theAreaOfCircle = ((milestone3A * milestone3A) * pi);

        System.out.println("The circle with a radius of " + milestone3A + " has a circumference of " 
            + String.format("%.2f", diameter * pi) + " and an area of "
            + String.format("%.2f", theAreaOfCircle) + ".");
        }




    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** CHAPTER 1 milestone 1 **");
        System.out.println("Please enter two numbers:");
        double num1_1a = scanner.nextDouble();
        double num1_1b = scanner.nextDouble();
        // Call the Chapter 1 milestone 1 method here
        chapter1milestone1(num1_1a, num1_1b);

        System.out.println("\n** CHAPTER 1 milestone 2 **");
        System.out.println("Please enter two numbers:");
        double num1_2a = scanner.nextDouble();
        double num1_2b = scanner.nextDouble();
        // Call the Chapter 1 milestone 2 method here
        chapter1milestone2(num1_2a, num1_2b);

        System.out.println("\n** CHAPTER 1 milestone 3 **");
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        // Call the Chapter 1 milestone 3 method here, method code will print the circumference and area
        chapter1milestone3(radius);

        System.out.println("\n** CHAPTER 2 milestone 1 **");
        System.out.println("Enter a Number:");
        int num2_1 = scanner.nextInt();
        // Call the Chapter 2 milestone 1 method here
        Chapter2 chapter2 = new Chapter2();
        chapter2.milestone1(num2_1);

        System.out.println("\n** CHAPTER 2 milestone 2 **");
        System.out.println("Please input a decimal number:");
        double num2_2 = scanner.nextDouble();
        // Call the Chapter 2 milestone 2 method here
        chapter2.milestone2(num2_2);

        System.out.println("\n** CHAPTER 2 milestone 3 **");
        // Call the Chapter 2 milestone 3 method here, call the method ch2Mstone3()
        chapter2.milestone3();

        System.out.println("\n** CHAPTER 2 milestone 4 **");
        System.out.println("Enter a number for seconds:");
        int seconds = scanner.nextInt();
        // Call the Chapter 2 milestone 4 method here
        chapter2.milestone4(seconds);

        System.out.println("\n** CHAPTER 3 milestone 1 **");
        System.out.println("Enter two numbers:");
        int num3_1a = scanner.nextInt();
        int num3_1b = scanner.nextInt();
        // Call the Chapter 3 milestone 3 method here
        Chapter3 chapter3 = new Chapter3();
        // Call the Chapter 3 milestone 1 method here
        chapter3.milestone1(num3_1a, num3_1b);


        System.out.println("\n** CHAPTER 3 milestone 2 **");
        chapter3.milestone2(scanner); 
        // Call the Chapter 3 milestone 2 method here, don't pass info to it. 
        //The method has all code
        
        System.out.println("\n** CHAPTER 3 milestone 3 **");
        int min = 1;
        int max = 12;

        int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randNum1);
        System.out.println(randNum2);
        System.out.println("What is the product of these two numbers?");
        int num3_3 = scanner.nextInt();
        // Call the Chapter 3 Milestone 3 method here
        chapter3.milestone3(randNum1, randNum2, num3_3);

        scanner.close();
    }
}

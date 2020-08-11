// Selina Narain February 11 2020

import java.util.Scanner;
import java.util.Random;

public class MathTutor
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();
        Random randomOperator = new Random();

        int num1;
        int num2;
        int answer;
        int operator;
        int correctAnswer;
        String choice;
        int i;
        
        do {
            num1 = randomNumbers.nextInt(41) - 20;
            num2 = randomNumbers.nextInt(41) - 20;
            operator = randomOperator.nextInt(2);
            if  (operator == 0)      // add 
            {
                correctAnswer = num1 + num2;
                System.out.print(num1 + " + " + num2 + " = ");
                answer = keyboard.nextInt();
                if (answer == correctAnswer)
                {
                    System.out.println("Correct!");  
                } 
                else if (answer != correctAnswer)
                {
                    for(i=0; i<=2; i++)
                    {
                        if (answer == correctAnswer)
                        {
                            System.out.println("Correct!");
                            break;
                        }
                        else if (i<2)
                        {
                            System.out.print("Incorrect. Please Re-enter: ");
                            answer = keyboard.nextInt();
                        }
                        else if (i==2)
                        {
                            System.out.println("Incorrect. The correct answer is: " + correctAnswer);
                        }
                    }
                }
            }
            if  (operator == 1)     // subtract 
            {
                correctAnswer = num1 - num2;
                System.out.print(num1 + " - " + num2 + " = ");
                answer = keyboard.nextInt();
                if (answer == correctAnswer)
                {
                    System.out.println("Correct!");  
                } 
                else if (answer != correctAnswer)
                {
                    for(i=0; i<=2; i++)
                    {
                        if (answer == correctAnswer)
                        {
                            System.out.println("Correct!");
                            break;
                        }
                        else if (i<2)
                        {
                            System.out.print("Incorrect. Please Re-enter: ");
                            answer = keyboard.nextInt();
                        }
                        else if (i==2)
                        {
                            System.out.println("Incorrect. The correct answer is: " + correctAnswer);
                        }
                    }
                }
            }

            System.out.print("Would you like another problem y/n? ");
            choice = keyboard.next();

            while(!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"))
            {
                System.out.println("Don't understand " + choice);
                System.out.print("Would you like another problem y/n? ");
                choice = keyboard.next();
            }
            if(choice.equalsIgnoreCase("n"))
            {
                break;
            }
        }
        while (choice.equalsIgnoreCase("y"));
    }
}

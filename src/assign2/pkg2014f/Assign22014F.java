/* The following exercises are adapted from:
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through 
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education.
 * ISBN: 978-0-13-285583-9
 */
package assign2.pkg2014f;

import java.util.Scanner;

/**
 * @author <ENTER YOUR NAME HERE>
 */
public class Assign22014F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* =============================== *
         * DO NOT CHANGE THIS METHOD       *
         * Make changes in the sub-methods *
         * named for each exercise.        *
         * =============================== */
        int choice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Which exercise would you like to run? [4,9,10,12,16] (0 to Exit)");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Okay, goodbye!");
                    break;
                case 4:
                    doExercise4();
                    break;
                case 9:
                    doExercise9();
                    break;
                case 10:
                    doExercise10();
                    break;
                case 12:
                    doExercise12();
                    break;
                case 16:
                    doExercise16();
                    break;
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
        } while (choice != 0);
    }

    /* Exercise #4
     * Write a program that displays the following pattern:
     *     *
     *    ***
     *   *****
     *  *******
     *   *****
     *    ***
     *     *
     *
     * - Gaddis pg. 106
     */
    public static void doExercise4() {
        // TODO: Complete Exercise #4 Below
        int i, j, s;
        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("*******");
        System.out.println("*****");
        System.out.println("***");
        System.out.println("*");
        
        

    }

    /* Exercise #9
     * A car's miles-per-gallon (MPG) can be calculated 
     * with the following formula:
     *   MPG = Miles Driven / Gallons of Gas Used
     * Write a program that asks the user for the number 
     * of miles driven and the gallons of gas used. It 
     * should calculate the car's miles-per-gallon and 
     * display the result on the screen.
     *
     * - Gaddis pg. 106-7
     */
    public static void doExercise9() {
        double milesDriven = 0.0, gallonOfGas = 0.0, milesPerGallon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter miles driven :");
        milesDriven = sc.nextDouble();
        System.out.println("Enter gallons of gas used :");
        gallonOfGas = sc.nextDouble();
        milesPerGallon = milesDriven / gallonOfGas;
        System.out.println("Miles per Gallon is :" + milesPerGallon);

    }

    /* Exercise #10
     * Write a program that asks the user to enter three 
     * test scores. The program should display each test 
     * score, as well as the average of the scores.
     *
     * - Gaddis pg. 107
     */
    public static void doExercise10() {
        // TODO: Complete Exercise #10 Below
        int testScore1, testScore2, testScore3;
        float avgScore;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test1 :");
         testScore1 = sc.nextInt();
        System.out.println("Enter test2 :");
        testScore2 = sc.nextInt();
        System.out.println("Enter test3 :");
         testScore3 = sc.nextInt();
        System.out.println("Test1: "+testScore1+"Test2: "+testScore2+"Test3: "+testScore3);
        avgScore = (float)(testScore1 + testScore2 + testScore3) / 3;
        System.out.println("Average Score is :" + avgScore);

    }

    /* Exercise #12
     * Write a program that asks the user to enter the name 
     * of his or her favourite city. Use a String variable 
     * to store the input. The program should display the 
     * following:
     * - The number of characters in the city name
     * - The name of the city in all uppercase letters
     * - The name of the city in all lowercase letters
     * - The first character in the name of the city
     *
     * - Gaddis pg. 107
     */
    public static void doExercise12() {
        // TODO: Complete Exercise #12 Below
        Scanner sc = new Scanner(System.in);
        String strCity = new String();
        System.out.println("enter the name of his or her favourite city");
        strCity = sc.nextLine();
        //System.out.println("Your City is: " + strCity);
        int strCount = strCity.length();
        System.out.println("The number of characters in the city name " + strCount);
        String strUpper = strCity.toUpperCase();
        System.out.println("The name of the city in all uppercase letters " + strUpper);
        String strLower = strCity.toLowerCase();
        System.out.println("The name of the city in all lowercase letters " + strLower);
        char firstCharCity = strCity.charAt(0);
        System.out.println("The first character in the name of the city " + firstCharCity);

    }

    /* Exercise #16
     * Write a program that plays a word game with the 
     * user. The program should ask the user to enter 
     * the following:
     * - His or her name
     * - His or her age
     * - The name of a city
     * - The name of a college
     * - A profession
     * - A type of animal
     * - A pet's name
     * After the user has entered these items, the program 
     * should display the following story, inserting the 
     * user's input into appropriate locations:
     *
     * There once was a person named NAME who lived in CITY. At the age of AGE,
     * NAME went to college at COLLEGE. NAME graduated and went to work as a
     * PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both
     * lived happily ever after.
     *
     * - Gaddis pg. 108
     */
    public static void doExercise16() {
        // TODO: Complete Exercise #16 Below
        String strName = new String();
        String strCity = new String();
        String strCollege = new String();
        String strProf = new String();
        String strTypeAnimal = new String();
        String strPetName = new String();
        int age=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("His or her name");
        strName = sc.nextLine();
        System.out.println("His or her age");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("the name of a city");
        strCity = sc.nextLine();
        System.out.println("the name of a College");
        strCollege = sc.nextLine();
        System.out.println("A profession");
        strProf = sc.nextLine();
        System.out.println("A type of animal");
        strTypeAnimal = sc.nextLine();
        System.out.println("A pet's name");
        strPetName = sc.nextLine();
        System.out.println("\nThere once was a person named " + strName + " who lived in " + strCity + ". At the age of " + age + ",\n"
                + strName + " went to college at " + strCollege + ". " + strName + " graduated and went to work as a\n"
                + " " + strProf + ". Then," + strName + " adopted a(n) " + strTypeAnimal + " named " + strPetName + ". They both\n"
                + "lived happily ever after.");
               
        

    }
}

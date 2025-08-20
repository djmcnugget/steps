import java.util.Scanner;

public class steps {

    public int steps(int numOfSteps) {
        if (numOfSteps == 1) {
            return 1;
        } else if (numOfSteps == 2) {
            return 2;
        } else {
            return steps(numOfSteps - 1) + steps(numOfSteps - 2);
        }
    }

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("How many steps does your staircase have?");
        int num = input.nextInt();

        steps staircase = new steps();
        int ways = staircase.steps(num);
        System.out.println("There are " + ways + " possible ways to climb this staircase.");
    }
}
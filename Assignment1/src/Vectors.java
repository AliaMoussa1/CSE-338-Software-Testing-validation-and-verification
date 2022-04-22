import java.util.Scanner;

public class Vectors {
    public String isAtEquilibrium(int [][]actingForces) {
        //initializing sum of all forces to zero
        int sumXForces = 0;
        int sumYForces = 0;
        int sumZForces = 0;

        //Each force is a row of the 2D array
        for (int i=0; i< actingForces.length; i++) {
            sumXForces += actingForces[i][0];
            sumYForces += actingForces[i][1];
            sumZForces += actingForces[i][2];
        }

        //Body is at equilibrium when sum of forces acting on it is ZERO
        //Otherwise, it's not
        if (sumXForces ==0 && sumYForces == 0 && sumZForces == 0)
            return "Yes";
        else
            return "No";
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of forces acting on Body: ");
        int noOfForces = sc.nextInt();

        int [][]actingForces  = new int [noOfForces][3];
        for (int i=0; i < actingForces.length; i++) {
            for (int j=0; j<3; j++) {
                System.out.println("Enter Force Number: " + i);
                actingForces[i][j] = sc.nextInt();
            }
        }
        //System.out.println(isAtEquilibrium(actingForces));
    }
}

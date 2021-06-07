package Package;

import java.util.Scanner;

public class exapmle12 {
    public static void main(String[] args){
        int P, t;
        double r, A, interest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        P = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        interest = input.nextDouble();
        r = interest/100;
        System.out.print("Enter the number of years: ");
        t = input.nextInt();
        A = P * (1 + r*t);
        int round = (int)Math.ceil(A);
        System.out.print("After "+t+" years at "+interest+"%, the investment will be worth $"+round);
    }
}

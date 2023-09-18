package Problems;

import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        System.out.println("enter the string to be print: ");
        Scanner sc = new Scanner(System.in);
        String star = sc.nextLine();
        for (int i =star.length()-1 ; i>=0; i--) {
            for (int j =i; j<star.length() ; j++) {
                char x=star.charAt(j);
                System.out.print(x);
            }
            System.out.println();

        }
    }
}



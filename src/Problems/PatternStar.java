package Problems;

import java.util.Scanner;

public class PatternStar {

    public static void main(String[] args){
        System.out.println("enter the number of star to be print: ");
        Scanner sc=new Scanner(System.in);
        int star=sc.nextInt();
        for(int i=1;i<=star;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
        System.out.println();

        }
        for(int i=star-1;i>0;i--){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

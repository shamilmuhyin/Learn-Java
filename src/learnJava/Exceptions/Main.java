package learnJava.Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
//        if(age<18){
//            throw new ArithmeticException();
//        }
//        else{
//            System.out.println("Eligible to vote");
//        }
        validate(age);
        System.out.println(10);
    }

    public static void validate(int age) throws MinorException{
        if(age<18) {
            try{
                throw new MinorException("Person is not eligible to vote");
            }
            catch(Exception e){
                System.out.println(e);
            }
//            throw new MinorException("Person is not eligible to vote");

        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}

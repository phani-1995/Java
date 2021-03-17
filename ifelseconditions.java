import java.util.Scanner;

public class ifelseconditions {
    // method to check wheather number is divisable by 2
    public void divbytwo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check wheather it is dicvisable by 2 or not: ");
        int n = input.nextInt();
        // condition to check wheather the number is divisable by 2
        if(n%2==0){
            System.out.println("The given number is divisable by 2");
        }
        else{
            System.out.println("The given number is not divisable by 2");
        }
    }
    // method to check wheather the year is a leap year or not
    public void leapyear(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year you want to check: ");
        int year = input.nextInt();
        // Condition to check leap year
        if (((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("The given year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
    public void evenodd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = input.nextInt();
        // here we are using ternary operator to check wheather the number is even or odd
        String n =(num % 2==0)?"even number":"odd number";
        System.out.println(n);
    }
    // checking grades for the given input marks
    public void grade(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        float marks = input.nextFloat();
        if(marks>90&&marks<=100){
            System.out.println("The grade secured is A+");
        }
        else if(marks<90 && marks>80){
            System.out.println("The grade secured is A");
        }
        else if(marks<80 && marks>70){
            System.out.println("The grade secured is B");
        }
        else if(marks<70 && marks>60){
            System.out.println("The grade secured is C");
        }
        else if(marks<60 && marks>35){
            System.out.println("The grade secured is D");
        }
        else {
            System.out.println("You are failed");
        }
    }
    public void grade_check(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        float marks = input.nextFloat();
        String rslt = (marks>90&&marks<=100)?"A+ grade": (marks>80&&marks<=90)?"A grade": (marks>70 && marks<=80)?"B grade": (marks>60 && marks<=70)?"C grade": (marks>35 && marks<=60)?"D grade":"Fail";
        System.out.println(rslt);
    }
    // nested if example
    public void nestedif(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = input.nextInt();
       // Scanner input1_weight =new Scanner(System.in);
        System.out.println("Enter the weight: ");
       // int age = input_age.nextInt();
        int weight = input.nextInt();
        if (age>=18){
            if (weight>50){
                System.out.println("You are elgible to donate the blood");
            }
            else{
                System.out.println("you are not elgible to donate the blood");
            }
        }
        else{
            System.out.println("Your age must br greater than 18");
        }
    }
    public static void main(String[] args){
        ifelseconditions obj = new ifelseconditions();
        obj.divbytwo();
        obj.leapyear();
        obj.evenodd();
        obj.grade();
        obj.grade_check();
        obj.nestedif();
    }
}

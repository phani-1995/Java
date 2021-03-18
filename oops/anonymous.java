package oops;
// import java.util.Scanner;

class Calculation
{
//Scanner scanner = new Scanner(System.in);
//int n = scanner.nextInt();
int fact=1;
void fact(int n){
    for(int i=1;i<=n;i++){
        fact = fact*i;
    }
    System.out.println("Factorial of a "+n+" "+" is "+ fact);
}
public static void main(String[] args){
    new Calculation().fact(5);  // This is ananymous object
}
}

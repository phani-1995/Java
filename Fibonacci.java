import java.util.Scanner;
public class Fibonacci {
    // without recursion
    public void fibn(){
        int n1=0,n2=1,count=10;
        System.out.println(n1+" "+n2);
        for(int i=2;i<=count;i++){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    // prime numbers in java
    public void prime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int tmp = 0;
        for(int i=1;i<=num;i++){
            for(int j=2;j<=i-1;j++) {
                if (i % j == 0) {
                    tmp = tmp + 1;
                }
            }
            if(tmp==0){
                System.out.print(" "+i);
            }
            else {
                tmp=0;
            }
        }
    }
    // checking number which we entered is prime or not
    public void check_prime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = scanner.nextInt();
        int temp = 0;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                temp=temp+1;
            }
        }
        String result=(temp>0)?num+"  "+"is not prime":num+" "+"is prime";
        System.out.println(result);
    }
    public void palindrome(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = scanner.nextInt();
        int temp=num;
        int reverse = 0;
        while(num!=0){
            int remainder = num%10;
            reverse = reverse*10+remainder;
            num = num/10;
        }
        System.out.println("The reverse of  given number "+reverse);
        String result = (temp==reverse)?temp+""+"is a palindrome":temp+""+"is not palindrome";
        System.out.println(result);
    }
    public void amstrong(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = scanner.nextInt();
        int temp=num, c=0;
        while(num!=0){
            int r = num%10;
            num=num/10;
            c = c+(r*r*r);
        }

        String result=(temp==c)?temp+" "+"is a amstrong number":temp+" "+"is not amstrong number";
        System.out.println(result);
    }

    public static void main(String[] args){
        Fibonacci fib = new Fibonacci();
        fib.fibn();
        fib.prime();
        fib.check_prime();
        fib.palindrome();
        fib.amstrong();
    }
}

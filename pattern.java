import java.util.Scanner;
public class pattern {
    public void pattrn()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattrn1(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattrn2(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void triangle(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void inverted_triangle(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern obj = new pattern();
        obj.pattrn();
        obj.pattrn1();
        obj.pattrn2();
        obj.triangle();
        obj.inverted_triangle();
    }
}

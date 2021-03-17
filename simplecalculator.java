import java.util.Scanner;

public class simplecalculator {
    public void calculator(){
        double num1, num2;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number1: ");
        num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter the operator(+, -, *, /, %): ");
        char operator = input.next().charAt(0);
        double output;
        switch(operator){
            case '+':
                output = num1+num2;
                break;
            case '-':
                output = num1-num2;
                break;
            case '*':
                output = num1*num2;
                break;
            case '/':
                output = num1/num2;
                break;
            case '%':
                output = num1%num2;
                break;
            default:
                System.out.println("You have entered a wrong operator");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+" "+output);
    }
    public void vowels(){
        boolean isvowel = false;;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char letter = scanner.next().charAt(0);
        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isvowel=true;
        }
        String rslt = (isvowel==true)?letter +" "+ "is a vowel":(isvowel==false)?letter +" "+ "is a consonent":"it is not an alphabet";
//     if (isvowel=true){
//
//     }
        System.out.println(rslt);
    }
    public static void main(String[] args){
        simplecalculator obj = new simplecalculator();
        obj.calculator();
        obj.vowels();
    }
}

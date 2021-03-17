import java.util.Scanner;
public class temp_conv {
    // converting fahrenheit to celsius
    public void conv(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the degree in fahrenheit: ");
        float F= input.nextFloat();
        float celsius = (float)(F-32)*5/9;
        System.out.println("The temperature in celsius is " + celsius);
    }
    // reads a number in inches, converts it to meters
    public void conv_mtr(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the value in inches: ");
        double inch = input1.nextDouble();
        double mtrs = inch * 0.0254;
        System.out.println(inch + "is equal to" + mtrs + " meters");
    }

    // reads an integer between 0 and 1000 and adds all the digits in the integer
    public void add_digits(){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number between 0 to 1000: ");
        int n = num.nextInt();
        int first_digit = n%10;
        int remaining_num = n/10;
        int second_digit = remaining_num%10;
        remaining_num = remaining_num/10;
        int third_digit = remaining_num%10;
        remaining_num = remaining_num/10;
        int fouth_digit = remaining_num%10;

        int sum = first_digit+second_digit+third_digit+fouth_digit;
        System.out.println("The sum of digits is: " + sum);
    }

    // converting minutes to years and days
    public void convertion(){
        Scanner min = new Scanner(System.in);
        System.out.println("Enter the values of  minutes you want to convert: ");
        int minute = min.nextInt();

        int year = minute/525600;
        int day = minute/1440;
        int remaining_min = day % 525600;
        System.out.println("Number of years and days is: " +year+ " years " + remaining_min + " days");
    }
    // main method
    public static void main(String[] args){
        temp_conv conv1 = new temp_conv();
        conv1.conv();
        conv1.conv_mtr();
        conv1.add_digits();
        conv1.convertion();
    }
}

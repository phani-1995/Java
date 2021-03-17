import java.util.Scanner;

public class switchstatement {
    public void month_check(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the month to check: ");
        int month = input.nextInt();
        String monthString;
        switch(month){
            case 0: monthString="January";
                    break;
            case 1: monthString="Febuary";
                    break;
            case 2: monthString="March";
                    break;
            case 3: monthString="April";
                    break;
            case 4: monthString="May";
                    break;
            case 5: monthString="June";
                    break;
            case 6: monthString="July";
                    break;
            case 7: monthString="August";
                    break;
            case 8: monthString="September";
                    break;
            case 9: monthString="october";
                    break;
            case 10: monthString="November";
                     break;
            case 11: monthString="December";
                     break;
            default: monthString="invalid month";
                     break;
        }
        System.out.println(monthString);
    }
    public static void main(String[] args){
        switchstatement obj = new switchstatement();
        obj.month_check();
    }
}

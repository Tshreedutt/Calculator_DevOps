import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("SPE MINIPROJECT ON CALCULATOR");
        while(true) {
            System.out.println("ENTER CHOICE :");

            System.out.println("Enter 1 FOR LOG :");
            System.out.println("Enter 2 FOR POWER FUNCTION :");
            System.out.println("Enter 3 FOR SQUARE :");
            System.out.println("Enter 4 FOR FACTORIAL :");
            System.out.println("FOR EXIT PRESS ANYTHING");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int choice;
            choice = Integer.parseInt(br.readLine());
             if (choice == 1) {
                System.out.println("ENTER NO. TO CALCULATE LOG(base e): ");
                double num = Double.parseDouble(br.readLine());
                if(num>0)
                    System.out.println("NATURAL LOG VALUE OF  "+num+" IS: "+getLogarithm(num));
                else if(num == 0)
                    System.out.println("LOG VALUE IS "+Double.NEGATIVE_INFINITY);
                else
                    System.out.println("LOG DOESNT EXIST");
                System.out.println("***********************************************************");
            }
            else if (choice == 2) {
                System.out.println("ENTER THE VALUE OF BASE : ");
                double base_num, exp_num;
                base_num = Double.parseDouble(br.readLine());
                System.out.println("ENTER THE VA;LUE OF EXPONENT : ");
                exp_num = Double.parseDouble(br.readLine());
                System.out.println(base_num + " TO THE POWER "+exp_num+ " IS: "+cal_pow(base_num, exp_num));
                System.out.println("***********************************************************");
            }
            else if (choice == 3) {
                System.out.println("ENTER THE NUMBER TO CALCULATE SQUARE ROOT : ");
                double num = Double.parseDouble(br.readLine());
                double result= getSquareRoot(num);
                if(result>=0)
                    System.out.println("SQUARE ROOT OF "+num+" IS: "+result);
                else
                    System.out.println("SQUARE ROOT NOT POSSIBLE..");
                System.out.println("***********************************************************");
            }
            else if (choice == 4) {
                System.out.println("ENTER THE NUMBER ");
                int num = Integer.parseInt(br.readLine());
                if(num >= 0){
                    System.out.println("FACTORIAL OF  "+num+" IS: "+getFactorial(num));
                }
                else
                    System.out.println("FACTORIAL NOT POSSIBLE");
                System.out.println("***********************************************************");
            }

            else{
                System.out.println("TO CONTINUE ENTER 1:");
                System.out.println("TO EXIST PRESS ELSE");
                if(Integer.parseInt(br.readLine())!=1) {
                    break;
                }
            }
        }
    }
    public static double getSquareRoot(double num){
        if(num < 0)
            return Double.NaN;
        return Math.sqrt(num);
    }
    public static double getFactorial(int n)
    {
        if(n < 0)
            return Double.NaN;
        if (n == 0)
            return 1;
        return n*getFactorial(n-1);
    }
    public static double getLogarithm(double num){
        return Math.log(num);
    }
    public static double cal_pow(double base_num, double exp_num){
        if(base_num==0 && exp_num==0)
            return Double.NaN;
        return Math.pow(base_num, exp_num);
    }

}
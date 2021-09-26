import java.util.Scanner;
public class EmployeeWageComputation {
  public static final int wph = 20;
   public static final int fdh = 2;
   public static final  int pth= 1;
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int b = 0;
        int c = 0;
        int e= s.nextInt();
        double a = Math.floor(Math.random() * 10) % 2;
        if (a == 1) {
            System.out.println("Employee is present");
            double d = Math.floor(Math.random() * 10) % 3;
            switch ((int) d) {
                case fdh:
                    b = 8;
                    break;
                case pth:
                    b = 4;
                    break;
                default:
                    b = 0;
                    break;
            }
            switch (e){
                case 1:
                    c = b * wph;
                    System.out.println("Employee Wage for a day = " + c);
                    break;
                case 2:
                    c = ((b * wph)*20);
                    System.out.println("Employee Wage for a month = " + c);
                    break;
                case 3:
                    int g= s.nextInt();
                    if(g==20)
                    {
                        c = ((b * wph)*20);
                        System.out.println("Employee Wage for a month = " + c);
                    }
                    else if (g == 100)
                    c= (wph*100);
                    System.out.println("Employee Wage for 100hrs = " + c); }

        }else
            System.out.println("Employee is absent");
    }
}

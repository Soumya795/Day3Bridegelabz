import java.util.Scanner;
public class linecomparision {
        double x1,x2,y1,y2;
        double a1,a2,b1,b2;
        public static void main(String[] args) {
            System.out.println("Welcome to Line Comparison Computation Program");
            Scanner s=new Scanner(System.in);
            System.out.print("enter the values:");
            double x1=s.nextDouble();
            double x2=s.nextDouble();
            double y1=s.nextDouble();
            double y2=s.nextDouble();
            System.out.print("enter the values:");
            double a1=s.nextDouble();
            double a2=s.nextDouble();
            double b1=s.nextDouble();
            double b2=s.nextDouble();
            double len1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            double len2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
            System.out.println("length is:"+len1);
            System.out.println("length is:"+len2);
            if (len1 == len2) {
                System.out.println("lines are equal");
            }
            else {
                System.out.println("lines are not equal");
            }

        }
    }


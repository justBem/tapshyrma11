import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Triangle triangle=new Triangle();
      Scanner scan=new Scanner(System.in);
      triangle.a=scan.nextInt();
      triangle.b=scan.nextInt();
      triangle.c=scan.nextInt();
        triangle.area(triangle.a,triangle.b,triangle.c);
    }
}
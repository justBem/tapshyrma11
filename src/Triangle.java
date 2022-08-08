public class Triangle {
    int a,b,c;
    public static void area(int a,int b,int c){
        double p=(a+b+c);
        double ar=Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        System.out.println(ar);

    }
}

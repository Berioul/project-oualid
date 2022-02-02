/*public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}*/
public class Main{
    public static void main(String[] args) {


        int a = 1;
        int b = 5;

        boolean b1 = true;
        var b2 = false;

        System.out.println(b1 && b2);
        System.out.println("the result is " +(a > b));
        System.out.println((a < b ) + " is the new " + (a > b));
        System.out.println((a < b) + "lles");
        System.out.println("result " + (Math.round( b * 100) / 100.0 ));


        print(add(a,b));
    }


    public static int add( int a, int b){
        return a + b;
    }
 private static void print(int a){
     System.out.println("result" + a);
 }
}


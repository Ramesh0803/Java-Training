//public class MethodsDemo {
//    static int add(int a, int b){
//        return a + b;
//    }
//    static int add(int a, int b, int c){
//        return  a + b + c;
//    }
//    static double add(double d1, double d2){
//        return d1 + d2;
//    }
//    public static void main(String[] args){
//        MethodsDemo obj = new MethodsDemo();
//
//        int result1 = obj.add(87,54);
//        System.out.println(result1);
//
//        int result2 = obj.add(87,54, 76);
//        System.out.println(result2);
//
//        double result3 = obj.add(287.98,154.59);
//        System.out.println(result3);
//
//    }
//}
public class MethodsDemo{
    static void print(int a){
        System.out.println(a);
    }
    static void print(String s){
        System.out.println(s);
    }
    static void print(int a, String s){
        System.out.println(a+" "+s);
    }
    public static void main(String[] args){
        print(579);
        print("My Self Ramesh");
        print(579,"My Self Ramesh");
    }
}


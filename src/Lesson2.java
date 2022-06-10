public class Lesson2 {
    public static void main(String[] args) {
        // int x -----> variable declaration
        // x = 10 ----> variable assignment
        // int x = 10 ----> variable initialization

        int x = 120;
        long y = 1633792538822209988L;
        float z = 3.145f;
        double p = 156.6778921;
        boolean q = true;
        char symbol = '@';
        String name =  "Sachini";

        System.out.println("Hi..! " +name);
        System.out.println("The Value of the X is : " +x); // will be print the value of the x.
        System.out.println("The Value of the Y is : " +y); // will be print the value of the y.
        System.out.println("The Value of the Z is : " +z); // will be print the value of the z.
        System.out.println("The Value of the Q is : " +q); // will be print the value of the q.
        System.out.println("The Value of the P is : " +p); // will be print the value of the p.
        System.out.println(String.format("%.3f", p));
        System.out.println(symbol);
    }
}

import java.util.Scanner;

public class JavaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("qiymatni kiriting ");
        //isTrue(scanner.nextBoolean());

        //System.out.println("qiymatni kiriting ");
        //toqMi(scanner.nextInt());

        //System.out.println("qiymatni a va b ni kiriting ");
        //Summ(scanner.nextInt(), scanner.nextInt());

        //System.out.println("qiymatni kiriting!!");
        //Taqqoslash_10_bilan(scanner.nextInt());

        System.out.println("qiymatni kiriting!!");
        abcKattaSon(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

    }

    public static void isTrue(boolean isTrue) {
        if (isTrue) {
            System.out.println("It is True");
        } else {
            System.out.println("It is false");
        }
    }

    public static void toqMi(int a) {
        if (a / 2 == 0) {
            System.out.println("a = " + a + " toq");
        } else {
            System.out.println("a = " + a + " juft");
        }
    }

    public static void Taqqoslash_10_bilan(int a) {
        if (a > 10) {
            a = a + 3;
            System.out.println("a = " + a);
        } else if (a < 10) {
            a = a * 2;
            System.out.println("a = " + a);
        } else {
            System.out.println("a = " + 22);
        }
    }

    public static void abcKattaSon(int a, int b, int c){
        if (a > b) {
            if(a > c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else {
            if(b > c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }
    }

    //for
    public static void Summ(int a, int b) {
        int s = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                s = s + i;
            }
            System.out.println("s = " + s);
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                s = s + i;
            }
            System.out.println("s = " + s);
        } else {
            System.out.println("s = " + s);
        }
    }

}
package Week13Homework;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Even Numbers");
        int a = 0;
        do {
            System.out.print(a + " ");
            a = a + 2;
        } while (a <= 20);
        System.out.println();

        System.out.println("Odd Numbers");
        int b = 1;
        do {
            System.out.print(b + " ");
            b = b + 2;
        } while (b <= 20);
        System.out.println();

        System.out.println("Timetables of 2");

        int c = 2;
        int d = 1;
        do {
            System.out.println(c + " * " + d + " = " + c * d);
            d++;
        } while (d <= 10);


    }

}


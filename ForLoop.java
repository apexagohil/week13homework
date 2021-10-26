package Week13Homework;

public class ForLoop {
    public static void main(String[] args) {

        System.out.println("Even numbers...");
        for (int i = 0; i < 20; i = i + 2) {
            System.out.print(i+ " ");
        }

        System.out.println();

        System.out.println("Odd numbers...");
        for (int j = 1; j < 20; j = j + 2) {
            System.out.print(j+ " ");
        }
        System.out.println();
        System.out.println();

        int a=6;
        System.out.println("Timetables of 6");
        for (int b=1;b<=10;b++){
            System.out.println(a + " * " +b+ " = "+b*a);

        }


    }
}

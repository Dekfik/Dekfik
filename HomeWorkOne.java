/**
 * Java 1. HomeWork #1
 *
 * @author Ramzan Isaev
 * @version 26.12.2021
 */
 class HomeWork {
    static void main(String[]args) {
        printThreeWords ();
        checkSumSign ();
        printColor ();
        comareNumbers();
    }

    static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a =-25;
        int b = 25;
        System.out.println((a+b> 0) ? "Sum in Positive" : "Sun is Negative");
    }

    static void printColor(); {
        int value = 100;
        if (value <=0) {
            System.out.println("Red");
        } else if (value <=100) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }
    static void compareNumbers() {
        int a = 15;
        int b = 25;
        if (a >=b) {
            System.out.println("a >=b ");
        }
        else {
            System.out.println("a<b");
        }
    }
}

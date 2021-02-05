public class Main {

    public static void main(String[] args) {

        int number = incrementNumber(50);
        System.out.println(number);
        int decrement = decrementNumber(50);
        System.out.println(decrement);
    }

    public static int incrementNumber(int number) {

        return ++number;
    }

    public static int decrementNumber(int number) {

        return --number;
    }
}

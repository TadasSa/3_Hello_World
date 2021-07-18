public class HelloWordMain3 {
    public static void main(String[] args) {
        printHW();
    }

    public static String returnHW() {
        return "Hello world !!!";
    }

    public static void printHW() {
        System.out.println(returnHW());
    }
}

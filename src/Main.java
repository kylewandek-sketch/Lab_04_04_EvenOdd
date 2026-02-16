public class Main {
    public static void main(String[] args) {
        int numToExamine = 42;
        int remainder = numToExamine % 2;

        System.out.println("The number to examine is: " + numToExamine);
        System.out.println(numToExamine + " mod 2 is " + remainder);

        if (remainder == 0) {
            System.out.println(numToExamine + " is Even");
        } else {
            System.out.println(numToExamine + " is Odd");
        }
    }
}

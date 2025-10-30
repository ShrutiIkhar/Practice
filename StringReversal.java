public class StringReversal {

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // concatenating one by one
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("world")); // Output: dlrow
    }
}

public class StringPalindrome {

    public static boolean isPalindrome(String str){

        String reverseString = new StringBuilder(str).reverse().toString();

        return str.equals(reverseString);
    }
    
    public static void main(String[] args){
        System.out.println(isPalindrome("Shruti"));
        System.out.println(isPalindrome("mom"));
        
    }
}

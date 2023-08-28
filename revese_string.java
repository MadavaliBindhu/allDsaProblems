//Write a program to reverse a string.
public class StringReversal {
    public static void main(String[] args) {
        String original = "Bindhu Muniraja";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }
    
    public static String reverseString(String input) {
        String reversed = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        return reversed;
    }
}




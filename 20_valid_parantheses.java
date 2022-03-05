import java.util.*;

public class Main {

    public static void main(String[] args) {
        String parantheses = "";
        System.out.println("Is string a valid parantheses string: "+isValid(parantheses));
    }

    public static boolean isValid(String s) {
        Stack<Character> paranthesesStack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' : paranthesesStack.push(')');
                           continue;
                case '{' : paranthesesStack.push('}');
                    continue;
                case '[' : paranthesesStack.push(']');
                    continue;
            }

            if (paranthesesStack.isEmpty() || s.charAt(i) != paranthesesStack.pop()) {
                return false;
            }
        }
        return paranthesesStack.isEmpty();
    }
}

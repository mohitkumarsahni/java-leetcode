public class Main {

    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println("Goal Parser Interpretation: "+interpret(command));
    }

    private static String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                stringBuilder.append('o');
                i++;
                continue;
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a') {
                stringBuilder.append('a');
                stringBuilder.append('l');
                i++;
                i++;
                i++;
                continue;
            }
            stringBuilder.append(command.charAt(i));
        }
        return stringBuilder.toString();
    }
}

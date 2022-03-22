public class Main {

    public static void main(String[] args) {
        String[] operations = new String[]{"--X","X++","X++"};
        System.out.println("Value of X: "+finalValueAfterOperations(operations));
    }

    private static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                X++;
            } else if (operation.charAt(1) == '-') {
                X--;
            }
        }

        return X;
    }
}

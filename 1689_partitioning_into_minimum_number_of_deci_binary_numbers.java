public class Main {

    public static void main(String[] args) {
        String s = "9088766543579";
        System.out.println("Minimum numbers of positive numbers needed to sum up the given number: "+minPartitions(s));
    }

    private static int minPartitions(String n) {
        int max = -1;
        for (int i = 0; i < n.length(); i++) {
            int temp = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}

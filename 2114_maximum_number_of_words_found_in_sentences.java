public class Main {

    public static void main(String[] args) {
        String[] operations = new String[]{"--X","X++","X++"};
        System.out.println("Most words in Sentences: "+mostWordsFound(operations));
    }

    private static int mostWordsFound(String[] sentences) {
        int count = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            if (words.length > count) {
                count = words.length;
            }
        }
        return count;
    }
}

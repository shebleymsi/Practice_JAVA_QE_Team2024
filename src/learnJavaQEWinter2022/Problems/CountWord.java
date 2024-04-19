package learnJavaQEWinter2022.Problems;

public class CountWord {

    public CountWord() {
    }

    public static void main(String[] args) {
        getCountOfTheWords();
    }

    public static void getCountOfTheWords() {
        String str = "Eid Mubarak to Every one";
        String name = " ";
        int count = 1;

        for(int i = 0; i < str.length() - 1; ++i) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                ++count;
            }
        }

        System.out.println("Number of words in String : " + count);
    }
}

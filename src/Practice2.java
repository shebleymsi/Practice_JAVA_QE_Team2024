import java.util.ArrayList;

public class Practice2 {

    static ArrayList<String>  text = new ArrayList<>();

    // make a  method that take an arraylist as parameter and call it in main method

    /*public static void printMessage(ArrayList<String> message) {
        System.out.println(message);
    }*/


    public static void printMessage() {




    }

    public static void main(String[] args) {



        text.add("Hello and welcome!");
        text.add("i = 1");
        text.add("i = 2");
        text.add("i = 3");
        text.add("i = 4");
        text.add("i = 5");
        System.out.println(text);

        printMessage();
    }
}

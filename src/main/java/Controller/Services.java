package Controller;


import Model.Parser;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Services {
    Parser parser = new Parser();

    String[] sentences = parser.getArticle().split("[\\.\\!\\?]");

    private String one = sentences[3];

    public String getOne() {
        return one;
    }


    public String replaceWithSubstring() {
        int amountLetters = 0;
        String subString = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the number of letters from which the word should be composed that needs to be replaced");
            amountLetters = Integer.parseInt(reader.readLine());
            System.out.println("Enter a substring to change the word");
            subString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //create a pattern to search for all words from a given number of letters
        Pattern pattern = Pattern.compile(String.format("\\p{Z}(\\p{L}){%d}(\\p{P}|\\p{Z})", amountLetters));
        //set the offer for search
        Matcher matcher = pattern.matcher(getOne());
        // return the sentence with replacement of all matched words
        return matcher.replaceAll(String.format("%s%s%s", " ", subString, " "));

    }


}

package Model;

import org.jsoup.Jsoup;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser {
    private Document doc;

    //get page
    {
        try {
            doc = Jsoup.connect("https://knijky.ru/books/agressiya").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //get the contents of all tags "p"
    Elements title = doc.getElementsByTag("p");
    //choose forth tag
    private String article = String.valueOf(title.tagName("p").get(3).text());

    public String getArticle() {
        return article;
    }


}


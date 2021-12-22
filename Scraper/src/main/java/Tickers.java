import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;


//--Ispisuje sve sa "Trending Tickers" tabele--//

public class Tickers  {
    public static void main(String[] args) {


       try {
           Document document = Jsoup.connect("https://finance.yahoo.com/trending-tickers").get();
           Element element = document.select("tbody").first();
           for (Element tr : element.select("tr")) {
               for (Element td : tr.select("td")) {
                   System.out.println(td.text());
               }
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}

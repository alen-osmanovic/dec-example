package webscraper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;



public class WebScrape {
    public static void main (String[] args)  {

        try{
            /////--Ispis za TSLA--/////
            Document TSLA = Jsoup.connect("https://finance.yahoo.com/quote/TSLA?p=TSLA").get();
            Elements TSLACompany = TSLA.getElementsByClass("D(ib) Fz(18px)");
            System.out.println("Company Name & Ticker:\n"+ TSLACompany.text());

            Document TSLA2 = Jsoup.connect("https://finance.yahoo.com/quote/TSLA/profile?p=TSLA").get();
            Elements TSLAProfile = TSLA2.getElementsByClass("asset-profile-container");
            System.out.println("Company Profile:\n"+TSLAProfile.text());


            Elements TSLAsummaryTable = TSLA.getElementsByClass("D(ib) W(1/2) Bxz(bb) Pend(12px) Va(t) ie-7_D(i) smartphone_D(b) smartphone_W(100%) smartphone_Pend(0px) smartphone_BdY smartphone_Bdc($seperatorColor)");
            for (Element tr : TSLAsummaryTable.select("tr"))
            {
                System.out.println(tr.text());
            }

            Elements TSLAsummaryTable2 = TSLA.getElementsByClass("D(ib) W(1/2) Bxz(bb) Pstart(12px) Va(t) ie-7_D(i) ie-7_Pos(a) smartphone_D(b) smartphone_W(100%) smartphone_Pstart(0px) smartphone_BdB smartphone_Bdc($seperatorColor)");
            for (Element tr : TSLAsummaryTable2.select("tr"))
            {
                System.out.println(tr.text());
            }

            /////--Ispis za SOPA--/////
            Document SOPA = Jsoup.connect("https://finance.yahoo.com/quote/SOPA?p=SOPA").get();
            Elements SOPACompany = SOPA.getElementsByClass("D(ib) Fz(18px)");
            System.out.println("Company Name & Ticker:\n"+ SOPACompany.text());

            Document SOPA2 = Jsoup.connect("https://finance.yahoo.com/quote/SOPA/profile?p=SOPA").get();
            Elements SOPAProfile = SOPA2.getElementsByClass("asset-profile-container");
            System.out.println("Company Profile:\n"+SOPAProfile.text());


            Elements SOPAsummaryTable = SOPA.getElementsByClass("D(ib) W(1/2) Bxz(bb) Pend(12px) Va(t) ie-7_D(i) smartphone_D(b) smartphone_W(100%) smartphone_Pend(0px) smartphone_BdY smartphone_Bdc($seperatorColor)");
            for (Element tr : SOPAsummaryTable.select("tr"))
            {
                System.out.println(tr.text());
            }

            Elements SOPAsummarytable2 = SOPA.getElementsByClass("D(ib) W(1/2) Bxz(bb) Pstart(12px) Va(t) ie-7_D(i) ie-7_Pos(a) smartphone_D(b) smartphone_W(100%) smartphone_Pstart(0px) smartphone_BdB smartphone_Bdc($seperatorColor)");
            for (Element tr : SOPAsummarytable2.select("tr"))
            {
                System.out.println(tr.text());
            }

            /////--Ispis za AAPL--/////
            Document AAPL = Jsoup.connect("https://finance.yahoo.com/quote/AAPL?p=AAPL").get();
            Elements AAPLCompany = AAPL.getElementsByClass("D(ib) Fz(18px)");
            System.out.println("Company Name & Ticker:\n"+ AAPLCompany.text());

            Document AAPL2 = Jsoup.connect("https://finance.yahoo.com/quote/AAPL/profile?p=AAPL").get();
            Elements AAPLProfile = AAPL2.getElementsByClass("asset-profile-container");
            System.out.println("Company Profile:\n"+AAPLProfile.text());


            Elements AAPLsummaryTable = AAPL.getElementsByClass("D(ib) W(1/2) Bxz(bb) Pend(12px) Va(t) ie-7_D(i) smartphone_D(b) smartphone_W(100%) smartphone_Pend(0px) smartphone_BdY smartphone_Bdc($seperatorColor)");
            for (Element tr : AAPLsummaryTable.select("tr"))
            {
                System.out.println(tr.text());
            }

            Elements AAPLsummarytable2 = SOPA.getElementsByClass("D(ib) W(1/2) Bxz(bb) Pstart(12px) Va(t) ie-7_D(i) ie-7_Pos(a) smartphone_D(b) smartphone_W(100%) smartphone_Pstart(0px) smartphone_BdB smartphone_Bdc($seperatorColor)");
            for (Element tr : AAPLsummarytable2.select("tr"))
            {
                System.out.println(tr.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

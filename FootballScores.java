import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.lang.NullPointerException;

public class FootballScores {

    public static void main(String []args) {
        try {
            Document doc = Jsoup.connect("http://www.goal.com/en-india/live-scores").get();
            String title = doc.title();
            Elements matches = doc.getElementsByClass("match");
            //MatchObject [] matches = new MatchObject[divs1.size()];
            System.out.format("%-30s%10s%30s%1s", "Team 1", "vs", "Team2", "\n");
            System.out.format("%-30s%10s%30s%1s", "======", "==", "=====", "\n\n");
            for (Element match : matches) {
                Element status = match.getElementsByClass("status").first();
                if (status.text().equals("FT")) {
                    Element team1 = match.getElementsByClass("module-team").first();
                    Element team2 = match.getElementsByClass("module-team").last();
                    Element vs = match.getElementsByClass("vs").first();
                    System. out.format("%-30s%10s%30s%1s", team1.text(),vs.text(),team2.text(),"\n\n");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
} 

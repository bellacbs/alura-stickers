import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)  throws Exception{

        String urlFilmes = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        String urlSeries = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json";
        var req = new Request();
        var parser = new JsonParser();

        String bodyFilmes = req.get(urlFilmes);
        List<Map<String, String>> listaDeFilmes = parser.parse(bodyFilmes);
        for (Map<String, String> filme: listaDeFilmes) {
            System.out.println(filme.get("title"));
            System.out.println(filme.get("image"));
            System.out.println(filme.get("imDbRating"));
            System.out.println();
        }

        System.out.println("---------SERIES--------");

        String bodySeries = req.get(urlSeries);
        List<Map<String, String>> listaDeSeries = parser.parse(bodySeries);
        for (Map<String, String> serie: listaDeSeries) {
            System.out.println(serie.get("title"));
            System.out.println(serie.get("image"));
            System.out.println(serie.get("imDbRating"));

        }


    }
}
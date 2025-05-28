package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

//        var consumoApi = new ConsumoApi(); //usando inferencia tipo ao usar var = ConsumoApi consumoPai
//        var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&&apikey=452ee81b");
//        System.out.println(json);
//        //	json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
//        //	System.out.println(json);
//        ConverterDados conversor = new ConverterDados();
//        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
//        System.out.println(dados);
//
//        json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=452ee81b");
//        DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
//        System.out.println(dadosEpisodio);

//        List<DadosTemporada> temporadas = new ArrayList<>();
//
//        for (int i = 1; i <= dados.totalTemporadas(); i++) {
//            json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=452ee81b");
//            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//
//            temporadas.add(dadosTemporada);
//        }
//        temporadas.forEach(System.out::println);
    }
}

package pl.sda2.scrappingfun.scrapingfun;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FunController {

    @SneakyThrows
    @GetMapping("/")
    public String index(Model model) {

        Document document = Jsoup.connect("https://nofluffjobs.com").get();
        List<String> elements = document.getElementsByClass("posting-title__position").stream().map(e -> e.text()).collect(Collectors.toList());
        model.addAttribute("elements", elements);

        return "index";
    }
}



// 1. Etap 1, podstawowy widok szczegółowy i lista, całośc oparta na obiektach
//     controller -> widok.html
//     @RequestMapping("/")            -> index.html       (lista zakupowa, lista roślin, lista przepisów, lista wydarzeń, lista przedmiotów, lista ofert pracy)

// Widok
//        table       id, nazwa, url do szczegółów, url do rezerwacji,

//     /plants/{id}     -> plant.html         -> serwis np PlantService ->    PlantServiceInMemory ->  List<Plant>     (Dracena, Juka, Róża,...)
//            img + szczegóły


//2. Wdrożenie na Heroku

//-------------------

// README + link do projektu
// linki na discordzie


// 3. Etap dodajemy bazę danych

// PlantServiceDB  -> PlantRepository
// A) List<Plant>     <>     List<PlantEntity>


//Plant {
//    Plant(PlantEntity pe) {
//
//    }
//}
//PlantConverter {}
//
//Plant convert(PlantEntity pe)
//
//PlantEntity convert(Plant)


// olewamy bazy danych,      JAVA  +













































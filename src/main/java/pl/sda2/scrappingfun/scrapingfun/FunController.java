package pl.sda2.scrappingfun.scrapingfun;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FunController {

    List<JobOffer> jobs = new ArrayList<JobOffer>();

    FunController() {
        jobs.add(new JobOffer("Junior Java Programmer", 5000.0, 10_000.0, "Warszawa"));
        jobs.add(new JobOffer("Intern Java Programmer", 2000.0, 6_000.0, "Warszawa"));
        jobs.add(new JobOffer("Java Programmer", 15000.0, 20_000.0, "Warszawa"));
        jobs.add(new JobOffer("Senior Java Programmer", 15_000.0, 25_000.0, "Gdynia"));
    }


    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("jobs", jobs);


        return "index";
    }


}

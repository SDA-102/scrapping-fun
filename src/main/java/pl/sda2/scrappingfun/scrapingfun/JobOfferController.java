package pl.sda2.scrappingfun.scrapingfun;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobOfferController {

    private final JobOfferService jobOfferService;

    public JobOfferController(JobOfferService jobOfferService) {
        this.jobOfferService = jobOfferService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("jobs", jobOfferService.findAll());
        return "index";
    }


}

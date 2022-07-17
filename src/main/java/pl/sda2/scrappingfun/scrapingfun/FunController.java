package pl.sda2.scrappingfun.scrapingfun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FunController {

    @GetMapping("/")
    public String index() {
        return "index";
    }


}

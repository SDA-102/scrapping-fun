package pl.sda2.scrappingfun.scrapingfun;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobOffer {

    private String title;
    private double minPayRange;
    private double maxPayRange;
    private String location;


}

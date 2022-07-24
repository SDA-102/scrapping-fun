package pl.sda2.scrappingfun.scrapingfun;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobOffer {

    private Long id;
    private String title;
    private double minPayRange;
    private double maxPayRange;
    private String location;

    public static JobOffer from(JobOfferEntity entity) {
        return new JobOffer(entity.getId(),
                            entity.getTitle(),
                            entity.getMinPayRange(),
                            entity.getMaxPayRange(),
                            entity.getLocation()
        );
    }

}

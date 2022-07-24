package pl.sda2.scrappingfun.scrapingfun;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="job_offer")
@AllArgsConstructor
@NoArgsConstructor
public class JobOfferEntity {
    @Id
    private Long id;
    private String title;
    private double minPayRange;
    private double maxPayRange;
    private String location;
}

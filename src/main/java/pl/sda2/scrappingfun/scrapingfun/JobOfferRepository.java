package pl.sda2.scrappingfun.scrapingfun;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOfferEntity, Long> {

}

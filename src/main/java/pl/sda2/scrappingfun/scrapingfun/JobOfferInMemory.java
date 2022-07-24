package pl.sda2.scrappingfun.scrapingfun;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class JobOfferInMemory implements JobOfferService {
    List<JobOffer> jobs = new ArrayList<JobOffer>();

    JobOfferInMemory() {
        jobs.add(new JobOffer(1l,"Junior Java Programmer", 5000.0, 10_000.0, "Warszawa"));
        jobs.add(new JobOffer(2l,"Intern Java Programmer", 2000.0, 6_000.0, "Warszawa"));
        jobs.add(new JobOffer(3l,"Java Programmer", 15000.0, 20_000.0, "Warszawa"));
        jobs.add(new JobOffer(4l,"Senior Java Programmer", 15_000.0, 25_000.0, "Gdynia"));
    }

    @Override
    public List<JobOffer> findAll() {
        return jobs;
    }
}

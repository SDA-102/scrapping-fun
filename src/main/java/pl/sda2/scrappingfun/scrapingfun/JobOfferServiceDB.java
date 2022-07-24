package pl.sda2.scrappingfun.scrapingfun;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobOfferServiceDB implements JobOfferService{

    private final JobOfferRepository jobOfferRepository;

    public JobOfferServiceDB(JobOfferRepository jobOfferRepository) {
        this.jobOfferRepository = jobOfferRepository;
        initData(jobOfferRepository);
    }

    @Override
    public List<JobOffer> findAll() {
        return jobOfferRepository.
                findAll()
                .stream()
                .map(e -> JobOffer.from(e))
                .collect(Collectors.toList());
    }

    private void initData(JobOfferRepository jobOfferRepository) {
        List<JobOfferEntity> jobs = new ArrayList<JobOfferEntity>();
        jobs.add(new JobOfferEntity(1l,"Junior Java Programmer", 5000.0, 10_000.0, "Warszawa"));
        jobs.add(new JobOfferEntity(2l,"Intern Java Programmer", 2000.0, 6_000.0, "Warszawa"));
        jobs.add(new JobOfferEntity(3l,"Java Programmer", 15000.0, 20_000.0, "Warszawa"));
        jobs.add(new JobOfferEntity(4l,"Senior Java Programmer", 15_000.0, 25_000.0, "Gdynia"));
        jobOfferRepository.saveAll(jobs);
    }
}

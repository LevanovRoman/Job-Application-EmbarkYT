package com.myapp.jobappembarkyt.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJod(Job job);

    Job getJobById(Long id);

    boolean deleteJob(Long id);

    boolean updateJob(Long id, Job updatedJob);
}

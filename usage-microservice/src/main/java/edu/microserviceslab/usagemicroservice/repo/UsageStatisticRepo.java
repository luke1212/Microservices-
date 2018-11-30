package edu.microserviceslab.usagemicroservice.repo;

import edu.microserviceslab.usagemicroservice.entity.UsageStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageStatisticRepo extends JpaRepository<UsageStatistic, Long> {

}

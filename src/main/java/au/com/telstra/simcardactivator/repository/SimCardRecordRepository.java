package au.com.telstra.simcardactivator.repository;

import au.com.telstra.simcardactivator.record.SimCardRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimCardRecordRepository extends JpaRepository<SimCardRecord, Long> {
}

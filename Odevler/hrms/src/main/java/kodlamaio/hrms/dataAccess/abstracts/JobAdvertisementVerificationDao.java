package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobAdvertisementVerification;

public interface JobAdvertisementVerificationDao extends JpaRepository<JobAdvertisementVerification, Integer>{

}

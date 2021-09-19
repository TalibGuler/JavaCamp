package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisementVerification;

@RestController
@RequestMapping("/api/job_advertisement_verifications")
public class JobAdvertisementVerificationsController {

	private JobAdvertisementVerificationService jobAdvertisementVerificationService;

	@Autowired
	public JobAdvertisementVerificationsController(
			JobAdvertisementVerificationService jobAdvertisementVerificationService) {
		super();
		this.jobAdvertisementVerificationService = jobAdvertisementVerificationService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisementVerification>> getAll(){
		
		return this.jobAdvertisementVerificationService.getAll();
	}
}

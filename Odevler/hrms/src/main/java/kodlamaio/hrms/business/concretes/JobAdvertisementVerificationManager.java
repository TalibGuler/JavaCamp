package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementVerificationDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisementVerification;

@Service
public class JobAdvertisementVerificationManager implements JobAdvertisementVerificationService {

	private JobAdvertisementVerificationDao jobAdvertisementVerificationDao;

	@Autowired
	public JobAdvertisementVerificationManager(JobAdvertisementVerificationDao jobAdvertisementVerificationDao) {
		super();
		this.jobAdvertisementVerificationDao = jobAdvertisementVerificationDao;
	}

	@Override
	public DataResult<List<JobAdvertisementVerification>> getAll() {

		return new SuccessDataResult<List<JobAdvertisementVerification>>(this.jobAdvertisementVerificationDao.findAll(),
				"Data listelendi");
	}

}

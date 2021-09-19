package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationByEmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.VerificationByEmployeeDao;
import kodlamaio.hrms.entities.concretes.VerificationByEmployee;

@Service
public class VerificationByEmployeeManager implements VerificationByEmployeeService {

	private VerificationByEmployeeDao verificationByEmployeeDao;

	@Autowired
	public VerificationByEmployeeManager(VerificationByEmployeeDao verificationByEmployeeDao) {
		super();
		this.verificationByEmployeeDao = verificationByEmployeeDao;
	}

	@Override
	public DataResult<List<VerificationByEmployee>> getAll() {

		return new SuccessDataResult<List<VerificationByEmployee>>(this.verificationByEmployeeDao.findAll(),
				"Data listelendi");
	}
}

package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.VerificationByEmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.VerificationByEmployee;

@RestController
@RequestMapping("/api/verification_by_employees")
public class VerificationByEmployeesController {

	private VerificationByEmployeeService verificationByEmployeeService;

	@Autowired
	public VerificationByEmployeesController(VerificationByEmployeeService verificationByEmployeeService) {
		super();
		this.verificationByEmployeeService = verificationByEmployeeService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<VerificationByEmployee>> getAll(){
		return this.verificationByEmployeeService.getAll();
	}
}

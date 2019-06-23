package com.hcl.loanController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonalLoanController<LoanRegistrationReply> {
	
	@RequestMapping(method = RequestMethod.POST, value="/register/PersonalLoan")
	@ResponseBody
	LoanRegistrationReply register(@RequestBody LoanRegistration studregd) {
	LoanRegistrationReply stdregreply = new LoanRegistrationReply();
	stdregreply.setName(studregd.getName());
	stdregreply.setAge(studregd.getAge());
	stdregreply.setRegistrationNumber("12345678");
	stdregreply.setRegistrationStatus("Successful");
	return stdregreply;
	}

}

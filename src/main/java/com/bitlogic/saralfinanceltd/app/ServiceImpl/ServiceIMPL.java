package com.bitlogic.saralfinanceltd.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.saralfinanceltd.app.EnquiryRepo.EnquiryRepository;
import com.bitlogic.saralfinanceltd.app.ServiceI.ServiceI;
import com.bitlogic.saralfinanceltd.app.model.Enquiry;

@Service
public class ServiceIMPL implements ServiceI {
	@Autowired
	EnquiryRepository sr;

	@Override
	public Enquiry addEnquiry(Enquiry e) {
		
		return sr.save(e);
	}

	@Override
	public Iterable<Enquiry> getEnquiry() {
		
		return sr.findAll();
	}

	@Override
	public List<Enquiry> SearchEnquiry(String firstName)
	{
	    return sr.findByfirstName(firstName);
		
	}

	

}

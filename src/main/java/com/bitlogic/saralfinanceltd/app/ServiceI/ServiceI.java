package com.bitlogic.saralfinanceltd.app.ServiceI;

import java.util.List;

import com.bitlogic.saralfinanceltd.app.model.Enquiry;

public interface ServiceI {
	
	
public Enquiry addEnquiry(Enquiry e);

public Iterable<Enquiry> getEnquiry();

public List<Enquiry> SearchEnquiry(String firstName);

}

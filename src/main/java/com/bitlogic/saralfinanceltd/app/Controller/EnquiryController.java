package com.bitlogic.saralfinanceltd.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.saralfinanceltd.app.ServiceI.ServiceI;
import com.bitlogic.saralfinanceltd.app.model.Enquiry;


@RestController
@RequestMapping("/ApiEnquiry")
public class EnquiryController {
	@Autowired
	ServiceI si;

	@PostMapping("/addEnquiry")
	public ResponseEntity<Enquiry> addEnquiry(@RequestBody Enquiry e)
	{
	      Enquiry enquiry=	si.addEnquiry(e); 
	      return new ResponseEntity<Enquiry>(enquiry,HttpStatus.CREATED);
	}
	@GetMapping("/getEnquiry")
	public ResponseEntity<Iterable<Enquiry>> getEnquiry()
	{
		   Iterable<Enquiry> enquiry = si.getEnquiry();
	       return new  ResponseEntity<Iterable<Enquiry>>(enquiry,HttpStatus.OK);
	}
	
	@GetMapping("/searchEnquiry/{firstName}")
	public List<Enquiry> SearchEnquiry(@PathVariable String firstName )
	{
		   List<Enquiry> enqlist=si.SearchEnquiry(firstName);
		return enqlist;
		
	}
}

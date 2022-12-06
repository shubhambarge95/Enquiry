package com.bitlogic.saralfinanceltd.app.EmailController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.saralfinanceltd.app.EmailServiceI.EmailServiceI;
import com.bitlogic.saralfinanceltd.app.EmailServiceIMPL.EmailServiceIMPL;
import com.bitlogic.saralfinanceltd.app.Emailmodel.Email;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/EmailApi")
public class EmailController {
	@Autowired 
	EmailServiceI esi;
	
	@Value("${spring.mail.username}")
	private String username;
	@PostMapping("/sendEmail")
	private String SendEmail(@RequestBody Email e)
	{
		e.setFromEmail(username);
		try {
			esi.sendEmail(e);
			
		} catch (Exception e2) {
			return "email cannot be sent ";
		}
		return "Email Send";
		
	}
	@PostMapping("/SendAttachement")
	public String SendAttachement(@RequestBody Email e)
	{
		e.setFromEmail(username);
		try {
			esi.SendAttachement(e);
			
		} catch (Exception e2) {
			return "email cannot be sent";
		}
		return "Email Send"; 
		
	}
			
	

}

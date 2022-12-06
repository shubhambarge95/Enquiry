package com.bitlogic.saralfinanceltd.app.EmailServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.bitlogic.saralfinanceltd.app.EmailServiceI.EmailServiceI;
import com.bitlogic.saralfinanceltd.app.Emailmodel.Email;

import jakarta.mail.internet.MimeMessage;
@Service
public class EmailServiceIMPL implements EmailServiceI {

	@Autowired 
	JavaMailSender jm;
	public void sendEmail(Email e) {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom(e.getFromEmail());
		smm.setTo(e.getToEmail());
		smm.setText(e.getTxtmsg());
		smm.setSubject(e.getSubject());
		jm.send(smm);
		
		
		
	}
	@Override
	public void SendAttachement(Email e) {

		MimeMessage mm=jm.createMimeMessage();
		try {
			MimeMessageHelper mmh=new MimeMessageHelper(mm,true); 
			mmh.setFrom(e.getFromEmail());
			mmh.setTo(e.getToEmail());
			mmh.setText(e.getTxtmsg());
			mmh.setSubject(e.getSubject());
			
			FileSystemResource rr=new FileSystemResource("");
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		
	}

}

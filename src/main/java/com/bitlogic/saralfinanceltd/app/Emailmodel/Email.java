package com.bitlogic.saralfinanceltd.app.Emailmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {
	private String toEmail;
	private String FromEmail;
	private String Subject;
	private String txtmsg;

}

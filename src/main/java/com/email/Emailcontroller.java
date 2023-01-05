package com.email;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Emailcontroller {

	@Autowired
	EmailService emailService;

	@GetMapping("/sendmail")
	public String sendEmail(@RequestBody Email email) throws MessagingException {
		return emailService.sendAttachment(email);
	}
}

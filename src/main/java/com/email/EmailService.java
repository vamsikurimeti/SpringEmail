package com.email;

import java.io.File;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	JavaMailSender javaMailSender;

	SimpleMailMessage message = new SimpleMailMessage();

	public String sendEmail(Email email) {

		message.setFrom("bh.jagadeesh07@gmail.com");
		message.setTo(email.getTo());
		message.setSubject(email.getSubject());
		message.setText(email.getBody());
		message.setText(email.getAttachment());

		javaMailSender.send(message);

		return "Mail sent";
	}

	public String sendAttachment(Email email) throws MessagingException {

		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper;
		mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setFrom("bh.jagadeesh07@gmail.com");
		mimeMessageHelper.setTo(email.getTo());
		mimeMessageHelper.setText(email.getBody());
		mimeMessageHelper.setSubject(email.getSubject());
		FileSystemResource file = new FileSystemResource(new File(email.getAttachment()));

		mimeMessageHelper.addAttachment(file.getFilename(), file);
		javaMailSender.send(mimeMessage);
		return "Mail Sent Success";

	}

}

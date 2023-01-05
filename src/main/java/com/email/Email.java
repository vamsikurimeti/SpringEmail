/**
 * 
 */
package com.email;

/**
 * @author vamsi
 *
 */
public class Email {

	private String to;
	private String subject;
	private String body;
	private String attachment;
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * @return the attachment
	 */
	public String getAttachment() {
		return attachment;
	}
	/**
	 * @param attachment the attachment to set
	 */
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	/**
	 * @param to
	 * @param subject
	 * @param body
	 * @param attachment
	 */
	public Email(String to, String subject, String body, String attachment) {
		super();
		this.to = to;
		this.subject = subject;
		this.body = body;
		this.attachment = attachment;
	}
	/**
	 * 
	 */
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Email [to=" + to + ", subject=" + subject + ", body=" + body + ", attachment=" + attachment + "]";
	}
	
}

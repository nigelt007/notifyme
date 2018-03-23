package com.notifyme.interfaces;

/**
 * This class holds the details regarding the email or notification.
 *
 */
public class NotificationDTO {

	private String fromAddress;

	private String toAddress;

	private String subject;

	private String emailContent;

	private String date;

	private String time;

	private String user;

	private boolean isNotification;

	private String notificationHeader;

	private String notificationBody;

	private String channel;

	/**
	 * Constructor for Holding details related to mail notification
	 * 
	 * @param from
	 *            - the from address of the sender
	 * @param to
	 *            - the to address of the recepient
	 * @param sub
	 *            - the subject of the email
	 * @param date
	 *            - the date of sending
	 * @param time
	 *            - the time of sending
	 */
	public NotificationDTO(String from, String to, String sub, String date, String time, String content) {
		this.fromAddress = from;
		this.toAddress = to;
		this.subject = sub;
		this.date = date;
		this.time = time;
		this.emailContent = content;
		this.isNotification = false;

	}

	/**
	 * Constructor for Holding details related to mail notification
	 * 
	 * @param user
	 *            - the username
	 * @param header
	 *            - notification header
	 * @param body
	 *            - notification body
	 * @param date
	 *            - date of notification
	 * @param time
	 *            - time of notification
	 * @param channel
	 *            - channel through which user is notified
	 */
	public NotificationDTO(String user, String header, String body, String channel) {

		this.user = user;
		this.notificationHeader = header;
		this.notificationBody = body;
		this.channel = channel;
		this.isNotification = true;
	}

	public String getEmailContent() {
		return emailContent;
	}

	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public boolean getIsNotification() {
		return isNotification;
	}

	public void setIsNotification(boolean isNotification) {
		this.isNotification = isNotification;
	}

	public String getNotificationHeader() {
		return notificationHeader;
	}

	public void setNotificationHeader(String notificationHeader) {
		this.notificationHeader = notificationHeader;
	}

	public String getNotificationBody() {
		return notificationBody;
	}

	public void setNotificationBody(String notificationBody) {
		this.notificationBody = notificationBody;
	}

	public void setNotification(boolean isNotification) {
		this.isNotification = isNotification;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

}

package com.notifyme.interfaces;

import java.util.List;

import com.notifyme.impl.NotificationDTO;

public interface NotificationClient {

	public String sendEmail(String from, String to, String subject);

	public String notifySlackSubscriber(String from, String subscriber);
	
	public String notifyViaAllMediums(String from, String subscriber);
	
	public String sendEmails(List<NotificationDTO> notifications);
}

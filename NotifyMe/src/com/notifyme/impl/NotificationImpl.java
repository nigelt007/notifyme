package com.notifyme.impl;

import java.util.List;

import com.notifyme.interfaces.NotificationClient;
import com.notifyme.interfaces.NotificationDTO;

public class NotificationImpl implements NotificationClient {
	
	private static final String OK = "200_OK";

	@Override
	public String sendEmail(String from, String to, String subject) {

		String status = "200/OK";
		
		
		
		return status;
		
	}

	@Override
	public String notifySlackSubscriber(String from, String subscriber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String notifyViaAllMediums(String from, String subscriber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendEmails(List<NotificationDTO> notifications) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

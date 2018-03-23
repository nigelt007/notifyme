package com.notifyme.impl;

import java.util.List;
import java.util.Map;

import com.notifyme.interfaces.NotificationClient;
import com.notifyme.interfaces.NotificationDTO;

public class NotificationImpl implements NotificationClient {

	private static final String OK = "200_OK";

	@Override
	public String sendEmail(String from, String to, String subject, String content) {
		// TODO: Read the parameter values and construct the email
		// and send the email to the respective sender
		
		// If the email was sent successfully, return ok,
		// if not, send the error message
		return OK;

	}

	@Override
	public String notifySlackSubscriber(String from, String subscriber) {
		// TODO Notify the slack subscriber based on the channel and the user
		return null;
	}

	@Override
	public String notifyViaAllMediums(Map<String, List<String>> channelUserMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendEmails(List<NotificationDTO> notifications) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendNotifications(List<NotificationDTO> notifications) {
		// TODO Auto-generated method stub
		return null;
	}

}

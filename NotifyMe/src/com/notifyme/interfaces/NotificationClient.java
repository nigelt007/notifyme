package com.notifyme.interfaces;

import java.util.List;
import java.util.Map;

public interface NotificationClient {

	public String sendEmail(String from, String to, String subject, String content);

	public String notifySlackSubscriber(String from, String subscriber);

	public String notifyViaAllMediums(Map<String, List<String>> channelUserMap);

	public String sendEmails(List<NotificationDTO> emails);

	public String sendNotifications(List<NotificationDTO> notifications);
}

package com.notifyme.interfaces;

import java.util.List;
import java.util.Map;

public interface NotificationClient {

	/**
	 * Sends email to the recepient
	 * 
	 * @param from
	 *            - from address
	 * @param to
	 *            - to address
	 * @param subject
	 *            - subject of the email
	 * @param content
	 *            - content of the email
	 * @return
	 */
	public String sendEmail(String from, String to, String subject, String content);

	/**
	 * Notifies the slack user or subscriber
	 * 
	 * @param from
	 *            - the slack channel from which notification has come
	 * @param subscriber
	 *            - the user or subscriber who is notified
	 * @return
	 */
	public String notifySlackSubscriber(String from, String subscriber);

	/**
	 * Notifies a list of users in different channels
	 * 
	 * @param channelUserMap
	 *            - the key value pair containing the channel and the corresponding
	 *            list of users to be notified
	 * @return
	 */
	public String notifyViaAllMediums(Map<String, List<String>> channelUserMap);

	/**
	 * Sends bulk emails
	 * 
	 * @param emails
	 *            - the details of the emails, in the form of a list
	 *            {@link NotificationDTO}s
	 * @return
	 */
	public String sendEmails(List<NotificationDTO> emails);

	/**
	 * Notifies in a bulk
	 * 
	 * @param notifications
	 *            - the details of the notifications, in the form of a list of
	 *            {@link NotificationDTO}s
	 * @return
	 */
	public String sendNotifications(List<NotificationDTO> notifications);
}

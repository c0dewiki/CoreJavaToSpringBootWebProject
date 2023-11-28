package org.bank.account.transaction.api;

import org.bank.account.transaction.service.NotificationClient;


public class AccountTransactionAPI {
	
	private NotificationClient emailNotificationClient;
	private NotificationClient smsNotificationClient;
	
	public void sendDebitTransaction() {
		this.emailNotificationClient.sendNotification();
		this.smsNotificationClient.sendNotification();
	}
	
	public void sendStatement() {
		this.emailNotificationClient.sendNotification();

	}

	public void setEmailNotificationClient(NotificationClient emailNotificationClient) {
		this.emailNotificationClient = emailNotificationClient;
	}

	public void setSmsNotificationClient(NotificationClient smsNotificationClient) {
		this.smsNotificationClient = smsNotificationClient;
	}
	
}

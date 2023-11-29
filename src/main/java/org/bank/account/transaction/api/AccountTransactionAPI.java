package org.bank.account.transaction.api;

import org.bank.account.transaction.service.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountTransactionAPI {
	
	@Autowired
	private NotificationClient emailNotificationClient;
	@Autowired
	private NotificationClient smsNotificationClient;
	
	public void sendDebitTransaction() {
		this.emailNotificationClient.sendNotification();
		this.smsNotificationClient.sendNotification();
	}
	
	public void sendStatement() {
		this.emailNotificationClient.sendNotification();

	}

	
	
}

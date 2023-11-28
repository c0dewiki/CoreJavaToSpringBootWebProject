package org.bank.account.transaction.service;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationClient implements NotificationClient {

	@Override
	public void sendNotification() {
		
		System.out.println("Account Transaction sent to your mobile number");

	}

}

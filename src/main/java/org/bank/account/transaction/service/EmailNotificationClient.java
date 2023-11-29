package org.bank.account.transaction.service;

import org.springframework.stereotype.Component;

public class EmailNotificationClient implements NotificationClient {

	@Override
	public void sendNotification() {
		System.out.println("Account Transaction sent to your email");

	}

}

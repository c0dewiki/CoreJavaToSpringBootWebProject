package org.bank.account.transaction;



import org.bank.account.transaction.api.AccountTransactionAPI;
import org.bank.account.transaction.service.EmailNotificationClient;
import org.bank.account.transaction.service.SmsNotificationClient;


public class BankApplication 
{
    public static void main( String[] args ) {
    	
    	
    
        AccountTransactionAPI accountTransactionAPI = 
        		new AccountTransactionAPI();
        EmailNotificationClient emailNotificationClient = new EmailNotificationClient();
        SmsNotificationClient smsNotificationClient = new SmsNotificationClient();
        accountTransactionAPI.setEmailNotificationClient(emailNotificationClient);
        accountTransactionAPI.setSmsNotificationClient(smsNotificationClient);
        
        System.out.println("Account debit Transaction details");
        accountTransactionAPI.sendDebitTransaction();
        
        System.out.println("Account Statement details");
        accountTransactionAPI.sendStatement();
        
        
    }
}

package org.bank.account.transaction;



import org.bank.account.transaction.api.AccountTransactionAPI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BankApplication 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	
    
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BankApplication.class);
        
         AccountTransactionAPI accountTransactionAPI = applicationContext.getBean(AccountTransactionAPI.class);
        
        
        System.out.println("Account debit Transaction details");
        accountTransactionAPI.sendDebitTransaction();
        
        System.out.println("Account Statement details");
        accountTransactionAPI.sendStatement();
        
        
    }
}

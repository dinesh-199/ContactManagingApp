package com.ashok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashok.dao.ReportDao;
import com.ashok.service.MessageService;

@SpringBootApplication
public class LoggingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingAppApplication.class, args);
		
		MessageService msg=new MessageService();
		msg.getWelcomemsg();
		msg.getGreetmsg();
		
		
		ReportDao repo= new ReportDao();
		    
		    repo.getName(101);
	}

}

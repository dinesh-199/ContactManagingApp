package com.ashok.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.ashok.service.MessageService;

public class ReportDao {
	
	private static final Logger logger=LoggerFactory.getLogger(ReportDao.class);
	
	public String getName(Integer id)
	{
		
		String name=null;
		
		logger.info("getName---Start");
		
		if(id==101)
		{
			name= "smith";
		}
		
		else if(id==102) 
		{
			name= "john";
		}
		else {
			
			name= "Invalid Id";
		}
		
		logger.info("getName---end");
		
		return name;
	}

	
}

package com.haoli.log.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haoli.log.dao.RequestLogDao;
import com.haoli.log.domain.RequestLog;
import com.haoli.sdk.domain.JsonResponse;

@Service	
public class RequestLogService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RequestLogDao requestLogDao;

	public JsonResponse insertRequestLog(RequestLog requestLog) {
		Integer primaryKey =  requestLogDao.insertRequestLog(requestLog);
		logger.info("primaryKey: "+primaryKey);
		if(primaryKey !=null && !primaryKey.toString().equals("")) {
			return JsonResponse.success();
		}else {
			return JsonResponse.fail();
		}
	}

}

package com.haoli.log.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.haoli.log.domain.RequestLog;
import com.haoli.log.service.RequestLogService;
import com.haoli.sdk.domain.JsonResponse;


/**
 * web request record log api
 * @author Hao Li
 *
 */
@RestController
public class RequestLogApi {

	@Autowired
	RequestLogService requestLogService;
	
	@PostMapping("log/insertRequestLog")
	public JsonResponse insertRequestLog(@RequestBody RequestLog requestLog) {
		return requestLogService.insertRequestLog(requestLog);
	}
}

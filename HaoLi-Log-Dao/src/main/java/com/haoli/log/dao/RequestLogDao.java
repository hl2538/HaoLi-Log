package com.haoli.log.dao;

import org.apache.ibatis.annotations.Mapper;

import com.haoli.log.domain.RequestLog;

@Mapper
public interface RequestLogDao {

	int insertRequestLog(RequestLog requestLog);

}

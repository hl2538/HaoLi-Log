package com.haoli.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haoli.log.dao.CrashLogDao;

@Service
public class CrashLogServie {

	@Autowired
	CrashLogDao crashLogDao;
	
}

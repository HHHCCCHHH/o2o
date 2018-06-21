package com.imooc.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.o2o.dao.AreaDao;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
/**
 * 
* @package_name}   com.imooc.o2o.service.impl 
* @file_name} AreaServiceImpl.java 
* @anthor   liuyu
* @oper_time 2018年6月21日 
* @version V 1.0
 */
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;
	@Override
	public List<Area> getAreaList() {
		
		return areaDao.queryArea();
	}

}

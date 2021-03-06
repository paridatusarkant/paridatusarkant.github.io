package com.app.servive.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;
import com.app.service.IOrderMethodService;

@Service
public class OrderMethodServiceImpl implements IOrderMethodService {
	@Autowired
	private IOrderMethodDao dao;

	@Transactional
	public Integer saveOrderMethod(OrderMethod orderMethod) {
		return (Integer)dao.saveOrderMethod(orderMethod);
	}

	@Transactional
	public void deleteOrderMethod(Integer id) {
	dao.deleteOrderMethod(id);
	}

	@Transactional
	public void updateOrderMethod(OrderMethod orderMethod) {
	dao.updateOrderMethod(orderMethod);
	}

	@Transactional(readOnly=true)
	public OrderMethod getOrderMethodById(Integer id) {
		return dao.getOrderMethodById(id);
	}

	@Transactional(readOnly=true)
	public List<OrderMethod> getAllOrderMethods() {
	return dao.getAllOrderMethods();
	}

}

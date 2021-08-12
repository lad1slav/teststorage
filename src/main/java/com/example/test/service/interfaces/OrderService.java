package com.example.test.service.interfaces;

import com.example.test.dto.CreateOrderDTO;
import com.example.test.dto.OrderDTO;
import com.example.test.entity.Order;

import java.util.List;

public interface OrderService {
    OrderDTO createOrder(CreateOrderDTO createOrderDTO);
    List<Order> findAll();
}

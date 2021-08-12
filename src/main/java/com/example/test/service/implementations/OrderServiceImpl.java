package com.example.test.service.implementations;

import com.example.test.dto.CreateOrderDTO;
import com.example.test.dto.OrderDTO;
import com.example.test.entity.Order;
import com.example.test.repository.OrderRepository;
import com.example.test.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    @Transactional
    public OrderDTO createOrder(CreateOrderDTO createOrderDTO) {
        Order newOrder = new Order();
        newOrder.setPrice(createOrderDTO.getPrice());
        newOrder.setQuantity(createOrderDTO.getQuantity());
        newOrder.setItem(createOrderDTO.getItem());
        long orderID = orderRepository.save(newOrder).getId();
        Order savedOrder = orderRepository.findOrderById(orderID);

        OrderDTO newOrderDTO = new OrderDTO();
        newOrderDTO.setId(savedOrder.getId());
        newOrderDTO.setPrice(savedOrder.getPrice());
        newOrderDTO.setQuantity(savedOrder.getQuantity());
        newOrderDTO.setItem(savedOrder.getItem());

        return newOrderDTO;
    }
}

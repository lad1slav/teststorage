package com.example.test.controller;

import com.example.test.dto.CreateOrderDTO;
import com.example.test.dto.OrderDTO;
import com.example.test.entity.Order;
import com.example.test.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderDTO> createOrder(@Valid @RequestBody CreateOrderDTO orderDTO) {
        Optional<OrderDTO> resultOptional = Optional.of(orderService.createOrder(orderDTO));
        return resultOptional.map(ResponseEntity::ok)
                .orElseGet(() ->
                        new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public List<Order> getAllOrders() {

        return orderService.findAll();
    }
}

package com.example.test.repository;

import com.example.test.entity.Order;
import com.example.test.entity.enumeration.ItemEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByItem(ItemEnum item);

    Order findOrderById(Long id);
}

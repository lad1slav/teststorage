package com.example.test.dto;

import com.example.test.entity.enumeration.ItemEnum;
import lombok.Data;


@Data
public class OrderDTO {
    protected Long id;
    private Double price;
    private int quantity;
    private ItemEnum item;
}

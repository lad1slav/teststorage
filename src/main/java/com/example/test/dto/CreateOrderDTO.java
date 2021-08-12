package com.example.test.dto;

import com.example.test.entity.enumeration.ItemEnum;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CreateOrderDTO {
    @NotNull
    @Min(value = 0, message = "Quantity should not be less than 0")
    private Double price;

    @NotNull
    @Min(value = 0, message = "Quantity should not be less than 0")
    private int quantity;

    @NotEmpty
    private ItemEnum item;
}

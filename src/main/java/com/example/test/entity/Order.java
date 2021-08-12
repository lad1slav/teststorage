package com.example.test.entity;

import com.example.test.entity.enumeration.ItemEnum;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "OrderTable")
@Data
//@EqualsAndHashCode(callSuper = false, exclude = {"creatorUser", "targetUser", "overtimes"})
//@ToString(callSuper = true, exclude = {"creatorUser", "targetUser", "overtimes"})
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "item", length = 250, columnDefinition = "VARCHAR(250)")
    private ItemEnum item;

}


package com.morrie.myshop.repository.order.query;

import com.morrie.myshop.domain.Address;
import com.morrie.myshop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by morrie kim on 2020/05/25.
 */
@Data
public class OrderFlatDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderDate; //주문시간
    private OrderStatus orderStatus;
    private Address address;

    private String itemName;
    private int orderPrice;
    private int count;

    public OrderFlatDto(Long orderId, String name, LocalDateTime orderDate, OrderStatus orderStatus, Address address, String itemName, int orderPrice, int count) {
        this.orderId = orderId;
        this.name = name;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.address = address;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}

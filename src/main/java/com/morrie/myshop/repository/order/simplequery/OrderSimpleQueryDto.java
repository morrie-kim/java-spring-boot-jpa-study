package com.morrie.myshop.repository.order.simplequery;

import com.morrie.myshop.domain.Address;
import com.morrie.myshop.domain.Order;
import com.morrie.myshop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by morrie kim on 2020/05/05.
 */
@Data
public class OrderSimpleQueryDto {
    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    public OrderSimpleQueryDto(Order order) {
        orderId = order.getId();
        name = order.getMember().getName(); // Lazy Loading 강제 초기화
        orderDate = order.getOrderDate();
        orderStatus = order.getStatus();
        address = order.getDelivery().getAddress(); // Lazy Loading 강제 초기화
    }
}


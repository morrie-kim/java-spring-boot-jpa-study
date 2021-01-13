package com.morrie.myshop.repository.order.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * Created by morrie kim on 2020/05/24.
 */
@Data
public class OrderItemQueryDto {
    @JsonIgnore
    private Long orderId; //주문번호
    private String itemName;//상품 명
    private int orderPrice; //주문 가격
    private int count; //주문 수량

    public OrderItemQueryDto(
            Long orderId,
            String itemName,
            int orderPrice,
            int count) {
        this.orderId = orderId; this.itemName = itemName; this.orderPrice = orderPrice; this.count = count;
    }
}

package com.morrie.myshop.api;

import com.morrie.myshop.domain.Order;
import com.morrie.myshop.domain.OrderSearch;
import com.morrie.myshop.repository.OrderRepository;
import com.morrie.myshop.repository.order.simplequery.OrderSimpleQueryDto;
import com.morrie.myshop.repository.order.simplequery.OrderSimpleQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by morrie kim on 2020/04/19.
 * xToOne(ManyToOne, OneToOne) 관계 성능 최적화
 * Order
 * Order -> Member
 * Order -> Delivery
 */
@RestController
@RequiredArgsConstructor
public class OrderSimpleApiController {

    private final OrderRepository orderRepository;
    private final OrderSimpleQueryRepository orderSimpleQueryRepository;

    @GetMapping("/api/v1/simple-orders")
    public List<Order> ordersV1() {
        List<Order> all = orderRepository.findAllByString(new OrderSearch());
        for (Order order : all) {
            order.getMember().getName(); // Lazy Loading 강제 초기화
            order.getDelivery().getAddress(); // Lazy Loading 강제 초기화
        }
        return all;
    }

    @GetMapping("/api/v2/simple-orders")
    public List<OrderSimpleQueryDto> ordersV2() {
        //ORDER 2개
        //N + 1 -> 1 + 회원 N + 배송 N
        List<Order> orders = orderRepository.findAllByString(new OrderSearch());

        List<OrderSimpleQueryDto> result = orders.stream()
                .map(o -> new OrderSimpleQueryDto(o))
                .collect(Collectors.toList());

        return result;

    }

    @GetMapping("/api/v3/simple-orders")
    public List<OrderSimpleQueryDto> ordersV3() {

        List<Order> orders = orderRepository.findAllWithMemberDelivery();


        List<OrderSimpleQueryDto> result = orders.stream()
                .map(o -> new OrderSimpleQueryDto(o))
                .collect(Collectors.toList());

        return result;

    }

    @GetMapping("/api/v4/simple-orders")
    public List<OrderSimpleQueryDto> ordersV4() {

        List<OrderSimpleQueryDto> result = orderSimpleQueryRepository.findOrderDtos();

        return result;

    }





}

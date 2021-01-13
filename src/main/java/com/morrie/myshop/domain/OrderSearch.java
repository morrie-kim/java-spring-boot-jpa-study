package com.morrie.myshop.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by morrie kim on 2020/04/09.
 */
@Getter @Setter
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;
}

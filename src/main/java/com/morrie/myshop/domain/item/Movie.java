package com.morrie.myshop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by morrie kim on 2020/04/08.
 */
@Entity
@DiscriminatorValue("M")
@Getter
@Setter
public class Movie extends Item {
    private String director;
    private String actor;

}

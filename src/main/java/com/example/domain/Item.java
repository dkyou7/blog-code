package com.example.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;import javax.persistence.ManyToOne;
@Getter
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    private String name;    private long price;

    @ManyToOne
    private Shop shop;

    public Item(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public void updateShop(Shop shop){
        this.shop = shop;
    }
}

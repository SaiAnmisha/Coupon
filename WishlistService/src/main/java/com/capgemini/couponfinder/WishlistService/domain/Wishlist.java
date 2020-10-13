package com.capgemini.couponfinder.WishlistService.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "whishlist")
public class Wishlist {
    @Id
    private String id;
    private List<Coupons> coupons;
    private String username;

    public Wishlist() {
        super();

    }
    public Wishlist(String id, List<Coupons> coupons, String username) {
        super();
        this.id=id;
        this.coupons = coupons;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Coupons> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupons> coupons) {
        this.coupons = coupons;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

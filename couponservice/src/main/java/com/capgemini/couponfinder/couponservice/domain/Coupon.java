package com.capgemini.couponfinder.couponservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coupon")
public class Coupon {
    @Id
    private String couponId;
    private String couponName;
    private String couponImage;
    private String couponDescription;
    private String couponCode;
    private String couponCategory;
    private String couponStore;
    private String couponRate;
    public Coupon() {
        super();
    }

    public Coupon(String couponId, String couponName,String couponImage, String couponDescription, String couponCode,String couponCategory,String couponStore,String couponRate) {
        super();
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponImage = couponImage;
        this.couponDescription = couponDescription;
        this.couponCode = couponCode;
        this.couponCategory = couponCategory;
        this.couponStore = couponStore;
        this.couponRate = couponRate;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponImage() {
        return couponImage;
    }

    public void setCouponImage(String couponImage) {
        this.couponImage = couponImage;
    }

    public String getCouponDescription() {
        return couponDescription;
    }

    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponCategory() {
        return couponCategory;
    }

    public void setCouponCategory(String couponCategory) {
        this.couponCategory = couponCategory;
    }

    public String getCouponStore() {
        return couponStore;
    }

    public void setCouponStore(String couponStore) {
        this.couponStore = couponStore;
    }

    public String getCouponRate() {
        return couponRate;
    }

    public void setCouponRate(String couponRate) {
        this.couponRate = couponRate;
    }

    @Override
    public String toString() {
        return "Coupon [couponId=" + couponId + ", couponName=" + couponName + ", couponDescription="
                + couponDescription + ", couponRate=" + couponRate + "]";
    }
}

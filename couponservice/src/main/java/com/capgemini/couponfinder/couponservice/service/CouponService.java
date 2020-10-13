package com.capgemini.couponfinder.couponservice.service;

import com.capgemini.couponfinder.couponservice.domain.Coupon;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CouponService {
    public Coupon saveCoupon(Coupon coupon);
    public List<Coupon> getallCoupons() ;
    public boolean deleteCoupon(String couponId);
    public Coupon getByCouponName(String couponName);
    public Coupon getByCouponCode(String couponCode);
    public Coupon getByCouponRate(String couponRate);
    public List<Coupon> getByCouponCategory(String couponCategory);
    public List<Coupon> getByCouponStore(String couponStore);
}

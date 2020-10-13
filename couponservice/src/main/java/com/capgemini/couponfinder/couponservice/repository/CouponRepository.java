package com.capgemini.couponfinder.couponservice.repository;

import com.capgemini.couponfinder.couponservice.domain.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouponRepository extends MongoRepository<Coupon, String> {
    public Coupon getByCouponName(String couponName);
    public Coupon getByCouponCode(String couponCode);
    public Coupon getByCouponRate(String couponRate);
    public List<Coupon> getByCouponCategory(String couponCategory);
    public List<Coupon> getByCouponStore(String couponStore);
}

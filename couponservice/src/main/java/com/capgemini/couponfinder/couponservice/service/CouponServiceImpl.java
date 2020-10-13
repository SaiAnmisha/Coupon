package com.capgemini.couponfinder.couponservice.service;

import com.capgemini.couponfinder.couponservice.domain.Coupon;
import com.capgemini.couponfinder.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService{
    @Autowired
    private CouponRepository couponsRepository;

    @Override
    public Coupon saveCoupon(Coupon coupon) {

        Coupon saveCoupon= couponsRepository.save(coupon);
        return saveCoupon;
    }

    @Override
    public List<Coupon> getallCoupons() {
        List<Coupon> couponsList=(List<Coupon>) couponsRepository.findAll();
        return couponsList;
    }

    @Override
    public boolean deleteCoupon(String couponId) {

        if(couponsRepository.existsById(couponId)) {
            couponsRepository.deleteById(couponId);
            return true;
        }
        else
            return false;
    }

    @Override
    public Coupon getByCouponName(String couponName) {

        return couponsRepository.getByCouponName(couponName);
    }

    @Override
    public Coupon getByCouponCode(String couponCode) {

        return couponsRepository.getByCouponCode(couponCode);
    }

    @Override
    public Coupon getByCouponRate(String couponRate) {

        return couponsRepository.getByCouponRate(couponRate);
    }

    @Override
    public List<Coupon> getByCouponCategory(String couponCategory) {
        return couponsRepository.getByCouponCategory(couponCategory);
    }

    @Override
    public List<Coupon> getByCouponStore(String couponStore) {
        return couponsRepository.getByCouponStore((couponStore));
    }
}

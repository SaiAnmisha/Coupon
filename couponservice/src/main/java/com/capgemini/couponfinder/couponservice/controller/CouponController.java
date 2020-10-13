package com.capgemini.couponfinder.couponservice.controller;

import com.capgemini.couponfinder.couponservice.domain.Coupon;
import com.capgemini.couponfinder.couponservice.exception.CouponNotFoundException;
import com.capgemini.couponfinder.couponservice.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("api")
public class CouponController {
    @Autowired
    private CouponService couponsService;

    @RequestMapping(value = "/coupon", method = RequestMethod.POST)
    public ResponseEntity<?> saveCoupons(@RequestBody Coupon coupon) {
        couponsService.saveCoupon(coupon);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @GetMapping(value = "/coupons")
    public ResponseEntity<List<Coupon>> getallCoupons() {
        List<Coupon> listCoupons = couponsService.getallCoupons();
        return new ResponseEntity<List<Coupon>>(listCoupons, HttpStatus.OK);
    }

    @RequestMapping(value = "/coupon/{couponId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCoupon(@PathVariable String couponId){

        boolean flag = couponsService.deleteCoupon(couponId);
        if (flag) {

            return new ResponseEntity<String>("{ \"message\": \"" + "deleted" + "\"}", HttpStatus.OK);
        } else{
            throw new CouponNotFoundException("Coupon not found in this database");
        }

    }

    @RequestMapping(value = "/coupon/name", method = RequestMethod.GET)
    public ResponseEntity<?> getByName(@RequestParam String couponName) {

        Coupon coupon =couponsService.getByCouponName(couponName);

        return new ResponseEntity<Coupon>(coupon, HttpStatus.OK);

    }

    @RequestMapping(value = "/coupon/code", method = RequestMethod.GET)
    public ResponseEntity<?> getByCouponCode(@RequestParam String couponCode) {

        Coupon coupon =couponsService.getByCouponCode(couponCode);

        return new ResponseEntity<Coupon>(coupon, HttpStatus.OK);

    }

    @RequestMapping(value = "/coupon/rate", method = RequestMethod.GET)
    public ResponseEntity<?> getByCouponRate(@RequestParam String couponRate) {

        Coupon coupon =couponsService.getByCouponRate(couponRate);

        return new ResponseEntity<Coupon>(coupon, HttpStatus.OK);

    }

    @RequestMapping(value = "/coupon/store", method = RequestMethod.GET)
    public ResponseEntity<?> getByCouponstore(@RequestParam String couponStore) {

         List<Coupon> listCoupons =couponsService.getByCouponStore(couponStore);

        return new ResponseEntity<List<Coupon>>(listCoupons, HttpStatus.OK);

    }

    @RequestMapping(value = "/coupon/category", method = RequestMethod.GET)
    public ResponseEntity<?> getByCouponcategory(@RequestParam String couponCategory) {

        List<Coupon> listCoupons =couponsService.getByCouponCategory(couponCategory);

        return new ResponseEntity<List<Coupon>>(listCoupons, HttpStatus.OK);

    }
}

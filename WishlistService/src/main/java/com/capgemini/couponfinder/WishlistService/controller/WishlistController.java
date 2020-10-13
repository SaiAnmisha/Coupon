package com.capgemini.couponfinder.WishlistService.controller;

import com.capgemini.couponfinder.WishlistService.domain.Wishlist;
import com.capgemini.couponfinder.WishlistService.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("api")
public class WishlistController {
    @Autowired
    private WishlistService wishlistService;

    @RequestMapping(value ="/addwishlist", method = RequestMethod.POST)
    public ResponseEntity<Wishlist> saveWishlistCoupon(@RequestBody Wishlist wishlist){
        wishlistService.addWishlistcoupons(wishlist);

        return new ResponseEntity<Wishlist>(HttpStatus.OK);
    }

    @GetMapping("/mywishlist/{username}")
    public ResponseEntity<Wishlist> showWishlist(@PathVariable String username){
        Wishlist wishlist= wishlistService.findWislistByUsername(username);
        return new ResponseEntity<Wishlist>(wishlist, HttpStatus.OK);

    }
}

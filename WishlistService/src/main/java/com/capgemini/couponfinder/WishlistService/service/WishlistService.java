package com.capgemini.couponfinder.WishlistService.service;

import com.capgemini.couponfinder.WishlistService.domain.Wishlist;
import org.springframework.stereotype.Service;

@Service
public interface WishlistService {
    Wishlist addWishlistcoupons(Wishlist wishlist);

    Wishlist findWislistByUsername(String username);
}

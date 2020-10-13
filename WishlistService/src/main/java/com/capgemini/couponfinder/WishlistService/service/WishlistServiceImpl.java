package com.capgemini.couponfinder.WishlistService.service;

import com.capgemini.couponfinder.WishlistService.domain.Wishlist;
import com.capgemini.couponfinder.WishlistService.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistServiceImpl implements WishlistService {
    @Autowired
    private WishlistRepository wishlistRepository;

    @Override
    public Wishlist addWishlistcoupons(Wishlist wishlist) {
        return wishlistRepository.save(wishlist);
    }

    @Override
    public Wishlist findWislistByUsername(String Username) {
        return wishlistRepository.findByUsername(Username);
    }
}
package com.capgemini.couponfinder.WishlistService.repository;

import com.capgemini.couponfinder.WishlistService.domain.Wishlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends MongoRepository<Wishlist, String> {
    Wishlist findByUsername(String Username);
}

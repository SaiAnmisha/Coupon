package com.capgemini.couponfinder.PaymentService.repository;

import com.capgemini.couponfinder.PaymentService.domain.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {
    public Payment findByEmail(String email);
}

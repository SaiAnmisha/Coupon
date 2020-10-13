package com.capgemini.couponfinder.PaymentService.service;

import com.capgemini.couponfinder.PaymentService.domain.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaymentService {
    public Payment addPaymentDetails(Payment payment);

    public Payment findByEmail(String email);

    public List<Payment> findALLPaymentDetails(String email);

    public Payment updatePaymentDetails(Payment payment);
}

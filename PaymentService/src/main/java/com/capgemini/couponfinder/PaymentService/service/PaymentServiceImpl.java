package com.capgemini.couponfinder.PaymentService.service;

import com.capgemini.couponfinder.PaymentService.domain.Payment;
import com.capgemini.couponfinder.PaymentService.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment addPaymentDetails(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment findByEmail(String payment) {

        return paymentRepository.findByEmail(payment);
    }

    @Override
    public List<Payment> findALLPaymentDetails(String email) {

        return paymentRepository.findAll();
    }

    @Override
    public Payment updatePaymentDetails(Payment payment) {
        return paymentRepository.save(payment);
    }
}

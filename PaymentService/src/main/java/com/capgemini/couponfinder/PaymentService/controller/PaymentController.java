package com.capgemini.couponfinder.PaymentService.controller;

import com.capgemini.couponfinder.PaymentService.domain.Payment;
import com.capgemini.couponfinder.PaymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("api")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<Payment> processPayment(@RequestBody Payment payment) {

        Payment newPayment = paymentService.addPaymentDetails(payment);

        return new ResponseEntity<Payment>(newPayment, HttpStatus.OK);

    }

    @GetMapping("/mypayments/{email}")
    public ResponseEntity<Payment> myPayments(@PathVariable String email) {

        Payment status = paymentService.findByEmail(email);
        if (status == null) {

            return new ResponseEntity<Payment>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Payment>(status, HttpStatus.OK);
    }
}

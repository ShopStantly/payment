package com.webshop.WebShopstantly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Integer getBalance() {
        List<User> balance = paymentRepository.findAll();
        User user = balance.isEmpty() ? new User() : balance.get(0);

        //deducts loyaltyPoints by 1
        user.deductLoyaltyPoints();

        return user.getBalance();
    }

    public User getUser() {
        List<User> users = paymentRepository.findAll();
        return users.isEmpty() ? new User() : users.get(0);
    }

    public void saveUser() {
        User user = new User();
        user.setBalance(12);
        user.setName("Hans");
        paymentRepository.save(user);
    }

}

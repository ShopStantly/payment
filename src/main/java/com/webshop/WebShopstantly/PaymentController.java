package com.webshop.WebShopstantly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(path = "balance", method = RequestMethod.GET)
    public Integer checkBalanceForUser() {
        return paymentService.getBalance();
    }

    @RequestMapping(path = "user", method = RequestMethod.GET)
    public User getUser() {
        return paymentService.getUser();
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String asd() {
        paymentService.saveUser();
        return "124";
    }

}

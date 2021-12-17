package com.ls.demo.controller;

import com.ls.demo.model.Order;
import com.ls.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Order create(@RequestBody Order newOrder) {
        return orderRepository.save(newOrder);
    }
}

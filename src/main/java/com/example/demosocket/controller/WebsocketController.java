package com.example.demosocket.controller;

import com.example.demosocket.model.Product;
import com.example.demosocket.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class WebsocketController {
    @Autowired
    private IProductService productService;

    @MessageMapping("/products")
    @SendTo("/topic/products")
    public Product createNewProductUsingSocket(Product product) {
        return productService.save(product);
    }
}

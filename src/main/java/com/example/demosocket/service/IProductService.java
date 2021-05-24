package com.example.demosocket.service;

import com.example.demosocket.model.Product;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findAll(int page, int size);
}

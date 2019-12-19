package com.ensak.productManager.service;

import com.ensak.productManager.dao.ProductDao;
import com.ensak.productManager.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductDao productDao;


    public List<Product> getProducts() {

        return productDao.getProducts();
    }
}

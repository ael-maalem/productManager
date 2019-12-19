package com.ensak.productManager.controller;

import com.ensak.productManager.domain.Product;
import com.ensak.productManager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/listproducts", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return productService.getProducts();
    }

}

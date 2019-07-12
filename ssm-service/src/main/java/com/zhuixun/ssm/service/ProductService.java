package com.zhuixun.ssm.service;

import com.zhuixun.ssm.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll() throws Exception;
}

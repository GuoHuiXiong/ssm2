package com.zhuixun.ssm.service.impl;

import com.zhuixun.ssm.dao.ProductDao;
import com.zhuixun.ssm.entity.Product;
import com.zhuixun.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception{
        return productDao.findAll();
    }
}

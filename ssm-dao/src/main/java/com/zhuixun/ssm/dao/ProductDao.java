package com.zhuixun.ssm.dao;

import com.zhuixun.ssm.entity.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    /**
     * 查询所有的商品
     */
    @Select("select * from product")
     List<Product> findAll() throws Exception;
}

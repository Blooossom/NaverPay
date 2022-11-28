package org.example.overview.members.dao;

import org.example.overview.members.entity.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> selectAll(String uId);
    Product select(String uId);
    List<Product> selectDate(String uId, String start, String end);
    int insert(Product product);
    int delete(String uId);
    int deleteAll(String uId);
}

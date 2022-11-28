package org.example.overview.members.service;

import org.example.overview.members.dto.ProductDTO;
import org.example.overview.members.entity.Product;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getProductListByDate(String uId, String start, String end);
    ProductDTO getProductByOrderNo(String oId);
    List<ProductDTO> getAllProducts(String uId);
    boolean removeProductByOrderNo(String oId);
    boolean removeProducts(String uId);
}

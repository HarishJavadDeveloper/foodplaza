package com.dao;

import java.util.List;

import com.dto.ProductDTO;

public interface ProductDao {
	boolean saveProduct(ProductDTO product);
	boolean updateProduct(ProductDTO product);
	boolean deleteProduct(ProductDTO product);
//	ProductDTO searchProduct();
	ProductDTO searchProduct(String productName);
	List<ProductDTO> showAllProduct();
}
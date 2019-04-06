package pl.n2God.springmvcfirst.services;

import pl.n2God.springmvcfirst.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveOrUpdateProduct(Product product);

    void deleteProduct(Integer id);
}

package pl.n2God.springmvcfirst.repo;


import org.springframework.data.repository.CrudRepository;
import pl.n2God.springmvcfirst.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

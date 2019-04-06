package pl.n2God.springmvcfirst.repo;

import org.springframework.data.repository.CrudRepository;
import pl.n2God.springmvcfirst.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}

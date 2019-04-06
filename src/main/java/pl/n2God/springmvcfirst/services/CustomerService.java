package pl.n2God.springmvcfirst.services;

import pl.n2God.springmvcfirst.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer saveOrUpdateCustomer(Customer customer);

    void deleteCustomer(Integer id);
}

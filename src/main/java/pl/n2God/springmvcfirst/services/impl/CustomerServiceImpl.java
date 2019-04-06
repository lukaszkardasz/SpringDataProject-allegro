package pl.n2God.springmvcfirst.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.n2God.springmvcfirst.domain.Customer;
import pl.n2God.springmvcfirst.repo.CustomerRepository;
import pl.n2God.springmvcfirst.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {
    private Map<Integer, Customer> customers;

    @Autowired
    private CustomerRepository repository;

    public CustomerServiceImpl() {
        //customers = new HashMap<>();
        //loadCustomers();
    }

//    private void loadCustomers() {
//        for(int i = 1; i< 6; i++){
//            Customer c = new Customer();
//            c.setId(i);
//            c.setFirstName("Adam" + i);
//            c.setLastName("Nowak" + i);
//            c.setPhoneNumber("48 555 999 00" + i);
//            c.setEmail("AdamNowak@"+i+".com");
//            c.setAddressLineOne("Street " + i);
//            c.setAddressLineTwo("Flat " + i);
//            c.setCity("Krakow");
//            c.setZipCode("00-999");
//            c.setState("Main");
//            customers.put(i, c);
//        }
//    }


    @Override
    public List<Customer> listAllCustomers() {
//        return new ArrayList<>(customers.values());
        List<Customer> result = new LinkedList<>();
        repository.findAll().forEach(result::add);
        return result;

    }

    @Override
    public Customer getCustomerById(Integer id) {

        //return customers.get(id);
        return repository.findOne(id);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if (customer != null){
//            if (customer.getId() == null){
//                customer.setId(getNextKey());
//            }
//            customers.put(customer.getId(), customer);
            repository.save(customer);
        } else {
            throw new RuntimeException("Can't be null!!!");
        }

        return getCustomerById(customer.getId());
    }

    @Override
    public void deleteCustomer(Integer id) {
        //customers.remove(id);
        repository.delete(id);
    }


    private Integer getNextKey(){

        return Collections.max(customers.keySet()) + 1;
    }
}

package pl.n2God.springmvcfirst.controllers;

import pl.n2God.springmvcfirst.domain.Customer;
import pl.n2God.springmvcfirst.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customers")
    public String getCustomers(Model model){
        model.addAttribute("customers", customerService.listAllCustomers());
        return "customers";
    }

    @RequestMapping("/customer/{id}")
    public String getCustomerBy(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getCustomerById(id));

        return "customer";
    }

    @RequestMapping("/customer/delete/{id}")
    public String getCustomerBy(@PathVariable Integer id){
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }

    @RequestMapping("/customer/edit/{id}")
    public String editCustomer(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getCustomerById(id));

        return "customerForm";
    }

    @RequestMapping("/customer/new")
    public String newCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "customerForm";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public String saveOrUpdateCustomer(Customer customer){
        Customer newOne = customerService.saveOrUpdateCustomer(customer);
        return "redirect:/customer/" + newOne.getId();
    }
}

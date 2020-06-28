package com.Ecommerce.Ecommerce.Service;

import com.Ecommerce.Ecommerce.Dao.CustomerRepository;
import com.Ecommerce.Ecommerce.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class customerServiceImp implements CustomerService {

    private CustomerRepository customerRepository;
   @Autowired
    public customerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public customerServiceImp()
    {}
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int theId) {
        Optional<Customer> result=customerRepository.findById(theId);
        Customer customer=null;

        if(result.isPresent())
        {
            customer=result.get();
        }
        else
            throw new RuntimeException("Did not find employee id - " + theId);

        return customer;
    }

    @Override
    public void save(Customer theCustomer) {
customerRepository.save(theCustomer);
    }

    @Override
    public void deleteById(int theId) {
customerRepository.deleteById(theId);
    }
}

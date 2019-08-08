package org.del.service;

import org.del.entities.Customer;
import org.del.exceptions.CustomerNotFoundException;

public interface IService {

    void add(Customer customer);

    void remove(Customer customer);

    Customer findCustomerById(Integer id) throws CustomerNotFoundException;
}

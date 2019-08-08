package org.del.dao;

import org.del.entities.Customer;
import org.del.exceptions.CustomerNotFoundException;

public interface ICustomerDao {

    void add(Customer customer);

    void remove(Customer customer);

    Customer findCustomerById(Integer id) throws CustomerNotFoundException;
}

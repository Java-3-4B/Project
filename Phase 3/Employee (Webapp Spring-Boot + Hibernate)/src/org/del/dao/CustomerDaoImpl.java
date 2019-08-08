package org.del.dao;

import org.del.entities.Customer;
import org.del.exceptions.CustomerNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class CustomerDaoImpl implements ICustomerDao {
    private Map<Integer, Customer> map = new HashMap<>();

    @Override
    public void add(Customer customer) {
        map.put(customer.getId(), customer);
    }

    @Override
    public void remove(Customer customer) {
        map.remove(customer.getId());
    }

    @Override
    public Customer findCustomerById(Integer id) throws CustomerNotFoundException{
        Customer customer = map.get(id);
        if(customer==null){
            throw new CustomerNotFoundException("Customer not found for id="+id);
        }
        return customer;
    }
}









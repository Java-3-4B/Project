package org.del.service;

import org.del.dao.ICustomerDao;
import org.del.entities.Customer;
import org.del.exceptions.CustomerNotFoundException;
import org.del.exceptions.IncorrectIdException;

public class ServiceImpl implements IService {

    private ICustomerDao dao;

    public ServiceImpl(ICustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(Customer customer) {
        dao.add(customer);
    }

    @Override
    public void remove(Customer customer) {
        dao.remove(customer);
    }

    @Override
    public Customer findCustomerById(Integer id) throws CustomerNotFoundException {
        if(id==null||id.intValue()<0){
         throw new IncorrectIdException("id can't be null or smaller than 0");
        }
        Customer customer = dao.findCustomerById(id);
        return customer;
    }
}










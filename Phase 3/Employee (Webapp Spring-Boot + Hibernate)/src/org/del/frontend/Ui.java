package org.del.frontend;

import org.del.dao.CustomerDaoImpl;
import org.del.dao.ICustomerDao;
import org.del.entities.Customer;
import org.del.exceptions.CustomerNotFoundException;
import org.del.service.IService;
import org.del.service.ServiceImpl;

public class Ui {
    IService service = new ServiceImpl(new CustomerDaoImpl());

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.runUi();
    }

    public void runUi() {
        Customer customer = new Customer(1, "abhishek");
        addCustomer(customer);
        displayUserById(-1);
    }

    public void addCustomer(Customer customer) {
        service.add(customer);
        System.out.println("customer added successfully");
    }


    public void displayUserById(int id) {
        try {
            Customer fetched = service.findCustomerById(id);
            System.out.println("customer=" + fetched.getId() + " name=" + fetched.getName());
        } catch (CustomerNotFoundException e) {
            System.out.println("customer not found for id=" + id);
        }
        catch (Throwable e){
            System.out.println("something went wrong, couldn't fetch for id="+id);
        }
    }
}

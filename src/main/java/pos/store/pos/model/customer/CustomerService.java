package pos.store.pos.model.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class CustomerService { 
    @Autowired 
    CustomerRest customer;

    public Iterable<Customer> findAll(){
        return customer.findAll();
    }

    public boolean addCustomer(Customer from){
        try{
            Customer y = new Customer();
            y.setCname(from.getCname());
            y.setEmail(from.getEmail());
            y.setPhone(from.getPhone());
            y.setLine(from.getLine());
            y.setPiont(from.getPiont());
            
            System.out.println(y);
            customer.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }

    public boolean updateCustomer(Customer from){
     try{
        var y = customer.findById(from.getId()).get();
        y.setCname(from.getCname());
        y.setEmail(from.getEmail());
        y.setPhone(from.getPhone());
        y.setLine(from.getLine());
        y.setPiont(from.getPiont());

        customer.save(y);
        return true;
    }catch(Exception e){
            e.printStackTrace();
            return false;
        }    
    }

    public boolean delCustomer(int id){
        try{
           customer.deleteById(id);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
}
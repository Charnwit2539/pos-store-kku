package pos.store.pos.model.bills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillsService { 
    @Autowired 
    BillsRest bills;

    public Iterable<Bills> findAll(){
        return bills.findAll();
    }

    public boolean addBills(Bills from){
        try{
            Bills y = new Bills();
            y.setCustomer_id(from.getCustomer_id());
            y.setBill_data(from.getBill_data());
            
            System.out.println(y);
            bills.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
   
}
// y.setTotal_munber(from.getTotal_munber());
            // y.setTotal_price(from.getTotal_price());
            // y.setReceive_money(from.getReceive_money());
            // y.setChange_money(from.getChange_money());
            // y.setGet_points(from.getGet_points());
            // y.setUsed_points(from.getUsed_points());
            // y.setRemaining_points(from.getRemaining_points());
            // y.setCustomer_email(from.getCustomer_email());
            // y.setCustomer_name(from.getCustomer_name());
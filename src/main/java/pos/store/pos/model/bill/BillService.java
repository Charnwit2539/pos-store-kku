package pos.store.pos.model.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService { 
    @Autowired 
    BillRest bill;

    public Iterable<Bill> findAll(){
        return bill.findAll();
    }

    public boolean addBill(Bill from){
        try{
            Bill y = new Bill();
            y.setBill_id(from.getBill_id());
            y.setProduct_name(from.getProduct_name());
            y.setProduct_number(from.getProduct_number());
            y.setProduct_price(from.getProduct_price());
            y.setPromotion_name(from.getPromotion_name());
            System.out.println(y);
            bill.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
   
}
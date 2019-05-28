package pos.store.pos.model.bill;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Bill{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int bill_id;
    private String product_name;
    private String product_number;
    private String product_price;
    private String promotion_name;
}
package pos.store.pos.model.bills;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Bills{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bill_id;
    private int customer_id;
    private String bill_data;

    @Basic(optional = false)
    @Column(name = "date_time", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_time;
   
}
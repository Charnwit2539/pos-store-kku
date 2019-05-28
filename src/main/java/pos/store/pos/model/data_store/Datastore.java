package pos.store.pos.model.data_store;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Datastore{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name_data;
    private String address_data;
    private String phone_data;
    private String line_data;
    private String facebook_data;
}
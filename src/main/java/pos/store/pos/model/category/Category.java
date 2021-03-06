package pos.store.pos.model.category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Category{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name_category;
    private int reward_point_id;

}
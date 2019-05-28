package pos.store.pos.model.reward;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Reward{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int score;
    private int point;
}
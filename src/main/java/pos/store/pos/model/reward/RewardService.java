package pos.store.pos.model.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class RewardService { 
    @Autowired 
    RewardRest reward;

    public Iterable<Reward> findAll(){
        return reward.findAll();
    }

    public boolean addReward(Reward from){
        try{
            Reward y = new Reward();
            y.setScore(from.getScore());
            y.setPoint(from.getPoint());

            
            System.out.println(y);
            reward.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateReward(Reward from){
        try{
           var y = reward.findById(from.getId()).get();
            y.setScore(from.getScore());
            y.setPoint(from.getPoint());
   
            reward.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delReward(int id){
           try{
            reward.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}
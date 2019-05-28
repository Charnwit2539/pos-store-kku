package pos.store.pos.model.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PromotionService { 
    @Autowired 
    PromotionRest promotion;

    public Iterable<Promotion> findAll(){
        return promotion.findAll();
    }

    public boolean addPromotion(Promotion from){
        try{
            Promotion y = new Promotion();
            y.setName_promotion(from.getName_promotion());
            y.setScore_promotion(from.getScore_promotion());
            
            System.out.println(y);
            promotion.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePromotion(Promotion from){
        try{
           var y = promotion.findById(from.getId()).get();
           y.setName_promotion(from.getName_promotion());
           y.setScore_promotion(from.getScore_promotion());
   
           promotion.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPromotion(int id){
           try{
            promotion.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}
package pos.store.pos.model.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class CategoryService { 
    @Autowired 
    CategoryRest category;

    public Iterable<Category> findAll(){
        return category.findAll();
    }

    public boolean addCategory(Category from){
        try{
            Category y = new Category();
            y.setName_category(from.getName_category());
            y.setReward_point_id(from.getReward_point_id());

            System.out.println(y);
            category.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateCategory(Category from){
        try{
           var y = category.findById(from.getId()).get();
            y.setName_category(from.getName_category());
            y.setReward_point_id(from.getReward_point_id());
   
            category.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delCategory(int id){
           try{
            category.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}
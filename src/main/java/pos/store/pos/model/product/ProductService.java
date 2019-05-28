package pos.store.pos.model.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class ProductService { 
    @Autowired 
    ProductRest product;

    public Iterable<Product> findAll(){
        return product.findAll();
    }

    public boolean addProduct(Product from){
        try{
            Product y = new Product();
            y.setName_product(from.getName_product());
            y.setCategory_id(from.getCategory_id());
            y.setPrice_product(from.getPrice_product());
            
            System.out.println(y);
            product.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateProduct(Product from){
        try{
           var y = product.findById(from.getId()).get();
           y.setName_product(from.getName_product());
           y.setCategory_id(from.getCategory_id());
           y.setPrice_product(from.getPrice_product());
   
            product.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delProduct(int id){
           try{
            product.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}
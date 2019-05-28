package pos.store.pos.model.data_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class DatastoreService { 
    @Autowired 
    DatastoreRest datastore;

    public Iterable<Datastore> findAll(){
        return datastore.findAll();
    }

    public boolean addDatastore(Datastore from){
        try{
            Datastore y = new Datastore();
            y.setName_data(from.getName_data());
            y.setAddress_data(from.getAddress_data());
            y.setPhone_data(from.getPhone_data());
            y.setLine_data(from.getLine_data());
            y.setFacebook_data(from.getFacebook_data());
          
            
            System.out.println(y);
            datastore.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateDatastore(Datastore from){
        try{
           var y = datastore.findById(from.getId()).get();
           y.setName_data(from.getName_data());
            y.setAddress_data(from.getAddress_data());
            y.setPhone_data(from.getPhone_data());
            y.setLine_data(from.getLine_data());
            y.setFacebook_data(from.getFacebook_data());
   
           datastore.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
}
package pos.store.pos.model.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService { 
    @Autowired 
    UserRest user;

    public Iterable<User> findAll(){
        return user.findAll();
    }

    public boolean createUser(User from){
        try{
            User y = new User();
            y.setU_name(from.getU_name());
            y.setU_email(from.getU_email());
            y.setU_pass(from.getU_pass());
            y.setUser_type_id(2);

            user.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
}
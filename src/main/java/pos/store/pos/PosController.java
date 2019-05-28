package pos.store.pos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pos.store.pos.model.users.User;
import pos.store.pos.model.users.UserService;
import pos.store.pos.model.bill.Bill;
import pos.store.pos.model.bill.BillService;
import pos.store.pos.model.bills.Bills;
import pos.store.pos.model.bills.BillsService;
import pos.store.pos.model.category.Category;
import pos.store.pos.model.category.CategoryService;
import pos.store.pos.model.customer.Customer;
import pos.store.pos.model.customer.CustomerService;
import pos.store.pos.model.data_store.Datastore;
import pos.store.pos.model.data_store.DatastoreService;
import pos.store.pos.model.product.Product;
import pos.store.pos.model.product.ProductService;
import pos.store.pos.model.promotion.Promotion;
import pos.store.pos.model.promotion.PromotionService;
import pos.store.pos.model.reward.Reward;
import pos.store.pos.model.reward.RewardService;;

@CrossOrigin
@RestController
public class PosController {

    @Autowired
    private UserService user;

    @Autowired
    private CategoryService category;

    @Autowired
    private DatastoreService datastore;

    @Autowired
    private ProductService product;

    @Autowired
    private PromotionService promotion;

    @Autowired
    private CustomerService customer;

    @Autowired
    private RewardService reward;

    @Autowired
    private BillService bill;

    @Autowired
    private BillsService bills;

    @GetMapping(value="/Register")
    public Iterable<User> index(){
        return user.findAll();
    }
    @PostMapping(value="/createUser")
    public ResponseEntity<Boolean> createUser(@RequestBody User model){
        return new ResponseEntity<Boolean>(user.createUser(model),HttpStatus.OK);
    }

    //Category
    @GetMapping(value = "/Category")
    public Iterable<Category> category(){
        return category.findAll();
    }
    @PostMapping(value="/addCategory")
    public ResponseEntity<Boolean> addCategory(@RequestBody Category model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(category.addCategory(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateCategory")
    public ResponseEntity<Boolean> updateCategory(@RequestBody Category model){
        return new ResponseEntity<Boolean>(category.updateCategory(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delCategory/{id}")
    public ResponseEntity<Boolean> delCategory(@PathVariable int id){
        return new ResponseEntity<Boolean>(category.delCategory(id),HttpStatus.OK);
    } 

    //Datastore
    @GetMapping(value = "/Datastore")
    public Iterable<Datastore> datastore() {
        return datastore.findAll();
    }
    @PostMapping(value="/addDatastore")
    public ResponseEntity<Boolean> addDatastore(@RequestBody Datastore model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(datastore.addDatastore(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateDatastore")
    public ResponseEntity<Boolean> updateDatastore(@RequestBody Datastore model){
        return new ResponseEntity<Boolean>(datastore.updateDatastore(model),HttpStatus.OK);
    }

    //Product
    @GetMapping(value = "/Product")
    public Iterable<Product> product() {
        return product.findAll();
    }
    @PostMapping(value="/addProduct")
    public ResponseEntity<Boolean> addProduct(@RequestBody Product model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(product.addProduct(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateProduct")
    public ResponseEntity<Boolean> updateProduct(@RequestBody Product model){
        return new ResponseEntity<Boolean>(product.updateProduct(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delProduct/{id}")
    public ResponseEntity<Boolean> delProduct(@PathVariable int id){
        return new ResponseEntity<Boolean>(product.delProduct(id),HttpStatus.OK);
    } 

    //Promotion
    @GetMapping(value = "/Promotion")
    public Iterable<Promotion> promotion() {
        return promotion.findAll();
    }
    @PostMapping(value="/addPromotion")
    public ResponseEntity<Boolean> addPromotion(@RequestBody Promotion model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(promotion.addPromotion(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePromotion")
    public ResponseEntity<Boolean> updatePromotion(@RequestBody Promotion model){
        return new ResponseEntity<Boolean>(promotion.updatePromotion(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPromotion/{id}")
    public ResponseEntity<Boolean> delPromotion(@PathVariable int id){
        return new ResponseEntity<Boolean>(promotion.delPromotion(id),HttpStatus.OK);
    } 

    //Customer
    @GetMapping(value = "/Customer")
    public Iterable<Customer> customer() {
        return customer.findAll();
    }
    @PostMapping(value="/addCustomer")
    public ResponseEntity<Boolean> addCustomer(@RequestBody Customer model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(customer.addCustomer(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateCustomer")
    public ResponseEntity<Boolean> updateCustomer(@RequestBody Customer model){
        return new ResponseEntity<Boolean>(customer.updateCustomer(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delCustomer/{id}")
    public ResponseEntity<Boolean> delCustomer(@PathVariable int id){
        return new ResponseEntity<Boolean>(customer.delCustomer(id),HttpStatus.OK);
    }

    //Reward
    @GetMapping(value ="/Reward")
    public Iterable<Reward> reward() {
        return reward.findAll();
    }
    @PostMapping(value="/addReward")
    public ResponseEntity<Boolean> addReward(@RequestBody Reward model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(reward.addReward(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateReward")
    public ResponseEntity<Boolean> updateReward(@RequestBody Reward model){
        return new ResponseEntity<Boolean>(reward.updateReward(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delReward/{id}")
    public ResponseEntity<Boolean> delReward(@PathVariable int id){
        return new ResponseEntity<Boolean>(reward.delReward(id),HttpStatus.OK);
    }

    //Customer
    @GetMapping(value = "/Bill")
    public Iterable<Bill> bill() {
        return bill.findAll();
    }
    @PostMapping(value="/addBill")
    public ResponseEntity<Boolean> addBill(@RequestBody Bill model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(bill.addBill(model),HttpStatus.OK);
    }

    @GetMapping(value = "/Bills")
    public Iterable<Bills> bills() {
        return bills.findAll();
    }
    @PostMapping(value="/addBills")
    public ResponseEntity<Boolean> addBills(@RequestBody Bills model){
        System.out.println(model);
        return new ResponseEntity<Boolean>(bills.addBills(model),HttpStatus.OK);
    }

    
}

package restapi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Rest {
    @Autowired
    private RestaurantRepository repository;

//    @RequestMapping(method = RequestMethod.GET, value = "/home")
//    public String home(){
//        return "home";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Restaurants> getAllPets() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Restaurants getRestaurantById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyRestaurantById(@PathVariable("id") ObjectId id, @Valid @RequestBody Restaurants restaurant){
        restaurant.setID(id);
        repository.save(restaurant);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Restaurants createRestaurant(@Valid @RequestBody Restaurants restaurant) {
        restaurant.setID(ObjectId.get());
        repository.save(restaurant);
        return restaurant;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRestaurant(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}

package restapi;

import restapi.Restaurants;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<Restaurants, String> {
    Restaurants findBy_id(ObjectId _id);
}



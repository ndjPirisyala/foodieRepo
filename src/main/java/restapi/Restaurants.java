package restapi;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Restaurants {
    @Id
    public ObjectId _id;

    public String name;
    public String address;

    public Restaurants(){}

    public Restaurants(ObjectId _id, String name, String address){
        this._id = _id;
        this.name = name;
        this.address = address;
    }

    public String getID(){
        return _id.toString();
    }

    public void setID(ObjectId _id){
        this._id = _id;
    }

    public String getName(){
        return name;
    }

    public void setID(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }



}

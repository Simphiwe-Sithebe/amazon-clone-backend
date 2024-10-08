package com.example.usermetadata.Service;

import com.example.usermetadata.Entity.UserMetaData;
import org.springframework.stereotype.Service;

//Services are responsible for handling all the business logic
@Service
public class UserService {

    //submit data into db
    public UserMetaData saveUserMetaDataTODB(UserMetaData metaData){
       return new UserMetaData();
    }

    //retrieve data
    public  UserMetaData getUserDetailsFromDB(String userId){
        return new UserMetaData();
    }
}

package com.example.usermetadata.Service;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Services are responsible for handling all the business logic
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    //submit data into db
    public UserMetaData saveUserMetaDataTODB(UserMetaData metaData){
       return userRepo.save(metaData);
    }

    //retrieve data
    public  UserMetaData getUserDetailsFromDB(String userId){
        return userRepo.findAllByuniqueId(userId);
    }
}

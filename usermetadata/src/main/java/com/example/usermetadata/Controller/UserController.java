package com.example.usermetadata.Controller;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/amazon/user/")
//when user request this url, traffic is redirected to this controller.
//Start point
public class UserController {

    //Creates an object of our service so that the business logic can come into play
    @Autowired
    UserService userService;


    @PostMapping("saveUserDetails")
    //payload is called a request body, it comes from the front end
    public UserMetaData saveUserDetails(@RequestBody UserMetaData userData){
       UserMetaData user = userService.saveUserMetaDataTODB(userData);
        return user;
    }

    //all user details that match userId will be sent to front end in form of json
    @GetMapping("getUserDetails/{userId}")
    public UserMetaData getUserDetails(@PathVariable String userId){
        return userService.getUserDetailsFromDB(userId);
    }
}

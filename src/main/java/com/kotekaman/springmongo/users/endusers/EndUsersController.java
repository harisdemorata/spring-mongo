package com.kotekaman.springmongo.users.endusers;

import com.kotekaman.springmongo.exception.ApiRequestException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/endUsers")
@AllArgsConstructor
public class EndUsersController {
    @Autowired
    private final EndUsersServices endUsersServices;

    @GetMapping
    public List<EndUser> getAllEndUsers(){
        return endUsersServices.getAllEndUsers();
    }

    @PostMapping
    public  void addEndUsers(@RequestBody EndUser endUsers) throws IllegalAccessException {
        Boolean success = endUsersServices.addEndUsers(endUsers);
        if (!success){
            throw new ApiRequestException("email already used");
        }
    }



}

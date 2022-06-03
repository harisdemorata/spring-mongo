package com.kotekaman.springmongo.users.endusers;

import com.kotekaman.springmongo.exception.ApiRequestException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public  void addEndUsers(@Valid  @RequestBody EndUser endUsers)  {
        endUsersServices.addEndUsers(endUsers);
    }

    @PutMapping
    public  void updateEndUsers(@Valid @RequestBody EndUser endUser){
        endUsersServices.updateEndUsers(endUser);
    }

    @GetMapping("/{id}")
    public EndUser getEndUsersById(@PathVariable("id") String endUsersId){
        return endUsersServices.getEndUsersById(endUsersId);
    }

    @DeleteMapping("/{id}")
    public  void deleteEndUserById(@PathVariable("id") String endUserId){
        endUsersServices.deleteEndUserById(endUserId);
    }


}

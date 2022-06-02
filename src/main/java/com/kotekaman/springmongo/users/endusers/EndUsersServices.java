package com.kotekaman.springmongo.users.endusers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.System.*;

@AllArgsConstructor
@Service
public class EndUsersServices {
    private final EndUsersRepository endUsersRepository;

    public List<EndUser> getAllEndUsers(){
        return  endUsersRepository.findAll();
    }

    public boolean addEndUsers(EndUser endUsers)  {
        String email = endUsers.getEmail();
        Boolean isEmpty = endUsersRepository.findEndUsersRepositoryByEmail(email)
                .isEmpty();

        if (isEmpty){
            endUsersRepository.insert(endUsers);
            return true;
        }else {
            return false;
        }
    }

}

package com.kotekaman.springmongo.users.endusers;


import com.kotekaman.springmongo.exception.ApiRequestException;
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

    public void addEndUsers(EndUser endUsers)  {
        String email = endUsers.getEmail();
        Boolean isEmpty = endUsersRepository.findEndUsersRepositoryByEmail(email)
                .isEmpty();

        if (!isEmpty){
            throw new ApiRequestException("email already used");
        }
        endUsersRepository.save(endUsers);
    }

}

package me.org.Api_Restful.Service;

import me.org.Api_Restful.domain.Model.User;

public interface UserService {
    User findbyId(Long id);

    User create(User userToCreate);
}

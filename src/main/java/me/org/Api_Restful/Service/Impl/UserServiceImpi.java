package me.org.Api_Restful.Service.Impl;

import jakarta.persistence.EntityNotFoundException;
import me.org.Api_Restful.Service.UserService;
import me.org.Api_Restful.domain.Model.User;
import me.org.Api_Restful.domain.Respository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpi implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findbyId(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw  new IllegalArgumentException("Estar conta ja existe!");
        }
        return userRepository.save(userToCreate);
    }
}

package com.example.devops.service;

import com.example.devops.dto.UserDTO;
import com.example.devops.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO createUser(UserDTO userDTO) {
        userRepository.save(userDTO);
        return userDTO;
    }

    public UserDTO getUserById(Long id) {
        Optional<UserDTO> optionalUserDTO = userRepository.findById(id);
        return optionalUserDTO.orElse(null);
    }
}

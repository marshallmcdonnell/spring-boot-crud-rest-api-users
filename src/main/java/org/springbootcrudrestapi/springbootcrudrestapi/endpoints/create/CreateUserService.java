package org.springbootcrudrestapi.springbootcrudrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {
  @Autowired
  UserRepository repository;
  public User createNewUser(User user) {
    return repository.save(user);
  }
}

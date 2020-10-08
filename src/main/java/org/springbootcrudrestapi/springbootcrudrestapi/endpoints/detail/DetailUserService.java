package org.springbootcrudrestapi.springbootcrudrestapi;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailUserService {
  @Autowired
  UserRepository repository;

  public Optional<User> listUser(Long id) {
    Optional<User> user = repository.findById(id);
    if (!user.isPresent()) {
      throw new UserNotFoundException(id);
    } else {
      return repository.findById(id);
    }
  }
}

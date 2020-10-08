package org.springbootcrudrestapi.springbootcrudrestapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListUserService {
  @Autowired
  UserRepository repository;

  public List<User> listAllUsers() {
    return repository.findAll();
  }
}

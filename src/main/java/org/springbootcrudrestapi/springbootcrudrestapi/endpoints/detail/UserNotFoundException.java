package org.springbootcrudrestapi.springbootcrudrestapi;

import java.lang.RuntimeException;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(Long id) {
    super("Could not find user with id " + id + ".");
  }
}

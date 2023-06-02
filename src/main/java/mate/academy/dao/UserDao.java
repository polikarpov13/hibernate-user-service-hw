package mate.academy.dao;

import mate.academy.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> getByEmail(String email);

    List<User> getAll();
}

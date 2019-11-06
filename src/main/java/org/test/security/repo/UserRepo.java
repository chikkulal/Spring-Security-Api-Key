package org.test.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.security.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, String> {
    UserModel findByKey(String key);
}

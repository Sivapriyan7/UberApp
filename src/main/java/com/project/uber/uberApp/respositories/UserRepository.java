package com.project.uber.uberApp.respositories;

import com.project.uber.uberApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

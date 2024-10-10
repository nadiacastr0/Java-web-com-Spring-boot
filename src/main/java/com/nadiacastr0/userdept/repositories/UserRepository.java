package com.nadiacastr0.userdept.repositories;

import com.nadiacastr0.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

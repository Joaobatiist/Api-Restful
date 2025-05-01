package me.org.Api_Restful.domain.Respository;

import me.org.Api_Restful.domain.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}

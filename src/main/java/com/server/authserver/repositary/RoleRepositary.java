package com.server.authserver.repositary;
import com.server.authserver.model.ERole;
import com.server.authserver.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepositary extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole role);
}

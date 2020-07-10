package sn.mod.senegal.gatewayservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.mod.senegal.gatewayservice.modele.Role;
import sn.mod.senegal.gatewayservice.modele.RoleName;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}

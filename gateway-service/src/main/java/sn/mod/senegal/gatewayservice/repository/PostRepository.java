package sn.mod.senegal.gatewayservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.mod.senegal.gatewayservice.modele.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}

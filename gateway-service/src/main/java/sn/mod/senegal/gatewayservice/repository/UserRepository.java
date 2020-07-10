package sn.mod.senegal.gatewayservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.mod.senegal.gatewayservice.modele.User;

import java.util.List;
import java.util.Optional;



//se charge de la partie manip donnée
@Repository// dis a spring cree moi un objet et renvoi le moi avec Auto...
//c une interface sans implementation
public interface UserRepository extends JpaRepository<User, Long> {
    //le nom de la fonction compte
    //ex findByLoginAndPassword et on passe login et password en param
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

    boolean existsByTelephone(String telephone);
    //requete special
  /*  @Query("SELECT u FROM User u WHERE u.login IS NULL ")
    public List<User> users();*/

 /* @Query("select u from User u where u.telephone like :x")
    public Page<User> chercher(@Param("x")String)*/

    @Query("SELECT u FROM User u WHERE u.id = :x")
    User findUserById(@Param("x") Long id);


    /*@Query("SELECT u FROM USER u WHERE u.propriete like  :x")
    User findAllByPropriete(@Param("x")String)*/
   /*@Query("SELECT u FROM User u WHERE u.partenaire = :x ")
   User findUsersByIdPartenaire(@Param("x") Long id);*/

    @Query("SELECT u FROM User u WHERE u.propriete = :x ")
    public List <User> listUsers(@Param("x")String propriete);

}

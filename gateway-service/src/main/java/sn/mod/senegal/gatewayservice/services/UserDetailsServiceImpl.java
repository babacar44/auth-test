package sn.mod.senegal.gatewayservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.mod.senegal.gatewayservice.modele.User;
import sn.mod.senegal.gatewayservice.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private User userConnect; //################# 1

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    //aller chercher le user dans la table User
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       User user = userRepository.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));
        this.userConnect= user; //################# 2
        return UserPrinciple.build(user);
    }

    public User getUserConnect(){ //##############  3
        return  userConnect;

    }
}

package sn.mod.senegal.gatewayservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import sn.mod.senegal.gatewayservice.modele.User;
import sn.mod.senegal.gatewayservice.repository.RoleRepository;
import sn.mod.senegal.gatewayservice.repository.UserRepository;
import sn.mod.senegal.gatewayservice.services.UserDetailsServiceImpl;

import javax.validation.Valid;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/super")
public class SuperController {


    @Autowired
    private UserRepository userRepository;



    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    RoleRepository roleRepository;


    /**
     * consulter un user
     */

    @GetMapping(value = "/lister/{id}")
    public Optional<User> listerOneUser(@PathVariable Long id){
        return  userRepository.findById(id);
    }

}

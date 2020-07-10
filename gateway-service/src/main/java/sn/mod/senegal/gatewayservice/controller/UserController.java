package sn.mod.senegal.gatewayservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sn.mod.senegal.gatewayservice.repository.UserRepository;
import sn.mod.senegal.gatewayservice.services.UserDetailsServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

}

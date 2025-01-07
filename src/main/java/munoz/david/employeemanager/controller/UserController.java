package munoz.david.employeemanager.controller;

import munoz.david.employeemanager.model.User;
import munoz.david.employeemanager.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login/{userName}/{password}")
    public ResponseEntity<User> loginValidation(
            @PathVariable("userName") String userName,
            @PathVariable("password") String password){
        return userService.loginValidation(userName, password);
    }
}

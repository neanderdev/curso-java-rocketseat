package br.com.neanderdev.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    /**
     * String (texto)
     * Integer (int) números inteiros
     * Double (double) Números 0.0000
     * Float (float) Números 0.000
     * char (A C)
     * Date (data)
     * void
     */

    /**
     * Body
     */
    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) {
        var userCreated = this.userRepository.save(userModel);

        return userCreated;
    }
}

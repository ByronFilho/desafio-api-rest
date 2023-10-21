package dio.web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import dio.web.api.repository.UsuarioRepository;
import dio.web.api.model.Usuario;
import java.util.List;


@RestController
public class UsuarioController {
        @Autowired
        private UsuarioRepository repository;
        @GetMapping("/users")
        public List<Usuario> getUsers(){
            return repository.findAll();
    }

    @GetMapping("/users/{username}")
        public Usuario getOne(@PathVariable("username") String username){
            return repository.findByUsername(username);
        }

        @DeleteMapping("/users/{id}")
        public void deleteUser(@PathVariable("id") Integer id){
            repository.deleteById(id);
        }

        @PostMapping("/user")
        public void postUser(Usuario usuario){

        }
    }


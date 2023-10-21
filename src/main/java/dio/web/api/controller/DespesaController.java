package dio.web.api.controller;
   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import dio.web.api.repository.DespesaRepository;
import dio.web.api.model.Despesa;
import java.util.List;



@RestController
public class DespesaController {

        @Autowired
        private DespesaRepository repository;
        @GetMapping("/despesas")
        public List<Despesa> getUsers(){
            return repository.findAll();
    }

    @GetMapping("/despesas/{username}")
        public Despesa getOne(@PathVariable("username") String username){
            return repository.findByUsername(username);
        }

        @DeleteMapping("/despesas/{id}")
        public void deleteUser(@PathVariable("id") Integer id){
            repository.deleteById(id);
        }

        @PostMapping("/despesa")
        public void postUser(Despesa despesa){

        }
    }



package dio.web.api.repository;

import org.springframework.stereotype.Repository;
import dio.web.api.model.Despesa;

import java.util.ArrayList;
import java.util.List;

@Repository

public class DespesaRepository {
    public void save(Despesa despesa){
        if(despesa.getId() == null)
            System.out.println("SAVE - Recebendo a despesa na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo a despesa na camada de repositório");
        System.out.println(despesa);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para exclusão de usuário"));
        System.out.println(id);
    }
    public List<Despesa> findAll(){
        System.out.println("LIST - Listando as despesas do sistema");
        List<Despesa> usuarios = new ArrayList<>();
        usuarios.add(new Despesa("uber", 20.00));
        usuarios.add(new Despesa("carone", 100.00));
        return usuarios;
    }
    public Despesa findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para logar"));
        return new Despesa("uber", 20.00);
    }
    public Despesa findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username"));
        return new Despesa("uber", 20.00);
    }
}


    


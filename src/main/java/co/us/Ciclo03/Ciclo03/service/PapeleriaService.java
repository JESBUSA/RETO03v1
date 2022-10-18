package co.us.Ciclo03.Ciclo03.service;

import co.us.Ciclo03.Ciclo03.modelo.Papeleria;
import co.us.Ciclo03.Ciclo03.repository.PapeleriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PapeleriaService {
    @Autowired
    private PapeleriaRepository papeleriaRepository;
    public List<Papeleria> getAll(){
        return papeleriaRepository.getAll();
    }
    public Optional<Papeleria> getPapeleria(int id){
        return papeleriaRepository.getPapeleria(id);
    }
    public Papeleria save(Papeleria p){
        if(p.getId()==null){
            return papeleriaRepository.save(p);
        }else{
            Optional<Papeleria> paux=papeleriaRepository.getPapeleria(p.getId());
            if(paux.isEmpty()){
                return papeleriaRepository.save(p);
            }else{
                return p;
            }
        }
    }

}

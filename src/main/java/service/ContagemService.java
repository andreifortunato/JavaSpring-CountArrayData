package service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service

public class ContagemService {

        @Autowired
        private Repository ContagemRepository;

        public void salvar(String trem, String conteudo) {
            ContagemService.this.ContagemRepository.save(new Contagem(trem, conteudo));
        }

        public List<Contagem> findAll() {
            return Repository.findAll();
        }

        public long count() {
            return Repository.count();
        }

        public Contagem findById(String id) {
            return Repository.findOne(id);
        }

        public void delete(String id) {
            Repository.delete(id);
        }

    }
}

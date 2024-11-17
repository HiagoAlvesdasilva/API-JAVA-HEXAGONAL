package github.com.HiagoAlvesdasilva.acesso_api.adapter.repositories.pessoa;

import github.com.HiagoAlvesdasilva.acesso_api.adapter.entities.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}

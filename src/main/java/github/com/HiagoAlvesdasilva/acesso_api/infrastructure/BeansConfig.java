package github.com.HiagoAlvesdasilva.acesso_api.infrastructure;

import github.com.HiagoAlvesdasilva.acesso_api.core.service.UsuarioServiceImpl;
import github.com.HiagoAlvesdasilva.acesso_api.core.ports.UsuarioRepositoryPorts;
import github.com.HiagoAlvesdasilva.acesso_api.core.ports.UsuarioServicePorts;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePorts usuarioServicePortsimp(UsuarioRepositoryPorts usuarioRepositoryPorts){
        return new UsuarioServiceImpl(usuarioRepositoryPorts);
    }

}

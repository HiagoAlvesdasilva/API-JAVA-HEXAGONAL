package github.com.HiagoAlvesdasilva.acesso_api.adapter.controllers;

import github.com.HiagoAlvesdasilva.acesso_api.adapter.converter.UsuarioConverter;
import github.com.HiagoAlvesdasilva.acesso_api.adapter.dtos.UsuarioDTO;
import github.com.HiagoAlvesdasilva.acesso_api.core.ports.UsuarioServicePorts;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/usuarios")
@Tag(name = "Usuario", description = "API de usuários")
public class UsuarioController {


    private final UsuarioServicePorts usuarioServicePorts;
    private final UsuarioConverter usuarioConverter;

    public UsuarioController(UsuarioServicePorts usuarioServicePorts, UsuarioConverter usuarioConverter) {
        this.usuarioServicePorts = usuarioServicePorts;
        this.usuarioConverter = usuarioConverter;
    }

    @Operation(summary = "Criar um novo usuário")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO create(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioConverter.toDto(usuarioServicePorts.createUsuario(usuarioConverter.toTomain(usuarioDTO)));
    }

    @Operation(summary = "Buscar um usuário pelo ID")
    @GetMapping("/{usuarioId}")
    public UsuarioDTO findById(@PathVariable long usuarioId) {
        return usuarioConverter.toDto(usuarioServicePorts.findById(usuarioId));
    }

    @Operation(summary = "Atualizar um usuário")
    @PutMapping("/{usuarioId}")
    public UsuarioDTO update(@PathVariable long usuarioId, @RequestBody UsuarioDTO usuarioDTO) {
        return usuarioConverter.toDto(usuarioServicePorts.updateUsuario(usuarioId, usuarioConverter.toTomain(usuarioDTO)));
    }

    @Operation(summary = "Deletar um usuário")
    @DeleteMapping("/{usuarioId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long usuarioId) {
        usuarioServicePorts.deleteUsuario(usuarioId);
    }

}

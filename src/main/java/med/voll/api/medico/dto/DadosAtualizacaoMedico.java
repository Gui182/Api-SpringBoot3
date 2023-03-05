package med.voll.api.medico.dto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.dto.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}

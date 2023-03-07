package med.voll.api.domain.medico.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.dto.DadosEndereco;
import med.voll.api.domain.medico.Enum.Especialidade;

public record DadosCadastroMedico(

                @NotNull @NotBlank String nome,

                @NotBlank @Email String email,

                @NotBlank String telefone,

                @NotBlank(message = "{crm.obrigatorio}") @Pattern(regexp = "\\d{4,6}") String crm,

                @NotNull Especialidade especialidade,

                @NotNull @Valid DadosEndereco endereco) {
}

package med.voll.api.domain.consulta.validations;

import java.time.DayOfWeek;

import org.springframework.stereotype.Component;

import med.voll.api.domain.consulta.dto.DadosAgendamentoConsulta;
import med.voll.api.domain.exceptions.ValidacaoException;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        boolean domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        boolean antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        boolean depoisDoEcenrramentoDaClinica = dataConsulta.getHour() > 18;

        if (domingo || antesDaAberturaDaClinica || depoisDoEcenrramentoDaClinica) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clinica");
        }
    }
}

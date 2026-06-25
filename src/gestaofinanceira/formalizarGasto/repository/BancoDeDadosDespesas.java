package gestaofinanceira.formalizarGasto.repository;

import gestaofinanceira.formalizarGasto.entities.Despesa;

import java.util.Map;
import java.util.Set;

public class BancoDeDadosDespesas {
    private Set<Despesa> armazenamentoDespesasUsuario;
    private Map<Integer, Despesa> consultaDespesasUsuario;

    public BancoDeDadosDespesas() {
    }

    public BancoDeDadosDespesas(Set<Despesa> armazenamentoDespesasUsuario, Map<Integer, Despesa> consultaDespesasUsuario) {
        this.armazenamentoDespesasUsuario = armazenamentoDespesasUsuario;
        this.consultaDespesasUsuario = consultaDespesasUsuario;
    }

    public Set<Despesa> getArmazenamentoDespesasUsuario() {
        return armazenamentoDespesasUsuario;
    }

    public Map<Integer, Despesa> getConsultaDespesasUsuario() {
        return consultaDespesasUsuario;
    }
}

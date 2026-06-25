package gestaofinanceira.formalizargasto.entities;

import java.time.LocalDateTime;
import java.util.List;

public class GastoCombustivel extends Despesa {
    private Integer quantidadeDeLitros;
    private List<GastoCombustivel> gastosComCombustivel;

    public GastoCombustivel(Integer idDoGasto, String nome, Double valor, LocalDateTime data, String tipoDeGasto, Integer quantidadeDeLitros, List<GastoCombustivel> gastosComCombustivel) {
        super(idDoGasto, nome, valor, data, tipoDeGasto);
        this.quantidadeDeLitros = quantidadeDeLitros;
        this.gastosComCombustivel = gastosComCombustivel;
    }

    public Integer getQuantidadeDeLitros() {
        return quantidadeDeLitros;
    }

    public void setQuantidadeDeLitros(Integer quantidadeDeLitros) {
        this.quantidadeDeLitros = quantidadeDeLitros;
    }

    public List<GastoCombustivel> getGastosComCombustivel() {
        return gastosComCombustivel;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Qtd. de Litros Abastecidos = ").append(quantidadeDeLitros).append("\n");
        return sb.toString();
    }
}

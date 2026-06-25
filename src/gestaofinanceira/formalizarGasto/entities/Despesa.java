package gestaofinanceira.formalizarGasto.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Despesa {
    private Integer idDoGasto;
    private String nome;
    private Double valor;
    private LocalDateTime data;
    private String tipoDeGasto;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Despesa() {
    }

    public Despesa(Integer idDoGasto, String nome, Double valor, LocalDateTime data, String tipoDeGasto) {
        this.idDoGasto = idDoGasto;
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.tipoDeGasto = tipoDeGasto;
    }

    public Integer getIdDoGasto() {
        return idDoGasto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getTipoDeGasto() {
        return tipoDeGasto;
    }

    public void setTipoDeGasto(String tipoDeGasto) {
        this.tipoDeGasto = tipoDeGasto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Despesa despesa = (Despesa) o;
        return Objects.equals(idDoGasto, despesa.idDoGasto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idDoGasto);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID = ").append(idDoGasto).append("\n");
        sb.append("Nome = ").append(nome).append("\n");
        sb.append("Valor = R$").append(valor).append("\n");
        sb.append("Data = ").append(data.format(fmt)).append("\n");
        sb.append("Tipo do gasto = ").append(tipoDeGasto).append("\n");

        return sb.toString();
    }
}


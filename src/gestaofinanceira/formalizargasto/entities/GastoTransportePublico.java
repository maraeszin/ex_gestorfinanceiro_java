package gestaofinanceira.formalizargasto.entities;

import java.time.LocalDateTime;
import java.util.List;

public class GastoTransportePublico extends Despesa {
    private String tipoTransportePublico;
    private List<GastoTransportePublico> gastosComTransportePublico;

    public GastoTransportePublico(String tipoTransportePublico, List<GastoTransportePublico> gastosComTransportePublico) {
        this.tipoTransportePublico = tipoTransportePublico;
        this.gastosComTransportePublico = gastosComTransportePublico;
    }

    public GastoTransportePublico(Integer idDoGasto, String nome, Double valor, LocalDateTime data, String tipoDeGasto, String tipoTransportePublico, List<GastoTransportePublico> gastosComTransportePublico) {
        super(idDoGasto, nome, valor, data, tipoDeGasto);
        this.tipoTransportePublico = tipoTransportePublico;
        this.gastosComTransportePublico = gastosComTransportePublico;
    }

    public String getTipoTransportePublico() {
        return tipoTransportePublico;
    }

    public void setTipoTransportePublico(String tipoTransportePublico) {
        this.tipoTransportePublico = tipoTransportePublico;
    }

    public List<GastoTransportePublico> getGastosComTransportePublico() {
        return gastosComTransportePublico;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tipo de Transporte = ").append(tipoTransportePublico).append("\n");
        return sb.toString();
    }
}

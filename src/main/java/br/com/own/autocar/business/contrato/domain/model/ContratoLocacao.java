package br.com.own.autocar.business.contrato.domain.model;

import br.com.own.autocar.business.cliente.domain.model.Cliente;
import br.com.own.autocar.business.veiculo.domain.model.Veiculo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class ContratoLocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contrato_id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @Column(name = "data_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEfetivacao;

    @Column(name = "data_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicio;

    @Column(name = "data_fim")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFim;

}

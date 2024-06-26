package com.imrob.locadoraveiculos.repositories.deprecated;

import com.imrob.locadoraveiculos.config.DatabaseConfig;
import com.imrob.locadoraveiculos.entities.Locacao;
import org.springframework.jdbc.core.simple.JdbcClient;

import java.time.LocalDateTime;
import java.util.List;
@Deprecated
public class LocacaoRepository {
    private final JdbcClient jdbcClient;

    public LocacaoRepository() {
        this.jdbcClient = DatabaseConfig.getConnection();
    }

    public List<Locacao> findAll() {
        return jdbcClient
                .sql("SELECT * FROM locacao")
                .query(Locacao.class)
                .list();
    }

    public Locacao findBy(Long id) {
        return jdbcClient
                .sql("SELECT * FROM locacao WHERE id = :id")
                .param("id", id)
                .query(Locacao.class)
                .single();
    }

    public Locacao findByClientName (String name) {
        return jdbcClient
                .sql("SELECT * FROM locacao WHERE name LIKE %:name%")
                .param("name", name)
                .query(Locacao.class)
                .single();
    }

    public void save(Locacao locacao) {
        String sql = """
                     INSERT INTO locacao (segurado_id, carro_id, cliente_id, datalocacao, datadevolucao,
                     datadevolvida, valordesconto, valor, valortotal)
                     VALUES (:seg, :car, :client, :dataloca, :datadevolucao, :datadevolvida, :vdesc,
                     :valor, :vtotal)
                     """;
        jdbcClient
                .sql(sql)
                .param("seg", locacao.getSeguradora_id())
                .param("car", locacao.getCarro_id())
                .param("client", locacao.getCliente_id())
                .param("dataloca", locacao.getDatalocacao())
                .param("datadevolucao", locacao.getDatadevolucao())
                .param("datadevolvida", locacao.getDatadevolvida())
                .param("vdesc", locacao.getValordesconto())
                .param("valor", locacao.getValor())
                .param("vtotal", locacao.getValorTotal())
                .update();
    }

    public void delete(Long id) {
        jdbcClient.sql("DELETE FROM locacao WHERE id = :id")
                .param("id", id).update();
    }

    public void update(Locacao locacao) {
        String sql = """
                     UPDATE locacao SET
                     seguradora_id = :seg,
                     carro_id = :car,
                     cliente_id = :client,
                     datalocacao = :dataloca,
                     datadevolucao = :datadevolucao,
                     datadevolvida = :datadevolvida,
                     valordesconto = :vdesc,
                     valor = :valor,
                     valortotal = :vtotal
                     """;
        jdbcClient
                .sql(sql)
                .param("seg", locacao.getSeguradora_id())
                .param("car", locacao.getCarro_id())
                .param("client", locacao.getCliente_id())
                .param("dataloca", locacao.getDatalocacao())
                .param("datadevolucao", locacao.getDatadevolucao())
                .param("datadevolvida", locacao.getDatadevolvida())
                .param("vdesc", locacao.getValordesconto())
                .param("valor", locacao.getValor())
                .param("vtotal", locacao.getValorTotal())
                .update();
    }

    public List<Locacao> findByEntreDatas(LocalDateTime dataInicio, LocalDateTime dataFinal) {
        return jdbcClient
                .sql("SELECT * FROM locacao WHERE data_locacao BETWEEN :dataInicio AND :dataFinal")
                .param("dataInicio", dataInicio)
                .param("dataFinal", dataFinal)
                .query(Locacao.class)
                .list();
    }
}

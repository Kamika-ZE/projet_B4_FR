package com.dummy.myerp.consumer.dao.impl.db.rowmapper.comptabilite;

import com.dummy.myerp.model.bean.comptabilite.SequenceEcritureComptable;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SequenceEcritureComptableRM implements RowMapper<SequenceEcritureComptable> {

    @Override
    public SequenceEcritureComptable mapRow(ResultSet rs, int pRowNum) throws SQLException {
        SequenceEcritureComptable sequence = new SequenceEcritureComptable();
        sequence.setJournalCode(rs.getString("journal_code"));
        sequence.setAnnee(rs.getInt("annee"));
        sequence.setDerniereValeur(rs.getInt("derniere_valeur"));

        return sequence;
    }
}

package br.com.fiap.smarthome.report;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReportRepositoryProc {

    private final JdbcTemplate jdbcTemplate;

    public ReportRepositoryProc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Report saveReport(Report report) {
        String sql = "{call PKG_REPORT.INSERT_REPORT(?, ?, ?, ?, ?, ?)}";
        jdbcTemplate.update(sql,
                report.getUser().getUserId(),
                report.getStartDate(),
                report.getEndDate(),
                report.getTotalEnergy(),
                report.getTotalCost(),
                report.getConsumptionDescription()
        );
        return report;
    }
}


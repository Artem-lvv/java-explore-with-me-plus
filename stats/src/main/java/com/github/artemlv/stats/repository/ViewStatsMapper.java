package com.github.artemlv.stats.repository;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.yandex.practicum.generated.model.dto.ViewStats;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ViewStatsMapper implements RowMapper<ViewStats> {
    @Override
    public ViewStats mapRow(ResultSet rs, int rowNum) throws SQLException {
        ViewStats viewStats = new ViewStats();
        viewStats.setApp(rs.getString("app"));
        viewStats.setUri(rs.getString("uri"));
        viewStats.setHits(rs.getLong("hits"));
        return viewStats;
    }
}

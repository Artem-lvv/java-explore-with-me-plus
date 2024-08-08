package com.github.artemlv.stats.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import ru.yandex.practicum.generated.api.HitApi;
import ru.yandex.practicum.generated.api.StatsApi;
import ru.yandex.practicum.generated.model.dto.EndpointHitDTO;
import ru.yandex.practicum.generated.model.dto.ViewStatsDTO;

public class StatsController implements StatsApi, HitApi {

    @Override
    public ResponseEntity<List<ViewStatsDTO>> getStats(String start, String end, List<String> uris, Boolean unique) {
        return null;
    }

    @Override
    public ResponseEntity<Void> hit(EndpointHitDTO endpointHitDTO) {
        return null;
    }
}

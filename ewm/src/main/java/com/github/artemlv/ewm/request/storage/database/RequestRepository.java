package com.github.artemlv.ewm.request.storage.database;

import com.github.artemlv.ewm.request.model.Request;
import com.github.artemlv.ewm.state.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findAllByRequesterId(final long userId);

    int countByEventIdAndStatus(final long id, final State state);
}

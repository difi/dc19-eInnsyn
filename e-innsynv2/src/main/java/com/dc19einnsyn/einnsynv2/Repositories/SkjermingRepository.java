package com.dc19einnsyn.einnsynv2.Repositories;

import com.dc19einnsyn.einnsynv2.Models.Skjerming;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface SkjermingRepository extends CrudRepository<Skjerming, Long> {
    Set<Skjerming> findByTilgangsrestriksjon(String tilgangsrestriksjon);
    Set<Skjerming> findBySkjermingshjemmel (String skjermingshjemmel);
    Set<Skjerming> findBySkjermingMetadata (String skjermingMetadata);
    Set<Skjerming> findBySkjermingDokument (String skjermingDokument);
    Set<Skjerming> findBySkjermingsvarighet (String skjermingsvarighet);
    Set<Skjerming> findBySkjemringOpphoererData (String skjermingOpphoererData);
}

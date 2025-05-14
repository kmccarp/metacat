package com.netflix.metacat.metadata.store.data.repositories;

import java.util.Optional;

import com.netflix.metacat.common.QualifiedName;
import com.netflix.metacat.metadata.store.data.entities.DefinitionMetadataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The DefinitionMetadata entity repository.
 */
@Repository
public interface DefinitionMetadataRepository extends JpaRepository<DefinitionMetadataEntity, String> {
    /**
     * Find a definition metadata entity using the given QualifiedName.
     *
     * @param name The QualifiedName of the entity.
     * @return The definition metadata entity.
     */
    Optional<DefinitionMetadataEntity> findByName(QualifiedName name);
}

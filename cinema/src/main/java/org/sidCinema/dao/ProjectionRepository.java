package org.sidCinema.dao;

import org.sidCinema.entities.Cinema;
import org.sidCinema.entities.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@RepositoryRestResource
@CrossOrigin("*")

public interface ProjectionRepository extends JpaRepository<Projection, Long>{

}

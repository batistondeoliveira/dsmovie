package com.elielbatiston.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elielbatiston.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

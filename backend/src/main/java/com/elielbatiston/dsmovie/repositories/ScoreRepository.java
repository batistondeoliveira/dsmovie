package com.elielbatiston.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elielbatiston.dsmovie.entities.Score;
import com.elielbatiston.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}

package com.gamefiles.rpggame.repository;

import com.gamefiles.rpggame.model.enemy.Enemy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnemyRepository extends CrudRepository<Enemy, Integer> {
}

package com.gamefiles.rpggame.service;


import com.gamefiles.rpggame.encounter.Encounter;
import com.gamefiles.rpggame.model.enemy.Enemy;
import com.gamefiles.rpggame.repository.EnemyRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EnemyService {

    private final EnemyRepository enemyRepository;

    private Encounter encounter;

    public EnemyService(EnemyRepository enemyRepository) {
        this.enemyRepository = enemyRepository;
    }

    public Enemy enemyEncounterMatch(Integer enemyId) {

        //enemyId = encounter.getEnemyType();

        final Optional<Enemy> enemyOptional = enemyRepository.findById(enemyId);

        if(enemyOptional.isPresent()) {
            Enemy enemyMatched = enemyOptional.get();
            System.out.println(enemyMatched.getName());

            return enemyMatched;
        }

        return null;
    }

}

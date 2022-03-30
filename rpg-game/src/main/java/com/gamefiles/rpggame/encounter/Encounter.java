package com.gamefiles.rpggame.encounter;

import com.gamefiles.rpggame.model.enemy.Enemy;
import com.gamefiles.rpggame.playercharacter.PlayerCharacter;
import com.gamefiles.rpggame.enemy.Enemies;
import com.gamefiles.rpggame.enemy.enemytypes.EnemyType;
import com.gamefiles.rpggame.service.EnemyService;

import java.util.Random;

public class Encounter {

    int randomEnemyType;
    Random random = new Random();
    PlayerCharacter playerCharacter = new PlayerCharacter();
    private EnemyService enemyService;
    Enemy enemyEncountered;


    public Encounter() {
        //encounterSetUp();
        System.out.println("You have " + playerCharacter.getPlayerCharacterHealth() + " health");
        System.out.println("You are fighting a " + enemyEncountered().getName());

        //enemy = enemyType.getEnemy();

        //playerCharacter.getPlayerCharacterHealth() -

        }

    public void encounterSetUp(){
        enemyEncountered();
    }

    public int generateRandomEnemy(){
        randomEnemyType = random.nextInt(2);
        return randomEnemyType;
    }

    public Enemy enemyEncountered(){
        enemyEncountered = enemyService.enemyEncounterMatch(generateRandomEnemy());
        return enemyEncountered;
    }

}

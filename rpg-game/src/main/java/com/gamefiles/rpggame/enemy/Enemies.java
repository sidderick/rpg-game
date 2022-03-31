package com.gamefiles.rpggame.enemy;

import com.gamefiles.rpggame.enemy.enemytypes.EnemyType;

import static com.gamefiles.rpggame.enemy.enemytypes.EnemyType.GOBLIN;

public class Enemies {

    int enemyHealth;
    int enemyDamage;
    EnemyType enemyType;

    public Enemies() {
    /*    if (enemyType == GOBLIN){
            return goblin();

        }*/

    }

    public void goblin()  {
        enemyHealth = 10;
        enemyDamage = 2;

    }
}

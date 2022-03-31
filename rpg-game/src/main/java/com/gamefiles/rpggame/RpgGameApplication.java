package com.gamefiles.rpggame;

import com.gamefiles.rpggame.encounter.Encounter;
import com.gamefiles.rpggame.model.enemy.Enemy;
import com.gamefiles.rpggame.repository.EnemyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RpgGameApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(RpgGameApplication.class, args);

		EnemyRepository enemyRepository =
				configurableApplicationContext.getBean(EnemyRepository.class);


		new Encounter();
	}

}

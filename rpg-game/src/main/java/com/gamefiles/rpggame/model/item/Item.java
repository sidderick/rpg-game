package com.gamefiles.rpggame.model.item;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Item{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;
        private int healthValue;

        public Item(String name, int healthValue) {
            this.name = name;
            this.healthValue = healthValue;
        }


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealthValue() {
            return healthValue;
        }

        public void setHealthValue(int healthValue) {
            this.healthValue = healthValue;
        }
}

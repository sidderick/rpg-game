package com.gamefiles.rpggame.repository;

import com.gamefiles.rpggame.model.item.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

}

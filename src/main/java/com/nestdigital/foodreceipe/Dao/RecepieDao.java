package com.nestdigital.foodreceipe.Dao;

import com.nestdigital.foodreceipe.Model.RecepieModel;
import org.springframework.data.repository.CrudRepository;

public interface RecepieDao extends CrudRepository<RecepieModel,Integer> {
}

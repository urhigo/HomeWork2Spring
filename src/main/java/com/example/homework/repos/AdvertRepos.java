package com.example.homework.repos;

import com.example.homework.models.AdvertModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepos extends CrudRepository<AdvertModel, Integer> {
}

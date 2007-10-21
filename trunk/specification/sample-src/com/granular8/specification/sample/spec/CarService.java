package com.granular8.specification.sample.spec;

import com.granular8.specification.sample.domain.Car;

import java.util.Collection;

public interface CarService {
  void setRepository(CarRepository repository);

  Collection<Car> findCandidateCars();
}
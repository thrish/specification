package com.granular8.specification.nospec;

import com.granular8.specification.sample.domain.Car;

import java.util.Collection;

public interface CarRepository {
  public Collection<Car> findAllCarsInStock();
}
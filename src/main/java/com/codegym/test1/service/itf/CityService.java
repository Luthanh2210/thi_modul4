package com.codegym.test1.service.itf;

import com.codegym.test1.model.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CityService extends serviceInterface<City>{
    Page<City> findAllByName(Pageable pageable,String name);
}

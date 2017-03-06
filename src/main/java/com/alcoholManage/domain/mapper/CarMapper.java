package com.customer.domain.mapper;

import com.customer.domain.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hpf on 2017/2/6.
 */
@Repository
public interface CarMapper {

    public List<Car> getCarAllByUserId();



}

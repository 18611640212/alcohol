package com.alcoholManage.domain.mapper;

import com.alcoholManage.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hpf on 2017/2/7.
 */
@Repository
public interface CustomerMapper {

    public List<Customer> getCustomersByUserId(String userId);


}

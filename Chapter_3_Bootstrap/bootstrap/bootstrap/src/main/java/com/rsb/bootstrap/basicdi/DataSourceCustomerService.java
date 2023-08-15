package com.rsb.bootstrap.basicdi;

import com.rsb.bootstrap.services.BaseCustomerService;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class DataSourceCustomerService extends BaseCustomerService {

    DataSourceCustomerService(DataSource ds) {
        super((JdbcTemplate) ds);
    }
}

package com.rsb.bootstrap.hardcoded;

import com.rsb.bootstrap.services.BaseCustomerService;
import com.rsb.bootstrap.utils.DataSourceUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

class DevelopmentOnlyCustomerService extends BaseCustomerService {

    DevelopmentOnlyCustomerService() {
        super((JdbcTemplate) buildDataSource());
    }

    private static DataSource buildDataSource() { // <1>
        var dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
        return DataSourceUtils.initializeDdl(dataSource);
    }

}
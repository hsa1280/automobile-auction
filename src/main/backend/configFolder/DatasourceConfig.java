package configFolder;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.mpilone.jdbc.PoolDataSourceBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    private String url = "jdbc:mysql://localhost:3306/mysql";
    private String userName = "root";
    private String passWord = "root";

    @Bean
    public PoolDataSourceBeanPostProcessor poolDataSourceBeanPostProcessor() {
        return new PoolDataSourceBeanPostProcessor();
    }

    @Bean
    public DataSource dataSource() throws Exception {

        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setPassword(passWord);
        dataSource.setURL(url);
        dataSource.setUser(userName);

        return dataSource;

    }

}

package edu.gdut.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus 插件配置
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * 逻辑删除插件
     */
    @Bean
    public ISqlInjector injector() {
        return new LogicSqlInjector();
    }

    /**
     * 分页查询插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}

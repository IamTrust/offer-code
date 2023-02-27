package edu.gdut.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * MybatisPlus自动填充配置
 */
@Component
public class MybatisPlusMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createAt", new Date(), metaObject);
        this.setFieldValByName("updateAt", new Date(), metaObject);
        this.setFieldValByName("isDeleted", 0, metaObject);   // 逻辑删除
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateAt", new Date(), metaObject);
    }
}

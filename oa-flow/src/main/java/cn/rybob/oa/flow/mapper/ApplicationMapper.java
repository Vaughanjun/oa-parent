package cn.rybob.oa.flow.mapper;

import cn.rybob.oa.flow.model.Application;

public interface ApplicationMapper {
    void create(Application app);

    void delete(Long id);

    Application findById(Long id);
}

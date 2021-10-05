package cn.rybob.oa.flow.service;

import cn.rybob.oa.flow.model.Application;

public interface ApplicationService {
    void create(Application app);

    void delete(Long id);

    Application findById(Long id);
}

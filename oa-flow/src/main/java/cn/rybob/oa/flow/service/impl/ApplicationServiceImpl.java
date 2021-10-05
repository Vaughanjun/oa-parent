package cn.rybob.oa.flow.service.impl;

import cn.rybob.oa.flow.mapper.ApplicationMapper;
import cn.rybob.oa.flow.model.Application;
import cn.rybob.oa.flow.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ApplicationService")
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationMapper applicationMapper;

    public void create(Application app) {
        applicationMapper.create(app);
    }

    public void delete(Long id) {
        applicationMapper.delete(id);
    }

    public Application findById(Long id) {
        return applicationMapper.findById(id);
    }
}

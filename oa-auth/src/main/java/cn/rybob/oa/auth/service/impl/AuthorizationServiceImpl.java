package cn.rybob.oa.auth.service.impl;

import cn.rybob.oa.auth.mapper.AuthorizationMapper;
import cn.rybob.oa.auth.model.Authorization;
import cn.rybob.oa.auth.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AuthorizationService")
public class AuthorizationServiceImpl implements AuthorizationService {
    @Autowired
    private AuthorizationMapper authorizationMapper;

    public void authorize(Authorization authorization) {
        authorizationMapper.authorize(authorization);
    }

    public Authorization findById(Long id) {
        return authorizationMapper.findById(id);
    }

    public void unauthorize(Long id) {
        authorizationMapper.unauthorize(id);
    }
}

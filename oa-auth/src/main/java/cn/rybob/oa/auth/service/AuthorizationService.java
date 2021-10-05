package cn.rybob.oa.auth.service;

import cn.rybob.oa.auth.model.Authorization;

public interface AuthorizationService {
    void authorize(Authorization authorization);

    Authorization findById(Long id);

    void unauthorize(Long id);
}

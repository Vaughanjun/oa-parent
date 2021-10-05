package cn.rybob.oa.auth;

import cn.rybob.oa.auth.model.Authorization;
import cn.rybob.oa.auth.service.AuthorizationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(locations={"classpath:application-auth.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorizationServiceTest {

    @Autowired
    private AuthorizationService authorizationService;

    @Test
    public void testAuthorize() {
        Authorization authorization = Authorization.builder()
                .employeeId(1L)
                .roleId(1L)
                .build();
        authorizationService.authorize(authorization);
        assertEquals(true, authorization.getId() > 0L);
    }

    @Test
    public void testFindById(){
        Authorization authorization = Authorization.builder()
                .employeeId(2L)
                .roleId(2L)
                .build();
        authorizationService.authorize(authorization);
        Authorization auth = authorizationService.findById(authorization.getId());
        assertEquals(true,auth != null);
    }

    @Test
    public void testUnauthorization(){
        Authorization authorization = Authorization.builder()
                .employeeId(3L)
                .roleId(3L)
                .build();
        authorizationService.authorize(authorization);
        authorizationService.unauthorize(authorization.getId());
        Authorization auth = authorizationService.findById(authorization.getId());
        assertEquals(true,auth == null);
    }
}

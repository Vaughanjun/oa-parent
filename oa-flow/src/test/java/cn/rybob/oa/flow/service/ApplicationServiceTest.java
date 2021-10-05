package cn.rybob.oa.flow.service;

import cn.rybob.oa.flow.model.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(locations={"classpath:src/main/profiles/dev/application-flow.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationServiceTest {

    @Autowired
    private ApplicationService applicationService;

    @Test
    public void testCreate() {
        Application app = Application.builder()
                .employeeId(1L)
                .days(5L)
                .build();
        applicationService.create(app);
        assertEquals(true, app.getId() > 0L);
    }

    @Test
    public void testDelete() {
        Application app = Application.builder()
                .employeeId(2L)
                .days(5L)
                .build();
        applicationService.create(app);
        applicationService.delete(app.getId());
        Application application = applicationService.findById(app.getId());
        assertEquals(true, application == null);
    }

    @Test
    public void testFindById() {
        Application app = Application.builder()
                .employeeId(3L)
                .days(5L)
                .build();
        applicationService.create(app);
        Application _app = applicationService.findById(app.getId());
        assertEquals(true, _app != null);
    }
}

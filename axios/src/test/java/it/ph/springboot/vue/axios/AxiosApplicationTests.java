package it.ph.springboot.vue.axios;

import it.ph.springboot.vue.axios.controller.ClassController;
import it.ph.springboot.vue.axios.model.ClassModel;
import it.ph.springboot.vue.axios.service.ClassServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = {AxiosApplication.class})
class AxiosApplicationTests {

    @Autowired
    private ClassController classController;
    @Autowired
    private ClassServiceImpl classServiceImpl;

    @Test
    public void queryClass() {
        List<ClassModel> classModels = classController.queryModel();
        System.out.println(classModels);
    }

    @Test
    public void deleteClass() {
        classController.deletaClassId(21);

    }

    @Test
    void deledaeClass() {
        classServiceImpl.deledaeClass(1);
        //我也修改了代码
    }

    void updetaClass() {
        ClassModel classModel = new ClassModel();
        classServiceImpl.updetaClass(classModel);
    }
}

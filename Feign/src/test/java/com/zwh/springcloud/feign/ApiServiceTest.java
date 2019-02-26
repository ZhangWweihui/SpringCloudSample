package com.zwh.springcloud.feign;

import com.zwh.springcloud.feign.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = {FeignApplication.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ApiServiceTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void testInfo(){
        for(int i=0; i<6; i++){
            try {
                System.out.println(apiService.info());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

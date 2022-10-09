package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.service.AnimeTest01;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_first_aop_ioc
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-09 16:24:48
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class TestAnime01 {

    @Test
    public void testAno01(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        AnimeTest01 bean = ac.getBean(AnimeTest01.class);

        bean.testPrint();


    }

}

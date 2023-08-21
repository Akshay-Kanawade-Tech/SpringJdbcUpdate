package org.mahagan.software.service.test;

import org.mahagan.software.service.dao.ProjectDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        ProjectDao projectDao = applicationContext.getBean("projectDao", ProjectDao.class);
        int Count = projectDao.updateProjects(1, "Osaka Hospital");
        System.out.println("The New Updated entry is:" +Count);
    }
}
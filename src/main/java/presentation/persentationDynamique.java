package presentation;

import dao.IDao;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class persentationDynamique {
    public static void main(String[] args) throws Exception{
//        Scanner scanner = new Scanner(new File("config.txt"));
//
//        String daoClassName = scanner.nextLine();
//        Class cDao = Class.forName(daoClassName);
//        IDao dao = (IDao) cDao.getConstructor().newInstance();
//      //  System.out.println(dao.getData());
//
//        String metierClassName = scanner.nextLine();
//        Class cmetier = Class.forName(metierClassName);
//        IMetier metier = (IMetier) cmetier.getConstructor().newInstance();
//
//        Method setDao = cmetier.getDeclaredMethod("setDao",IDao.class);
//        setDao.invoke(metier,dao);
//
//        System.out.println("Resultat => "+metier.calcul());

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = context.getBean(IMetier.class);
       // IMetier metier =(IMetier) context.getBean("metier");
        System.out.println("res = "+ metier.calcul());

    }

}

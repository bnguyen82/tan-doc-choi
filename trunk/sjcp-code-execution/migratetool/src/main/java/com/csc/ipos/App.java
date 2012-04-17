package com.csc.ipos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       	ApplicationContext context = 
        		new ClassPathXmlApplicationContext("spring.xml");
     
            JdbcCustomerDAO customerDAO = (JdbcCustomerDAO) context.getBean("customerDAO");
            Customer customer = new Customer(3, "bao",34);
//            customerDAO.insert(customer);
            customerDAO.searchByName("bao");
     
            System.out.println(customer);
    }
}

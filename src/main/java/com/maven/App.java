package com.maven;

import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args)  {
        try {
            Tomcat tomcat = new Tomcat();
            tomcat.setPort(8080);
            tomcat.addWebapp("localhost", "src/main/java/com");
            tomcat.start();
            tomcat.getServer().await();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
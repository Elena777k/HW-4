package org.example;


import javax.management.*;
import java.lang.management.ManagementFactory;

public class App {
    private static MBeanServer madeMBeanServer() throws NotCompliantMBeanException, MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        StandardMBean mbean = new StandardMBean(new MyMBeanImpl(), MyMBean.class);

        ObjectName mbeanName = new ObjectName("com.example:type=MyMbean");

        mbs.registerMBean(mbean, mbeanName);
        return mbs;
    }

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer mbs = madeMBeanServer();
        Converter converter = new Converter();
        converter.startApp();


    }
}

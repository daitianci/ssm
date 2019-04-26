package com.honor.ssm.webservice.impl;

import com.honor.ssm.webservice.Greeting;

import javax.jws.WebService;
import java.util.Calendar;

@WebService(endpointInterface="com.honor.ssm.webservice.Greeting",serviceName = "Greeting")
public class GreetingImpl implements Greeting {
    public String greeting(String userName) {
        return "Hello " + userName + ", currentTime is "
                + Calendar.getInstance().getTime();
    }
}

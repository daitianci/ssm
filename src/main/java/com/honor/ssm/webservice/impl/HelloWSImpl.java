package com.honor.ssm.webservice.impl;

import com.honor.ssm.webservice.HelloWS;

import javax.jws.WebService;
import java.util.Calendar;

@WebService
public class HelloWSImpl implements HelloWS {
    public String greeting(String userName) {
        return "Hello " + userName + ", currentTime is "
                + Calendar.getInstance().getTime();
    }
}

package com.hotnews.dwr;

import org.directwebremoting.annotations.Param;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.stereotype.Service;

@Service(value = "LoginDWR")
@RemoteProxy(
		name = "LoginDWR",
		creator = SpringCreator.class,
		creatorParams = @Param(name = "beanName", value = "LoginDWR")
)
public class LoginDWR{

}

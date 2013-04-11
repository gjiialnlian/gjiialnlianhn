package com.melbourneit.usermanagement.service.myaccount;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import com.melbourneit.usermanagement.client.myaccount.MyAccountVO;

public class MyAccountService extends Service {

    public final static QName SERVICE = new QName(MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, "MyAccountService");
    public final static QName MyAccountServiceHttpPort = new QName(MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, "MyAccountServiceHttpPort");
	
    public MyAccountService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyAccountService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyAccountServicePortType getHttpPort() {
        return super.getPort(MyAccountServiceHttpPort, MyAccountServicePortType.class);
    }

    public MyAccountServicePortType getServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(MyAccountServiceHttpPort, MyAccountServicePortType.class, features);
    }

}

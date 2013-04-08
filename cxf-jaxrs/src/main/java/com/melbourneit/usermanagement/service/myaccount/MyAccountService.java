package com.melbourneit.usermanagement.service.myaccount;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import com.melbourneit.usermanagement.client.myaccount.MyAccountVO;

public class MyAccountService extends Service {

    public final static QName SERVICE = new QName(MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, "MyAccountService");
    public final static QName MyAccountServiceHttpPort = new QName(MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, "MyAccountServiceHttpPort");
	private static final String WSDL_RESOURCE_MAP  	= "com.nws.resources.environment";
    private static ResourceBundle wsdlLoc = null;
    public static URL WSDL_LOCATION;
	
	static {
		try {
			wsdlLoc = ResourceBundle.getBundle(WSDL_RESOURCE_MAP);
			String resourceMap = wsdlLoc.getString("wsdl.dir");
			
			File file = new File(resourceMap);

			WSDL_LOCATION = new URL(file.toURI().toURL()+"/MyAccountService.wsdl");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

    public MyAccountService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyAccountService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyAccountService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MyAccountServicePortType getHttpPort() {
        return super.getPort(MyAccountServiceHttpPort, MyAccountServicePortType.class);
    }

    public MyAccountServicePortType getServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(MyAccountServiceHttpPort, MyAccountServicePortType.class, features);
    }

}

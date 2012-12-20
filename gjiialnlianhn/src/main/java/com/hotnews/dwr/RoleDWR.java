package com.hotnews.dwr;

import java.util.List;
import org.directwebremoting.annotations.Param;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.SpringCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotnews.bean.RoleBean;
import com.hotnews.service.role.RoleService;


@Service(value = "RoleDWR")
@RemoteProxy(
		name = "RoleDWR",
		creator = SpringCreator.class,
		creatorParams = @Param(name = "beanName", value = "RoleDWR")
)
public class RoleDWR{
	
	@Autowired
	private RoleService roleService;
	
	@RemoteMethod
	public List<RoleBean> getAll(){	
		return roleService.getAll();
	}
}

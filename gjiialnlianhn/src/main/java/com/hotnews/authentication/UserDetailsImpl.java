package com.hotnews.authentication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = -2502976220060750855L;
	
	private String username;
	private String roleId;
	private String password;
	private boolean enabled;

	public UserDetailsImpl() {}
	
	public UserDetailsImpl(String username, String roleId, String password, boolean enabled) {
		this.username=username;
		this.password=password;
		this.enabled=enabled;
		this.roleId=roleId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Collection<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		List<String> permissions = new ArrayList<String>();
		permissions.add(this.roleId);
		authorities = AuthorityUtils.createAuthorityList(permissions.toArray(new String[0]));					
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
package com.mouritech.springbootsecuritywithroles_practice.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.mouritech.springbootsecuritywithroles_practice.entity.User;



public class UserDetailsImpl implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private boolean isActive;
	private List<GrantedAuthority> authorities;



	public UserDetailsImpl(User user) {
		super();
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.isActive = user.isActive();
		this.authorities = Arrays.stream(user.getRoles().split(","))
									.map(SimpleGrantedAuthority::new)
									.collect(Collectors.toList());
	}

	public UserDetailsImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return isActive;
	}

}
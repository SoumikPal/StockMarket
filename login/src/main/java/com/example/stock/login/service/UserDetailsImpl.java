package com.example.stock.login.service;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.stock.login.model.User;


	@Service
	public class UserDetailsImpl implements UserDetails {

		private static final long serialVersionUID = 1L;

		private String userName;
		private String password;
		private int confirmed;
		private List<GrantedAuthority> authorities;

		public UserDetailsImpl(User user) {
			this.userName = user.getUserName();
			this.password = user.getPassword();
			this.confirmed = user.getConfirmed();
			this.authorities = Arrays.stream(user.getUserType().split(","))
					.map(SimpleGrantedAuthority::new)
					.collect(Collectors.toList());
		}

		public UserDetailsImpl() {}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return authorities;
		}

		@Override
		public String getPassword() {
			return password;
		}

		@Override
		public String getUsername() {

			return userName;
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

		@Override
		public boolean isEnabled() {
			if(confirmed==1)
			return true;
			else
				return false;
		}

	}



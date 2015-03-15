package com.simplelistapp.security;

import com.simplelistapp.security.SecurityProvider;

public class DummySecurityProvider implements SecurityProvider {

	public boolean conditionsChecked() {
		return true;
	}

}

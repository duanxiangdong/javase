package com.test.security;

import java.security.Provider;
import java.security.Security;

public class TestJce {
	public static void main(String[] args) {
		Provider[] providers = Security.getProviders();
		for (Provider provider : providers) {
			System.out.println("Provider name: " + provider.getName());
			System.out.println("Provider information: " + provider.getInfo());
			System.out.println("Provider version: " + provider.getVersion());
		}
	}
}

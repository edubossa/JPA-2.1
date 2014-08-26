package br.com.ews.entity;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

public class UsuarioListener {
	
	@PrePersist 
	public void logPrePersist(Object obj) {
		System.out.println("Callback Listener PrePersist " + ((Usuario)obj).toString());
	}
	
	@PostPersist
	public void logPostPersist(Object obj) {
		System.out.println("Callback Listener PostPersist " + ((Usuario)obj).toString());
	}
	
	@PostLoad
	public void logPostLoad(Object obj) {
		System.out.println("Callback Listener PostLoad " + ((Usuario)obj).toString());
	}
	
}
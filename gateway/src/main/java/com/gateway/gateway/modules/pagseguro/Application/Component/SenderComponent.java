package com.gateway.gateway.modules.pagseguro.Application.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gateway.gateway.modules.pagseguro.Application.Dtos.SenderDTO;

import br.com.uol.pagseguro.api.common.domain.builder.SenderBuilder;

@Component
public class SenderComponent {

	@Autowired
	private PhoneComponent phoneComponent;
	
	public SenderBuilder toSenderBuilder(SenderDTO sender) {
		return new  SenderBuilder()
				.withEmail(sender.getEmail())
				.withName(sender.getName())
				.withCPF(sender.getCpf())
				.withHash("abc123")
				.withPhone(
						phoneComponent.toPhoneBuilder(sender.getPhone()));
	}
}

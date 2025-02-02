package com.gateway.gateway.modules.pagseguro.Application.Component;

import org.springframework.stereotype.Component;

import com.gateway.gateway.modules.pagseguro.Application.Dtos.DocumentHolderDTO;

import br.com.uol.pagseguro.api.common.domain.builder.DocumentBuilder;

@Component
public class DocumentHolderComponent {

	public DocumentBuilder toDocumentBuilder(DocumentHolderDTO document) {
		return new DocumentBuilder()
				.withType(document.getType())
				.withValue(document.getValue());
	}
}

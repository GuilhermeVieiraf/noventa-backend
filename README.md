# Backend de Serviços - Noventa

![Status do Projeto](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-21-blue?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.4-green?style=for-the-badge&logo=spring)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red?style=for-the-badge&logo=apachemaven)

## Visão Geral

Este projeto constitui o serviço de backend principal para o ecossistema digital da Noventa. Ele fornece a lógica de negócio central e os endpoints de API necessários para suportar as interações nas propriedades web da empresa.

Construído sobre uma base robusta e escalável, o serviço orquestra o fluxo de dados, garante a segurança das transações e se integra com serviços internos e de terceiros, servindo como a espinha dorsal da nossa arquitetura de serviços.

## Arquitetura e Funcionalidades

O serviço foi construído utilizando uma arquitetura de camadas para garantir a separação de responsabilidades, manutenibilidade e escalabilidade.

#### Funcionalidades Principais:
- **Endpoint de Ingestão de Dados:** Interface RESTful para o recebimento de dados.
- **Motor de Validação:** Regras de validação no lado do servidor para garantir a integridade dos dados.
- **Serviço de Notificação:** Integração com um provedor de email (SMTP) para o envio de comunicações.
- **Gerenciamento de Configuração:** Utilização de variáveis de ambiente para o gerenciamento de credenciais e configurações, alinhado com as melhores práticas de segurança (Twelve-Factor App).

## Stack Tecnológico

- **Plataforma:** Java 21 / Spring Boot 3.3.4
- **Serviços Web:** Spring Web
- **Validação:** Spring Validation
- **Utilitários:** Lombok
- **Notificação:** Spring Mail Sender
- **Build e Dependências:** Apache Maven
---
*© 2025 Noventa. Todos os direitos reservados.*

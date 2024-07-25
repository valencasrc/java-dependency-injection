Projeto que desenvolvi na formação de Especialista SpringREST da AlgaWorks. 

# java-dependency-injection

Este projeto é um exemplo de injeção de dependência em Java, utilizando interfaces e classes para notificar clientes por e-mail e SMS.

Descrição:


O projeto consiste em uma aplicação que ativa o cadastro de clientes e emite notas fiscais para produtos. A notificação é feita por meio de e-mail e SMS, utilizando classes específicas para cada tipo de notificação.

Classes e Interfaces
Client:

representa um cliente, com atributos para nome, e-mail e telefone.
Notifier: interface que define o método notify para notificar um cliente.
EmailNotification: classe que implementa a interface Notifier para notificar clientes por e-mail.
NotifierSMS: classe que implementa a interface Notifier para notificar clientes por SMS.
CustomeServiceActivation: classe que ativa o cadastro de um cliente e notifica-o por meio de um objeto Notifier.
IssueInvoiceService: classe que emite uma nota fiscal para um produto e notifica o cliente por meio de um objeto Notifier.

Exemplo de Uso:

O exemplo de uso está no método main da classe Main, que cria dois clientes, ativa seus cadastros e emite notas fiscais para produtos.

Compilação e Execução
Para compilar e executar o projeto, é necessário ter o Java Development Kit (JDK) instalado. Basta clonar o repositório, compilar as classes e executar a classe Main.

Contribuições
Contribuições são bem-vindas! Se você tiver alguma sugestão ou quiser melhorar o projeto, por favor, faça um fork do repositório e envie um pull request.

Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais informações.
